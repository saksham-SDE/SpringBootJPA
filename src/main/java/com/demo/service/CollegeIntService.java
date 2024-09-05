package com.demo.service;
import com.demo.entity.*;
import org.springframework.beans.factory.ObjectProvider;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface CollegeIntService {

    public void addByCollege(College college);
    public void deleteByCollegeId(int clg_Id);
    public Optional<College> getCollegByCollegeId(int clg_Id);
    public List<College> getAllCollege();
    public College updateCollegeById(int clg_Id,College collegeDetail);

}
