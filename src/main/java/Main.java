import entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import repository.StudentDao;
import util.HibernateUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        studentDao.getAll();
    }
}
