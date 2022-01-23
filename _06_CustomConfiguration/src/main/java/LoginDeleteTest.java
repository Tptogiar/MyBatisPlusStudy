import com.beans.User;
import com.mapper.EmployeeMapper;
import com.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/23 - 19:19
 */
public class LoginDeleteTest {

    ApplicationContext ctx  = new ClassPathXmlApplicationContext("applicationContext.xml");
    EmployeeMapper employeeMapper = ctx.getBean("employeeMapper",EmployeeMapper.class);
    UserMapper userMapper = ctx.getBean("userMapper",UserMapper.class);
    /**
     * 测试逻辑删除
     */
    @Test
    public void testLogicDelete() {

        Integer result = userMapper.deleteById(2);
        System.out.println("result:" +result );

        User user = userMapper.selectById(2);
        System.out.println(user);
    }


}
