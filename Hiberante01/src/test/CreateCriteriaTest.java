import com.zdy.hibernate.entity.Employee;
import com.zdy.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by DELL
 * Date: 2019/9/25.
 * Time: 16:07
 */
public class CreateCriteriaTest {



    @Test
    public void selectALLTest(){
        SessionFactory sessionFactoty = HibernateUtil.getSessionFactoty();
        Session session = sessionFactoty.openSession();
        //5.2版本后使用方法
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);
        //2. 指定根条件
        Root<Employee>  root = criteriaQuery.from(Employee.class);
        //3. 通过session执行查询
        List<Employee> employees = session.createQuery(criteriaQuery).list();


        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
    //条件查询
    @Test
    public void gtTest(){
        SessionFactory sessionFactoty = HibernateUtil.getSessionFactoty();
        Session session = sessionFactoty.openSession();
        //5.2版本后使用方法
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<Employee> criteriaQuery = criteriaBuilder.createQuery(Employee.class);
        //2. 指定根条件
        Root<Employee>  root = criteriaQuery.from(Employee.class);

    }
}
