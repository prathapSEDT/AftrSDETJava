package com.collections;

import pojo.Employee;

import java.util.ArrayList;
import java.util.List;

public class ListTypeSafe {
    public static void main(String[] args) {
        List<EmployeeData> data=new ArrayList<EmployeeData>();

        for (int i=0;i<=30;i++){
            EmployeeData employeeData=new EmployeeData();
            employeeData.setName("User"+i);
            employeeData.setPlace("Place"+i);
            data.add(employeeData);
        }

        System.out.println(data);
        for (EmployeeData employee:data) {
            System.out.println(employee.getName());
            System.out.println(employee.getPlace());
        }

    }
}
