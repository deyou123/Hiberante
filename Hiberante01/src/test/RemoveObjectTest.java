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
public class RemoveObjectTest {
    @Test
    public void remove(){
        SessionFactory sessionFactoty = HibernateUtil.getSessionFactoty();
        Session session = sessionFactoty.openSession();

        //开启事务
        session.getTransaction().begin();

        //获取数据
        Employee employee = (Employee) session.get(Employee.class,new Long(1));
        //删除数据
        session.delete(employee);
        //提交事务
        session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdowm();


    }
}
