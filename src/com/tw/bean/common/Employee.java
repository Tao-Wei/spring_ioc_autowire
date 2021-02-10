package com.tw.bean.common;

/**
 * @author TaoWei
 * @date 2021/2/10-14:42
 **/
public class Employee {
    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department=" + department +
                '}';
    }
}
