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
 * @date 2022/1/23 - 1:36
 */
public class Select {


    ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
    EmployeeMapper employeeMapper = ioc.getBean("employeeMapper", EmployeeMapper.class);

    /**
     * 通用 查询操作
     */
    @Test
    public void  testCommonSelect() {
        //1. 通过id查询
//		Employee employee = employeeMapper.selectById(7);
//		System.out.println(employee);

        //2. 通过多个列进行查询    id  +  lastName
//		Employee  employee = new Employee();
//		//employee.setId(7);
//		employee.setLastName("小泽老师");
//		employee.setGender(0);
//
//		Employee result = employeeMapper.selectOne(employee);
//		System.out.println("result: " +result );


        //3. 通过多个id进行查询    <foreach>
//		List<Integer> idList = new ArrayList<>();
//		idList.add(4);
//		idList.add(5);
//		idList.add(6);
//		idList.add(7);
//		List<Employee> emps = employeeMapper.selectBatchIds(idList);
//		System.out.println(emps);

        //4. 通过Map封装条件查询
//		Map<String,Object> columnMap = new HashMap<>();
//		columnMap.put("last_name", "Tom");
//		columnMap.put("gender", 1);
//
//		List<Employee> emps = employeeMapper.selectByMap(columnMap);
//		System.out.println(emps);

        //5. 分页查询
        List<Employee> emps = employeeMapper.selectPage(new Page<>(3, 2), null);
        System.out.println(emps);
    }


}
