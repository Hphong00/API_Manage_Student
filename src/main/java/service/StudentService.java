package service;

import entity.Student;
import repository.StudentDaoImpl;

import java.util.List;

public class StudentService {
    StudentDaoImpl studentDaoImpl = new StudentDaoImpl();

    public List<Student> getListStudent() {
        return studentDaoImpl.getAll();
    }
    public Student getEntityByIdStudent(int id) {
        return studentDaoImpl.getEntityById(id);
    }

    public boolean addStudent(Student student) {
        return studentDaoImpl.add(student);
    }
    public boolean updateStudent(Student student) {
        return studentDaoImpl.update(student);
    }
    public boolean deleteStudent(int id) {
        return studentDaoImpl.delete(id);
    }
    public List<Student> getBirthday(){return studentDaoImpl.getBirthday();}

}
