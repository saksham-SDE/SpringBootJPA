package com.demo.service;

import com.demo.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentIntService {
    public Student addStudent(Student student);
    public Optional<Student> getStudentById(int stud_Id);
    public void removeStudentById(int stud_Id);
    public List<Student> getAllStudents();
    public Student updateStudentById(int id, Student studentDetails);
}
