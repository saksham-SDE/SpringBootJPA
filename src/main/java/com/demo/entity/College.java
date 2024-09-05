package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class College {
    @Id
    private int clg_Id;
    private int stud_Id;
    private String clg_Address;
    private String clg_ContactNo;
    private String college_Name;

    public int getClg_Id() {
        return clg_Id;
    }

    public void setClg_Id(int clg_Id) {
        this.clg_Id = clg_Id;
    }

    public String getClg_Address() {
        return clg_Address;
    }

    public void setClg_Address(String clg_Address) {
        this.clg_Address = clg_Address;
    }

    public String getClg_ContactNo() {
        return clg_ContactNo;
    }

    public void setClg_ContactNo(String clg_ContactNo) {
        this.clg_ContactNo = clg_ContactNo;
    }

    public String getCollege_Name() {
        return college_Name;
    }

    public void setCollege_Name(String college_Name) {
        this.college_Name = college_Name;
    }

    public int getStud_Id() {
        return stud_Id;
    }

    public void setStud_Id(int stud_Id) {
        this.stud_Id = stud_Id;
    }

    @Override
    public String toString() {
        return "College{" +
                "clg_Id=" + clg_Id +
                ", stud_Id=" + stud_Id +
                ", clg_Address='" + clg_Address + '\'' +
                ", clg_ContactNo='" + clg_ContactNo + '\'' +
                ", college_Name='" + college_Name + '\'' +
                '}';
    }
}

