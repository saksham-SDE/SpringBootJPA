package com.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Marksheet {
    private int stud_Id;
    @Id
    private int m_Id;
    private int english;
    private int maths;
    private int hindi;
    private int sem_Id;
    private String year;

    public int getStud_Id() {
        return stud_Id;
    }

    public void setStud_Id(int stud_Id) {
        this.stud_Id = stud_Id;
    }

    public int getM_Id() {
        return m_Id;
    }

    public void setM_Id(int m_Id) {
        this.m_Id = m_Id;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getHindi() {
        return hindi;
    }

    public void setHindi(int hindi) {
        this.hindi = hindi;
    }

    public int getSem_Id() {
        return sem_Id;
    }

    public void setSem_Id(int sem_Id) {
        this.sem_Id = sem_Id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Marksheet{" +
                "stud_Id=" + stud_Id +
                ", m_Id=" + m_Id +
                ", english=" + english +
                ", maths=" + maths +
                ", hindi=" + hindi +
                ", sem_Id=" + sem_Id +
                ", year='" + year + '\'' +
                '}';
    }
}

