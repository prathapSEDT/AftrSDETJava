package com.ObjectSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {
    public static void main(String[] args) {
        List<TestEmployee> employeeList=new ArrayList<TestEmployee>();
        employeeList.add(new TestEmployee("Raj","Hyd",45,6789));
        employeeList.add(new TestEmployee("Rahul","BLZ",23,5678));
        employeeList.add(new TestEmployee("Krish","TMN",67,100));
        employeeList.add(new TestEmployee("Ramesh","Pune",90,200));
        employeeList.add(new TestEmployee("Sona","Kolkatta",28,300));

        ComparatorTest comparatorTest=new ComparatorTest();
        Collections.sort(employeeList,comparatorTest);

        System.out.println(employeeList);

    }
}
