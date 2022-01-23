package demos;

import dao.EmployeeMapper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import po.Employee;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/23 - 1:35
 */
public class Insert {

    ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
    EmployeeMapper employeeMapper = ioc.getBean("employeeMapper", EmployeeMapper.class);



    @Test
    public void testInsert(){
        Employee last = new Employee("last", "252", 1, 23);
        Integer insert = employeeMapper.insert(last);
        System.out.println(insert);
        System.out.println(last.getId());
    }

    @Test
    public void testInsertAll(){
        Employee last = new Employee("last", "252", 1);
        Integer insert = employeeMapper.insertAllColumn(last);
        System.out.println(insert);
        System.out.println(last.getId());
    }



}
