package com.mahmudpractices.studentsystem.service;

import com.mahmudpractices.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();


}
