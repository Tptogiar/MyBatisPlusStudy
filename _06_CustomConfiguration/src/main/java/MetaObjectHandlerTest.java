import com.beans.User;
import com.mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/23 - 19:50
 */
public class MetaObjectHandlerTest {

    ApplicationContext ctx  = new ClassPathXmlApplicationContext("applicationContext.xml");
    UserMapper userMapper = ctx.getBean("userMapper",UserMapper.class);
    /**
     * 测试公共字段填充
     */
    @Test
    public void testMetaObjectHandler() {
        User user = new User();
//        user.setLastName("sdfsdf");
        user.setId(4);
        user.setLogicFlag(1);
//        userMapper.updateById(user);
        userMapper.insert(user);
    }



}
