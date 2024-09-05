package com.demo.dao;

import com.demo.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeDAO extends JpaRepository<College,Integer> {

}
