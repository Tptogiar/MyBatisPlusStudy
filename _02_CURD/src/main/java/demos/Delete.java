package demos;

import dao.EmployeeMapper;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Tptogiar
 * @description
 * @date 2022/1/23 - 1:35
 */
public class Delete {

    ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
    EmployeeMapper employeeMapper = ioc.getBean("employeeMapper", EmployeeMapper.class);

    /**
     * 通用 删除操作
     */
    @Test
    public void testCommonDelete() {
        //1 .根据id进行删除
        Integer result = employeeMapper.deleteById(13);
        System.out.println("result: " + result );
        //2. 根据 条件进行删除
//		Map<String,Object> columnMap = new HashMap<>();
//		columnMap.put("last_name", "MP");
//		columnMap.put("email", "mp@atguigu.com");
//		Integer result = employeeMapper.deleteByMap(columnMap);
//		System.out.println("result: " + result );

        //3. 批量删除
//		List<Integer> idList = new ArrayList<>();
//		idList.add(3);
//		idList.add(4);
//		idList.add(5);
//		Integer result = employeeMapper.deleteBatchIds(idList);
//		System.out.println("result: " + result );
    }


}
