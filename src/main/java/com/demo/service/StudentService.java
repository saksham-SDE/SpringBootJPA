package com.demo.service;

import com.demo.dao.StudentDAO;
import com.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements StudentIntService {
    @Autowired
    private StudentDAO studentDAO;

    public StudentService(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    public Student addStudent(Student student) {
        return studentDAO.save(student);
    }

    public Optional<Student> getStudentById(int stud_Id) {
        return studentDAO.findById(stud_Id);
    }

    public void removeStudentById(int stud_Id) {
        studentDAO.deleteById(stud_Id);
    }

    public List<Student> getAllStudents() {
        return studentDAO.findAll();
    }

    public Student updateStudentById(int id, Student studentDetails) {
        Optional<Student> studentOptional = studentDAO.findById(id);

        if (studentOptional.isPresent()) {
            Student student = studentOptional.get();
            student.setFirst_Name(studentDetails.getFirst_Name());
            student.setLast_Name(studentDetails.getLast_Name());
            student.setContact_No(studentDetails.getContact_No());
            student.setAddress(studentDetails.getAddress());
            student.setClg_Id(studentDetails.getClg_Id());
            student.setSem_Id(studentDetails.getSem_Id());
            student.setYear(studentDetails.getYear());
            student.setClg_Admissionyear(studentDetails.getClg_Admissionyear());
            student.setClg_Passingyear(studentDetails.getClg_Passingyear());
            student.setCity_State(studentDetails.getCity_State());

            return studentDAO.save(student);
        }

    return null;
    }
}