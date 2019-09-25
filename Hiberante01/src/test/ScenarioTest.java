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
public class ScenarioTest {
    @Test
    public void Scenario1(){
        SessionFactory sessionFactoty = HibernateUtil.getSessionFactoty();
        Session session = sessionFactoty.openSession();


       Employee employeeGet = (Employee) session.get(Employee.class,Long.valueOf(2));
       if (employeeGet != null){
           System.out.println("**********************************************************************");
               System.out.println( employeeGet.toString());
           System.out.println("******************************************************");

       }
        Employee employeeLoad = (Employee) session.load(Employee.class,Long.valueOf(2));
        if (employeeLoad != null){
            System.out.println("**********************************************************************");
            System.out.println( employeeLoad.toString());
            System.out.println("******************************************************");

        }

        session.close();
        HibernateUtil.shutdowm();


    }
    @Test
    public void Scenario2(){
        SessionFactory sessionFactoty = HibernateUtil.getSessionFactoty();
        Session session = sessionFactoty.openSession();


        Employee employeeGet = (Employee) session.get(Employee.class,new Long(1));
        if (employeeGet != null){
            System.out.println("**********************************************************************");
            System.out.println( employeeGet.toString());
            System.out.println("******************************************************");

        }
        Employee employeeLoad = (Employee) session.load(Employee.class,new Long(2));
        if (employeeLoad != null){
            System.out.println("**********************************************************************");
            System.out.println( employeeLoad.toString());
            System.out.println("******************************************************");

        }

        session.close();
        HibernateUtil.shutdowm();


    }
    @Test
    public void Scenario3(){
        SessionFactory sessionFactoty = HibernateUtil.getSessionFactoty();
        Session session = sessionFactoty.openSession();


        Employee employeeGet = (Employee) session.get(Employee.class,new Long(1));
        if (employeeGet != null){
            System.out.println("**********************************************************************");
            System.out.println( employeeGet.toString());
            System.out.println("******************************************************");

        }
        Employee employeeLoad = (Employee) session.load(Employee.class,new Long(3));
        if (employeeLoad != null){
            System.out.println("**********************************************************************");
            System.out.println( employeeLoad.toString());
            System.out.println("******************************************************");

        }

        session.close();
        HibernateUtil.shutdowm();


    }
}
