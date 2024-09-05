package com.demo.dao;
import com.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface StudentDAO extends JpaRepository<Student,Integer> {

}
