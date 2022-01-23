package com.controller;


import com.service.impl.EmployeeServiceImpl;
import org.junit.Test;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Tptogiar
 * @since 2022-01-23
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Test
    public void test(){
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

    }


}

