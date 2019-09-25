import com.zdy.hibernate.entity.Employee;
import com.zdy.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

/**
 * Created by DELL
 * Date: 2019/9/25.
 * Time: 9:33
 */
public class updateObjectTest {
    @Test
    public void Fetch(){
        SessionFactory sessionFactoty = HibernateUtil.getSessionFactoty();
        Session session = sessionFactoty.openSession();

        Employee employee = (Employee) session.get(Employee.class,new Long(2));
        System.out.println("*********************************");
        System.out.println("\nOld Employee...");
        System.out.println(employee.toString());
        System.out.println("*********************************");
        //开启事务
        session.getTransaction().begin();

        employee.setFirstName("lilei sisiter");
        session.update(employee);
        session.getTransaction().commit();
        System.out.println("*********************************");
        System.out.println("\nAfter Employee...");
        System.out.println(employee.toString());
        System.out.println("*********************************");
        session.close();
        HibernateUtil.shutdowm();


    }
}
