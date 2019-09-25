import com.zdy.hibernate.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class TestDemo{
    @Test
    public void addTtablesTest(){
        Configuration cig = new Configuration().configure();
        SessionFactory sessionFactory = cig.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction t = session.beginTransaction();
        //添加Employee表
        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("deyou");

        session.save(employee);
        t.commit();
        session.close();
        sessionFactory.close();
    }
}

