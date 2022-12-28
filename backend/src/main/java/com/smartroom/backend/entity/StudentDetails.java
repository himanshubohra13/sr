package com.smartroom.backend.entity;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class StudentDetails {

  private String standard;

  private String batch;

  private String dob;

  private String fullAddress;

  private String Address;

  private Long phone;

  private String motherName;

  private String fatherName;

  private String sex;

  private Integer age;

  private String familySize;

  private String parentStatus;

  private Integer motherEducation;

  private Integer fatherEducation;

  private String  motherJob;

  private String fatherJob;

  private Integer travelTime;

  private Integer studyTime;

  private Integer failures;

  private String schoolSupport;

  private String familySupport;

  private String extraPaidClasses;

  private String extraCurricularActivities;

  private String nurseryEducation;

  private String higherEducation;

  private String Internet;

  private Integer familyRelationship;

  private Integer freeTime;

  private Integer health;

  private Integer absences;

  private HashMap<String, ArrayList<Integer>> studentMarks;

  public StudentDetails() {
  }

  public StudentDetails(String standard, String batch, String dob, String fullAddress, String address, Long phone, String motherName, String fatherName, String sex, Integer age, String familySize, String parentStatus, Integer motherEducation, Integer fatherEducation, String motherJob, String fatherJob, Integer travelTime, Integer studyTime, Integer failures, String schoolSupport, String familySupport, String extraPaidClasses, String extraCurricularActivities, String nurseryEducation, String higherEducation, String internet, Integer familyRelationship, Integer freeTime, Integer health, Integer absences, HashMap<String, ArrayList<Integer>> studentMarks) {
    this.standard = standard;
    this.batch = batch;
    this.dob = dob;
    this.fullAddress = fullAddress;
    Address = address;
    this.phone = phone;
    this.motherName = motherName;
    this.fatherName = fatherName;
    this.sex = sex;
    this.age = age;
    this.familySize = familySize;
    this.parentStatus = parentStatus;
    this.motherEducation = motherEducation;
    this.fatherEducation = fatherEducation;
    this.motherJob = motherJob;
    this.fatherJob = fatherJob;
    this.travelTime = travelTime;
    this.studyTime = studyTime;
    this.failures = failures;
    this.schoolSupport = schoolSupport;
    this.familySupport = familySupport;
    this.extraPaidClasses = extraPaidClasses;
    this.extraCurricularActivities = extraCurricularActivities;
    this.nurseryEducation = nurseryEducation;
    this.higherEducation = higherEducation;
    Internet = internet;
    this.familyRelationship = familyRelationship;
    this.freeTime = freeTime;
    this.health = health;
    this.absences = absences;
    this.studentMarks = studentMarks;
  }

  public String getStandard() {
    return standard;
  }

  public void setStandard(String standard) {
    this.standard = standard;
  }

  public String getBatch() {
    return batch;
  }

  public void setBatch(String batch) {
    this.batch = batch;
  }

  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public String getFullAddress() {
    return fullAddress;
  }

  public void setFullAddress(String fullAddress) {
    this.fullAddress = fullAddress;
  }

  public String getAddress() {
    return Address;
  }

  public void setAddress(String address) {
    Address = address;
  }

  public Long getPhone() {
    return phone;
  }

  public void setPhone(Long phone) {
    this.phone = phone;
  }

  public String getMotherName() {
    return motherName;
  }

  public void setMotherName(String motherName) {
    this.motherName = motherName;
  }

  public String getFatherName() {
    return fatherName;
  }

  public void setFatherName(String fatherName) {
    this.fatherName = fatherName;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getFamilySize() {
    return familySize;
  }

  public void setFamilySize(String familySize) {
    this.familySize = familySize;
  }

  public String getParentStatus() {
    return parentStatus;
  }

  public void setParentStatus(String parentStatus) {
    this.parentStatus = parentStatus;
  }

  public Integer getMotherEducation() {
    return motherEducation;
  }

  public void setMotherEducation(Integer motherEducation) {
    this.motherEducation = motherEducation;
  }

  public Integer getFatherEducation() {
    return fatherEducation;
  }

  public void setFatherEducation(Integer fatherEducation) {
    this.fatherEducation = fatherEducation;
  }

  public String getMotherJob() {
    return motherJob;
  }

  public void setMotherJob(String motherJob) {
    this.motherJob = motherJob;
  }

  public String getFatherJob() {
    return fatherJob;
  }

  public void setFatherJob(String fatherJob) {
    this.fatherJob = fatherJob;
  }

  public Integer getTravelTime() {
    return travelTime;
  }

  public void setTravelTime(Integer travelTime) {
    this.travelTime = travelTime;
  }

  public Integer getStudyTime() {
    return studyTime;
  }

  public void setStudyTime(Integer studyTime) {
    this.studyTime = studyTime;
  }

  public Integer getFailures() {
    return failures;
  }

  public void setFailures(Integer failures) {
    this.failures = failures;
  }

  public String getSchoolSupport() {
    return schoolSupport;
  }

  public void setSchoolSupport(String schoolSupport) {
    this.schoolSupport = schoolSupport;
  }

  public String getFamilySupport() {
    return familySupport;
  }

  public void setFamilySupport(String familySupport) {
    this.familySupport = familySupport;
  }

  public String getExtraPaidClasses() {
    return extraPaidClasses;
  }

  public void setExtraPaidClasses(String extraPaidClasses) {
    this.extraPaidClasses = extraPaidClasses;
  }

  public String getExtraCurricularActivities() {
    return extraCurricularActivities;
  }

  public void setExtraCurricularActivities(String extraCurricularActivities) {
    this.extraCurricularActivities = extraCurricularActivities;
  }

  public String getNurseryEducation() {
    return nurseryEducation;
  }

  public void setNurseryEducation(String nurseryEducation) {
    this.nurseryEducation = nurseryEducation;
  }

  public String getHigherEducation() {
    return higherEducation;
  }

  public void setHigherEducation(String higherEducation) {
    this.higherEducation = higherEducation;
  }

  public String getInternet() {
    return Internet;
  }

  public void setInternet(String internet) {
    Internet = internet;
  }

  public Integer getFamilyRelationship() {
    return familyRelationship;
  }

  public void setFamilyRelationship(Integer familyRelationship) {
    this.familyRelationship = familyRelationship;
  }

  public Integer getFreeTime() {
    return freeTime;
  }

  public void setFreeTime(Integer freeTime) {
    this.freeTime = freeTime;
  }

  public Integer getHealth() {
    return health;
  }

  public void setHealth(Integer health) {
    this.health = health;
  }

  public Integer getAbsences() {
    return absences;
  }

  public void setAbsences(Integer absences) {
    this.absences = absences;
  }

  public HashMap<String, ArrayList<Integer>> getStudentMarks() {
    return studentMarks;
  }

  public void setStudentMarks(HashMap<String, ArrayList<Integer>> studentMarks) {
    this.studentMarks = studentMarks;
  }

  @Override
  public String toString() {
    return "StudentDetails{" +
            "standard='" + standard + '\'' +
            ", batch='" + batch + '\'' +
            ", dob='" + dob + '\'' +
            ", fullAddress='" + fullAddress + '\'' +
            ", Address='" + Address + '\'' +
            ", phone=" + phone +
            ", motherName='" + motherName + '\'' +
            ", fatherName='" + fatherName + '\'' +
            ", sex='" + sex + '\'' +
            ", age=" + age +
            ", familySize='" + familySize + '\'' +
            ", parentStatus='" + parentStatus + '\'' +
            ", motherEducation=" + motherEducation +
            ", fatherEducation=" + fatherEducation +
            ", motherJob='" + motherJob + '\'' +
            ", fatherJob='" + fatherJob + '\'' +
            ", travelTime=" + travelTime +
            ", studyTime=" + studyTime +
            ", failures=" + failures +
            ", schoolSupport='" + schoolSupport + '\'' +
            ", familySupport='" + familySupport + '\'' +
            ", extraPaidClasses='" + extraPaidClasses + '\'' +
            ", extraCurricularActivities='" + extraCurricularActivities + '\'' +
            ", nurseryEducation='" + nurseryEducation + '\'' +
            ", higherEducation='" + higherEducation + '\'' +
            ", Internet='" + Internet + '\'' +
            ", familyRelationship=" + familyRelationship +
            ", freeTime=" + freeTime +
            ", health=" + health +
            ", absences=" + absences +
            ", studentMarks=" + studentMarks +
            '}';
  }
}
