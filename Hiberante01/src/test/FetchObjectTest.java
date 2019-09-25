import com.zdy.hibernate.entity.Department;
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
public class FetchObjectTest {
    @Test
    public void Fetch(){
        SessionFactory sessionFactoty = HibernateUtil.getSessionFactoty();
        Session session = sessionFactoty.openSession();


       Employee employee = (Employee) session.get(Employee.class,Long.valueOf(2));
       if (employee != null){
           System.out.println("**********************************************************************");
               System.out.println( employee.toString());
           System.out.println("******************************************************");

       }

        session.close();
        HibernateUtil.shutdowm();


    }
}
