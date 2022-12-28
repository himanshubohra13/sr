package com.smartroom.backend.service;

import com.smartroom.backend.entity.Teacher;

import java.util.List;

public interface AuthenticationService {

    Teacher createTeacher(Teacher teacher) throws Exception;

    List<Teacher> fetchAllTeacher() throws Exception;

    void deleteAllTeacher();

    void deleteAllStudent();
}
