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
public class SaveObjectTest {
    @Test
    public void save(){
        SessionFactory sessionFactoty = HibernateUtil.getSessionFactoty();
        Session session = sessionFactoty.openSession();

        //开启事务
        session.getTransaction().begin();

        //创建一个department 对象
        Department department = new Department();
        department.setDeptName("开发部");

        //保存对象
        session.save(department);
        System.out.println("*************开发部 saved, id: " +
                department.getId());

        //创建employee 对象
        Employee employee = new Employee();
        employee.setFirstName("yogesh");
        employee.setSalary(50000);
        // 添加员工所属部门
        employee.setDepartment(department);

        //保存employee 对象
        session.save(employee);
        System.out.println("************* Employee saved, id: " +
                employee.getId());

        //提交事务
        session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdowm();


    }
}
