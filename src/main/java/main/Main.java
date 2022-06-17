package main;

import entity.Student;
import service.StudentService;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
       StudentService studentService = new StudentService();
        studentService.getListStudent();
//        System.out.println("--------------------------");
//        studentService.getEntityByIdStudent(10001);
//        System.out.println("--------------------------");

//        Date date = new Date(1);
//        Student student = new Student("lainh",date,"11B1","Nữ","Hà Nội","Nam", (short) 9);
//        studentService.addStudent(student);
//        System.out.println("--------------------------");
//        studentService.deleteStudent(10001);

        //studentDao.getEntityById(101);

       //studentDao.delete(101);
//        studentDao.getAll();


    }
}
