package repository;

import entity.Student;
import org.hibernate.Session;
import org.hibernate.query.Query;
import util.HibernateUtils;

import java.util.List;

public class StudentDao implements Dao<Student>{


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

            for (Student emp : students) {
                System.out.println("Emp: " + emp.getId() + " "
                        + emp.getFullname() + " " + emp.getClassname());
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
    public Student geEntityById(int id) {
        return null;
    }

    @Override
    public boolean add(Student student) {
        return false;
    }

    @Override
    public boolean update(Student student) {
        return false;
    }

    @Override
    public boolean delete(Student student) {
        return false;
    }
}
