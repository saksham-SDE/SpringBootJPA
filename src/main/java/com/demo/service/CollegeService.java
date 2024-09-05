package com.demo.service;
import com.demo.entity.*;
import com.demo.dao.CollegeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CollegeService implements CollegeIntService{
    @Autowired
    private CollegeDAO collegeDAO;
    @Override
    public void addByCollege(College college) {
      collegeDAO.save(college);
    }
    @Override
    public Optional<College> getCollegByCollegeId(int clg_Id){
        return collegeDAO.findById(clg_Id);
    }
    @Override
    public List<College> getAllCollege(){
        return collegeDAO.findAll();
    }
    @Override
    public void deleteByCollegeId(int clg_Id){
        collegeDAO.deleteById(clg_Id);
    }
    public College updateCollegeById(int clg_Id,College collegeDetail){
        Optional<College> collegeOptional =collegeDAO.findById(clg_Id);

        if (collegeOptional.isPresent()) {
            College college = collegeOptional.get();
            college.setCollege_Name(collegeDetail.getCollege_Name());
            college.setClg_Address(collegeDetail.getClg_Address());
            college.setClg_ContactNo(collegeDetail.getClg_ContactNo());
            college.setClg_Id(collegeDetail.getClg_Id());
            college.setStud_Id(collegeDetail.getStud_Id());

            return collegeDAO.save(college);
        }

        return null;
    }

    }


