package com.anurag.Learning_REST_APIs.service;

import com.anurag.Learning_REST_APIs.entity.Student;

import java.util.List;

public interface StudentService
{

    Student saveStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student updateStudent(Long id, Student student);

    void deleteStudent(Long id);

}