package demos;

import com.baomidou.mybatisplus.plugins.Page;
import dao.EmployeeMapper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import po.Employee;

import java.util.List;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/23 - 1:46
 */
public class Condition {


    ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
    EmployeeMapper employeeMapper = ioc.getBean("employeeMapper", EmployeeMapper.class);


    @Test
    public void testCondition(){
        List<Employee> emps = employeeMapper.selectPage(
                new Page<Employee>(1,2),
                com.baomidou.mybatisplus.mapper.Condition.create()
                        .between("age", 18, 50)
                        .eq("gender", "1")
                        .eq("last_name", "Tom")

        );
        System.out.println(emps);
    }





}
