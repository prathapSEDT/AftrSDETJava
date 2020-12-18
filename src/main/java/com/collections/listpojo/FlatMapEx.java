package com.collections.listpojo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FlatMapEx {
    public static void main(String[] args) {
        List<EmployeePojo> employeePojoList= Arrays.asList(

                new EmployeePojo("user1","hyd",Arrays.asList(109,890)),
                new EmployeePojo("user12","blz",Arrays.asList(900,600)),
                new EmployeePojo("user234","hyd",Arrays.asList(123,456))
        );

        Optional result=employeePojoList.stream().
                map(emp->emp.getPhonenumbers().stream()).
                flatMap(intStream->intStream.filter(phone->phone==109)).findAny();

        result.ifPresent(System.out::println);



    }
}
