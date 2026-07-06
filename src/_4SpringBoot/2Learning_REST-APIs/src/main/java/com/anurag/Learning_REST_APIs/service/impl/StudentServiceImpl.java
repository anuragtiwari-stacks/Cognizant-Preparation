package com.anurag.Learning_REST_APIs.service.impl;

import com.anurag.Learning_REST_APIs.entity.Student;
import com.anurag.Learning_REST_APIs.repository.StudentRepository;
import com.anurag.Learning_REST_APIs.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService
{

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student)
    {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents()
    {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id)
    {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student updateStudent(Long id, Student student)
    {
        Student existingStudent = studentRepository.findById(id).orElse(null);

        if(existingStudent != null)
        {
            existingStudent.setName(student.getName());
            existingStudent.setEmail(student.getEmail());
            existingStudent.setAge(student.getAge());
            existingStudent.setCourse(student.getCourse());

            return studentRepository.save(existingStudent);
        }

        return null;
    }

    @Override
    public void deleteStudent(Long id)
    {
        studentRepository.deleteById(id);
    }

}