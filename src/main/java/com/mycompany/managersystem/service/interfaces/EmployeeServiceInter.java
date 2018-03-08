/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.managersystem.service.interfaces;

import com.mycompany.managersystem.domain.Employee;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author jason email: 765798166@qq.com
 * @date 2018-3-8 11:08:16
 */
public interface EmployeeServiceInter {

    public void addEmployee(Employee e);

    public List<Employee> showEmployee();

    public void updateEmployee(Employee e);

    public void delEmployeeById(Serializable id);
}
