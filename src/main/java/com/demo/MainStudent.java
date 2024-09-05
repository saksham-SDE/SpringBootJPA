package com.demo;
import com.demo.entity.College;
import com.demo.entity.Marksheet;
import com.demo.entity.Student;
import com.demo.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.demo.service.*;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.demo", "com.demo.dao"})
public class MainStudent {


    private static final Logger log = LoggerFactory.getLogger(MainStudent.class);


    public static void main(String[] args) {
        SpringApplication.run(MainStudent.class, args);
    }

    @Bean
    public CommandLineRunner bean1(StudentService studentService) {
        return args -> {
            Student s1 = new Student();
            Student s2 = new Student();
            Student s3 = new Student();
            s1.setStud_Id(7);
            s1.setFirst_Name("Viv");
            s1.setLast_Name("Richards");
            s1.setContact_No("234");
            s1.setAddress("West Indies");
            s1.setYear("2024");
            s1.setClg_Admissionyear("2022");
            s1.setClg_Passingyear("2026");
            s1.setCity_State("Bermuda");
            s2.setStud_Id(8);
            s2.setFirst_Name("Rishabh");
            s2.setLast_Name("Pant");
            s2.setContact_No("23456");
            s2.setAddress("India");
            s2.setYear("2023");
            s2.setClg_Admissionyear("2023");
            s2.setClg_Passingyear("2027");
            s2.setCity_State("MadhyaPradesh");
            s3.setStud_Id(8);
            s3.setFirst_Name("Steve");
            s3.setLast_Name("Smith");
            s3.setContact_No("253");
            s3.setAddress("Australia");
            s3.setYear("2022");
            s3.setClg_Admissionyear("2019");
            s3.setClg_Passingyear("20223");
            s3.setCity_State("Adelaide");
            log.info("Adding Students");
            studentService.addStudent(s1);
            studentService.addStudent(s2);
            studentService.addStudent(s3);
            studentService.getStudentById(2);
            log.info("Get Student Detail By Id:");
            log.info(studentService.getStudentById(2).toString());
            log.info("Get All Students:");
            for (Student student : studentService.getAllStudents()) {
                log.info(student.toString());
            }
            log.info("Remove Student:");
            studentService.removeStudentById(1);
            log.info("Update Student Detail By Id:");
            s3.setCity_State("Cape Town");
            studentService.updateStudentById(3, s3);
            log.info("Updated student with ID 3: " + studentService.getStudentById(3));

        };
    }

    @Bean
    public CommandLineRunner bean2(MarksheetService marksheetService) {
        return args -> {
            Marksheet m1 = new Marksheet();
            m1.setM_Id(23);
            m1.setStud_Id(8);
            m1.setSem_Id(31);
            m1.setEnglish(45);
            m1.setHindi(60);
            m1.setMaths(34);
            m1.setYear("Second");
            log.info("Adding marks of student:");
            marksheetService.addStudentMarks(m1);
            log.info("Get Marks of Student by Id:");
            log.info(marksheetService.getMarksById(8).toString());
            log.info("Remove student marks by Id:");
            marksheetService.deleteMarksById(3);
            log.info("Updating student marks By Id:");
            m1.setYear("First");
            log.info(marksheetService.updateMarksById(2, m1).toString());
            log.info("Get All Student Marks With Their Id:");
            log.info(marksheetService.getAllMarks().toString());
        };
    }
    @Bean
    public CommandLineRunner bean3(CollegeService collegeService) {
        return args -> {
            College c1=new College();
            c1.setClg_Id(54);
            c1.setCollege_Name("MGM");
            c1.setClg_Address("Indore");
            c1.setClg_ContactNo("2101");
            c1.setStud_Id(9);
            log.info("Adding College:");
            collegeService.addByCollege(c1);
            log.info("Get College By College ID:");
            log.info(collegeService.getCollegByCollegeId(47).toString());
            log.info("Remove College By ID:");
            collegeService.deleteByCollegeId(25);
            log.info("Get All Colleges:");
            log.info(collegeService.getAllCollege().toString());
            log.info("Update College Details By ID:");
            c1.setClg_Address("Pune");
            log.info(collegeService.updateCollegeById(54,c1).toString())
            ;
        };
        }
    }