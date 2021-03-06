package demos;

import com.baomidou.mybatisplus.mapper.Condition;
import com.baomidou.mybatisplus.plugins.Page;
import dao.EmployeeMapper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import po.Employee;

import java.util.List;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/23 - 1:38
 */
public class EntityWrapper {



    ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
    EmployeeMapper employeeMapper = ioc.getBean("employeeMapper", EmployeeMapper.class);



    /**
     * 条件构造器   查询操作
     */
    @Test
    public void testEntityWrapperSelect() {
        //我们需要分页查询tbl_employee表中，年龄在18~50之间且性别为男且姓名为Tom的所有用户

//		List<Employee> emps =employeeMapper.selectPage(new Page<Employee>(1, 2),
//					new EntityWrapper<Employee>()
//					.between("age", 18, 50)
//					.eq("gender", 1)
//					.eq("last_name", "Tom")
//				);
//		System.out.println(emps);



        // 查询tbl_employee表中， 性别为女并且名字中带有"老师" 或者  邮箱中带有"a"

//		List<Employee> emps = employeeMapper.selectList(
//				new EntityWrapper<Employee>()
//				.eq("gender", 0)
//				.like("last_name", "老师")
//				//.or()    // SQL: (gender = ? AND last_name LIKE ? OR email LIKE ?)
//				.orNew()   // SQL: (gender = ? AND last_name LIKE ?) OR (email LIKE ?)
//				.like("email", "a")
//				);
//		System.out.println(emps);


        // 查询性别为女的, 根据age进行排序(asc/desc), 简单分页

//		List<Employee> emps  = employeeMapper.selectList(
//				new EntityWrapper<Employee>()
//				.eq("gender", 0)
//				.orderBy("age")//默认升序
//				//.orderDesc(Arrays.asList(new String [] {"age"}))
//				.last("desc limit 1,3")//手动把sql拼接到最后（有sql注入风险）
//				);
//		System.out.println(emps);

    }



    /**
     * 条件构造器  修改操作
     */
    @Test
    public void testEntityWrapperUpdate() {

        Employee employee = new Employee();
        employee.setLastName("老师");
        employee.setEmail("cls@sina.com");
        employee.setGender(0);


        employeeMapper.update(employee,
                new com.baomidou.mybatisplus.mapper.EntityWrapper<Employee>()
                        .eq("last_name", "Tom")
                        .eq("age", 44)
        );
    }



    /**
     * 条件构造器  删除操作
     */
    @Test
    public void testEntityWrapperDelete() {
        employeeMapper.delete(
                new com.baomidou.mybatisplus.mapper.EntityWrapper<Employee>()
                        .eq("last_name", "Tom")
                        .eq("age", 22)
        );
    }



}
