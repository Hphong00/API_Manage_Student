package repository;

import entity.Student;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtils;

import java.util.List;

public class StudentDaoImpl implements Dao<Student>{


    @Override
    public List<Student> getAll() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        try {
            // Tất cả các lệnh hành động với DB thông qua Hibernate
            // đều phải nằm trong 1 giao dịch (Transaction)
            // Bắt đầu giao dịch
            session.getTransaction().begin();
            String sql = "Select e from Student e";
            // Tạo đối tượng Query.
            Query<Student> query = session.createQuery(sql);
            // Thực hiện truy vấn.
            List<Student> students = query.getResultList();

            for (Student student : students) {
                System.out.println(student.toString());
            }
            // Commit dữ liệu
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            // Rollback trong trường hợp có lỗi xẩy ra.
            session.getTransaction().rollback();
        }
        return null;
    }

    @Override
    public Student getEntityById(int id) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        try {
            session.getTransaction().begin();
            Student student = session.load(Student.class, id);
            session.getTransaction().commit();
            System.out.println(student.toString());
            return student;
        }catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        return null;
    }

    @Override
    public boolean add(Student student) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        try {
            session.getTransaction().begin();
            session.save(student);
            session.getTransaction().commit();
            System.out.println("add succsessfull");
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        return false;
    }

    @Override
    public boolean update(Student student) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        try {
            session.getTransaction().begin();
            session.saveOrUpdate(student);
            session.getTransaction().commit();
            System.out.println("update succsessfull");
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        try {
            session.getTransaction().begin();
            Student student = session.load(Student.class, id);
            session.delete(student);
            session.getTransaction().commit();
            System.out.println("delete succsessfull");
            return true;
        }catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }
        return false;
    }
}
