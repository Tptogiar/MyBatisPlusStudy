import com.baomidou.mybatisplus.plugins.Page;
import com.beans.Employee;
import com.beans.User;
import com.mapper.EmployeeMapper;
import com.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/23 - 16:41
 */
public class Main {


    ApplicationContext ctx  = new ClassPathXmlApplicationContext("applicationContext.xml");
    EmployeeMapper employeeMapper = ctx.getBean("employeeMapper",EmployeeMapper.class);


//    ApplicationContext ctx  = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//    EmployeeMapper employeeMapper = ctx.getBean("employeeMapper",EmployeeMapper.class);

    UserMapper userMapper = ctx.getBean("userMapper",UserMapper.class);



//    /**
//     * 测试Oracle 主键 Sequence
//     */
//    @Test
//    public void testOracle() {
//        User user = new User();
//        user.setLogicFlag(1);
//        user.setName("OracleSEQ");
//        userMapper.insert(user);
//    }



}
