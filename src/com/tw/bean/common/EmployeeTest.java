package com.tw.bean.common;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author TaoWei
 * @date 2021/2/10-14:45
 **/
public class EmployeeTest {
    @Test
    public void testEmployee() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}
