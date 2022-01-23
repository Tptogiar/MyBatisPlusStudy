import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/22 - 15:24
 */
public class Main {




    @Test
    public void TestEnvironment() throws SQLException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource dataSource = context.getBean("dataSource", DataSource.class);
        Connection connection = dataSource.getConnection();
        System.out.println(connection);

    }




}
