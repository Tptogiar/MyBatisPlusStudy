import com.mapper.EmployeeMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/23 - 17:38
 */
public class SqlSqlInjectorTest {

    ApplicationContext ctx  = new ClassPathXmlApplicationContext("applicationContext.xml");
    EmployeeMapper employeeMapper = ctx.getBean("employeeMapper",EmployeeMapper.class);


    /**
     * 测试自定义全局操作
     */
    @Test
    public void  testMySqlInjector() {
        Integer result = employeeMapper.deleteAll();
        System.out.println("result: " +result );
    }



}
