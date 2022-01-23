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
public class Update {


    ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
    EmployeeMapper employeeMapper = ioc.getBean("employeeMapper", EmployeeMapper.class);

    @Test
    public void testCommonUpdate() {
        //初始化修改对象
        Employee employee = new Employee();
        employee.setId(7);
        employee.setLastName("老师");
        employee.setEmail("xz@sina.com");
        employee.setGender(0);
        //employee.setAge(33);
        //Integer result = employeeMapper.updateById(employee);
        Integer result = employeeMapper.updateAllColumnById(employee);
        System.out.println("result: " + result );
    }

}
