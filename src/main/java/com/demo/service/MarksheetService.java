package com.demo.service;

import com.demo.dao.MarksheetDAO;
import com.demo.entity.Marksheet;
import com.demo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
public class MarksheetService implements MarksheetIntService{
    @Autowired
    private MarksheetDAO marksheetDAO;
    @Override
    public void addStudentMarks(Marksheet marks) {
        marksheetDAO.save(marks);
    }

    @Override
    public Optional<Marksheet> getMarksById(int stud_Id)  {
        return marksheetDAO.findById(stud_Id);
    }

    @Override
    public void deleteMarksById(int stud_Id)  {
        marksheetDAO.deleteById(stud_Id);
    }

    @Override
    public Marksheet updateMarksById(int stud_Id,Marksheet marksheetDetail) {
        Optional<Marksheet> marksheetOptional = marksheetDAO.findById(stud_Id);

        if (marksheetOptional.isPresent()) {
            Marksheet marksheet = marksheetOptional.get();
            marksheet.setEnglish(marksheetDetail.getEnglish());
            marksheet.setHindi(marksheetDetail.getHindi());
            marksheet.setMaths(marksheetDetail.getMaths());
            marksheet.setSem_Id(marksheetDetail.getSem_Id());
        }
        return marksheetDAO.save(marksheetDetail);
    }
    @Override
    public List<Marksheet> getAllMarks(){
        return marksheetDAO.findAll();
    }
}


