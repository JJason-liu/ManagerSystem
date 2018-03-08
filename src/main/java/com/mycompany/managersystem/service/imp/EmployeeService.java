/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.managersystem.service.imp;

import com.mycompany.managersystem.domain.Employee;
import com.mycompany.managersystem.service.interfaces.EmployeeServiceInter;
import java.io.Serializable;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jason email: 765798166@qq.com
 * @date 2018-3-8 11:06:09
 */
@Transactional
@Component("EmployeeService")
public class EmployeeService implements EmployeeServiceInter {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addEmployee(Employee e) {
        sessionFactory.getCurrentSession().save(e);
    }

    @Override
    public List<Employee> showEmployee() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateEmployee(Employee e) {
        sessionFactory.getCurrentSession().update(e);
    }

    @Override
    public void delEmployeeById(Serializable id) {

    }
}
