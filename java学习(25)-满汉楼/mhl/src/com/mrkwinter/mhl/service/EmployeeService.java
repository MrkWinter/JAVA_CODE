package com.mrkwinter.mhl.service;

import com.mrkwinter.mhl.dao.EmployeeDao;
import com.mrkwinter.mhl.domain.Employee;

/**
 * @author MrkWinter
 * @version 1.0
 */
public class EmployeeService {
    private static EmployeeDao employeeDao = new EmployeeDao();
    public static Employee employeeIsExist(String empId, String password) {
        return employeeDao.quarrySingle("select * from employee" +
                " where empId = ? and password = md5(?)", Employee.class,empId,password);
    }
}
