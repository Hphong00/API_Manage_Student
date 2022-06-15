package main;

import entity.Student;
import repository.StudentDaoImpl;
import service.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        studentService.getListStudent();
        //studentDao.getEntityById(101);

       //studentDao.delete(101);
//        studentDao.getAll();


    }
}
