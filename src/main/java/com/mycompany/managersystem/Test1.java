/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.managersystem;

import com.mycompany.managersystem.domain.Employee;
import com.mycompany.managersystem.service.interfaces.EmployeeServiceInter;
import com.mycompany.managersystem.utils.TimeUtils;
import java.sql.Timestamp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author jason email: 765798166@qq.com
 * @date 2018-3-1 11:37:59
 */
public class Test1 {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeServiceInter employeeServiceInter = (EmployeeServiceInter) ac.getBean("EmployeeService");
        employeeServiceInter.addEmployee(new Employee("wohhahah", "sd", TimeUtils.getNowTimestamp()));
    }
}
