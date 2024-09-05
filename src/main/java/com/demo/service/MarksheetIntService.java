package com.demo.service;
import com.demo.entity.Marksheet;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface MarksheetIntService {
    public void addStudentMarks(Marksheet marks) ;
    public Optional<Marksheet> getMarksById(int stud_Id) ;
    public void deleteMarksById(int stud_Id) ;
    public Marksheet updateMarksById(int stud_Id,Marksheet marksheetDetail) ;
    public List<Marksheet> getAllMarks();

}


