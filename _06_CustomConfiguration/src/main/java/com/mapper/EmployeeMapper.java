package com.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.beans.Employee;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author Tptogiar
 * @since 2022-01-23
 */
public interface EmployeeMapper extends BaseMapper<Employee> {


    int  deleteAll();

}
