package demos;

import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import dao.EmployeeMapper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import po.Employee;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/22 - 15:24
 */
public class Main {

    ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
    EmployeeMapper employeeMapper = ioc.getBean("employeeMapper", EmployeeMapper.class);


    @Test
    public void TestEnvironment() throws SQLException {
        DataSource dataSource = ioc.getBean("dataSource", DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
    }





}
