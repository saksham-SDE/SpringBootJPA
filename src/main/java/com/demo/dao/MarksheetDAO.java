package com.demo.dao;
import com.demo.entity.Marksheet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarksheetDAO extends JpaRepository<Marksheet,Integer> {
}
