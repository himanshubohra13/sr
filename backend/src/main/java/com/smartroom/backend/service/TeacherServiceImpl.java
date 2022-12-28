package com.smartroom.backend.service;

import com.smartroom.backend.email.EmailSender;
import com.smartroom.backend.entity.Student;
import com.smartroom.backend.entity.StudentDetails;
import com.smartroom.backend.exception.InvalidParameter;
import com.smartroom.backend.model.MlRequest;
import com.smartroom.backend.model.StudentModel;
import com.smartroom.backend.model.params;
import com.smartroom.backend.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.http.*;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    private final PasswordEncoder passwordEncoder;

    private final EmailSender emailSender;

    private final RestTemplate restTemplate;


    @Autowired
    TeacherServiceImpl(TeacherRepository teacherRepository, PasswordEncoder passwordEncoder, EmailSender emailSender,RestTemplate restTemplate) {
        this.teacherRepository = teacherRepository;
        this.passwordEncoder = passwordEncoder;
        this.emailSender = emailSender;
        this.restTemplate = restTemplate;

    }

    @Override
    public StudentModel createStudent(Student student) throws Exception {
        try {
            String password = student.getPassword();
            System.out.println("Student password:- " + password);
            student.setPassword(passwordEncoder.encode(password));
            StudentModel savedStudent = teacherRepository.createStudent(student);
            String emailSubject = "User Id :- " +
                    student.getStudentId() + "\n" + "Password :- " + password;
            emailSender.sendEmail(savedStudent.getEmail(),emailSubject, "SmartRoom Credentials");
            return savedStudent;
        } catch (DuplicateKeyException e) {
            throw new DuplicateKeyException("Student with this id is already created");
        }
        catch (Exception e){

            throw new Exception(e.getLocalizedMessage());
        }

    }

    @Override
    public Student updateStudent(String studentId, StudentDetails studentDetails) throws Exception {

            Student student = getStudentById(studentId);
            student.setStudentDetails(studentDetails);
            return teacherRepository.updateStudent(student);

    }

    @Override
    public List<Student> fetchAllStudent() throws Exception {
        try {
            return teacherRepository.fetchAllStudent();
        }
        catch (Exception e){
            throw new Exception(e.getLocalizedMessage());
        }
    }

    @Override
    public Integer predictResult(String studentId, String subject) throws Exception {
        Student student = getStudentById(studentId);
        HashMap<String, ArrayList<Integer>> studentMarks = student.getStudentDetails().getStudentMarks();
        if(!studentMarks.containsKey(subject) && !subject.equals("overall")){
            throw new InvalidParameter("Invalid subject,Subject not available");
        }
        else{
            ArrayList<Integer> totalMarks = new ArrayList<>();
            if(studentMarks.containsKey(subject)){
               totalMarks = studentMarks.get(subject);
            }
            else{
                totalMarks = getTotalMarks(studentMarks);
            }
            params modelParams = getModelParams(student.getStudentDetails(),totalMarks);
            try {

                return getPrediction(modelParams);
              //  return 1;
            }
            catch (Exception e){
                throw new Exception(e.getMessage());
            }
        }
    }

    @Override
    public Student getStudentById(String studentId) throws Exception {
       try {
           return teacherRepository.getStudentById(studentId);
       }
       catch (UsernameNotFoundException e){
           throw new UsernameNotFoundException("Student with id:- " + studentId +" not found");
       }
    }

    private params getModelParams(StudentDetails studentDetails, ArrayList<Integer> totalMarks) {
         params modelParams = new params();
         modelParams.setSex(studentDetails.getSex());
         modelParams.setAge(studentDetails.getAge());
         modelParams.setAddress(studentDetails.getAddress());
         modelParams.setFamsize(studentDetails.getFamilySize());
         modelParams.setPstatus(studentDetails.getParentStatus());
         modelParams.setMedu(studentDetails.getMotherEducation());
         modelParams.setFedu(studentDetails.getFatherEducation());
         modelParams.setMjob(studentDetails.getMotherJob());
         modelParams.setFjob(studentDetails.getFatherJob());
         modelParams.setTraveltime(studentDetails.getTravelTime());
         modelParams.setStudytime(studentDetails.getStudyTime());
         modelParams.setFailures(studentDetails.getFailures());
         modelParams.setSchoolsup(studentDetails.getSchoolSupport());
         modelParams.setFamsup(studentDetails.getFamilySupport());
         modelParams.setPaid(studentDetails.getExtraPaidClasses());
         modelParams.setActivities(studentDetails.getExtraCurricularActivities());
         modelParams.setNursery(studentDetails.getNurseryEducation());
         modelParams.setHigher(studentDetails.getHigherEducation());
         modelParams.setInternet(studentDetails.getInternet());
         modelParams.setFamrel(studentDetails.getFamilyRelationship());
         modelParams.setFreetime(studentDetails.getFreeTime());
         modelParams.setHealth(studentDetails.getHealth());
         modelParams.setAbsences(studentDetails.getAbsences());
         modelParams.setG1(totalMarks.get(0));
         modelParams.setG2(totalMarks.get(1));

         return modelParams;

    }

    private Integer getPrediction(params modelParams) throws Exception {
        String url = "http://localhost:80/predict";
                LinkedHashMap<String,Object> params = new LinkedHashMap<>();
        params.put("sex","M");
        params.put("age",15);
        params.put("address","U");
        params.put("famsize","LE3");
        params.put("Pstatus","T");
        params.put("Medu",4);
        params.put("Fedu",3);
        params.put("Mjob","teacher");
        params.put("Fjob","services");
        params.put("traveltime",1);
        params.put("studytime",3);
        params.put("failures",0);
        params.put("schoolsup","no");
        params.put("famsup","yes");
        params.put("paid","no");
        params.put("activities","yes");
        params.put("nursery","yes");
        params.put("higher","yes");
        params.put("internet","yes");
        params.put("famrel",4);
        params.put("freetime",4);
        params.put("health",4);
        params.put("absences",2);
        params.put("G1",15);
        params.put("G2",16);
        HttpHeaders headers = new HttpHeaders();
        headers.set("Accept","application/json");
        headers.set("Accept","text/plain");
        headers.set("Accept","/");
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setContentLength(345);
        MlRequest mlRequest = new MlRequest(params);
        HttpEntity<MlRequest> request = new HttpEntity<>(mlRequest,headers);

        System.out.println("http entity +:- " + mlRequest);
        ResponseEntity<Integer> response = restTemplate.postForEntity(url ,request , Integer.class);
        System.out.println(response);
      return 1;
    }


    private ArrayList<Integer> getTotalMarks(HashMap<String, ArrayList<Integer>> studentMarks) {
      ArrayList<Integer> totalMarks = new ArrayList<>();
      int term1 = 0, term2 = 0;
      for (Map.Entry entry : studentMarks.entrySet()){
          ArrayList<Integer> marks = (ArrayList<Integer>) entry.getValue();
          term1+=marks.get(0);
          term2+=marks.get(1);
      }
      totalMarks.add(term1);
      totalMarks.add(term2);

      return totalMarks;

    }
}
