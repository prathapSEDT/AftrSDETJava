package com.ObjectSorting;

import java.util.Comparator;

public class ComparatorTest implements Comparator<TestEmployee> {
    @Override
    public int compare(TestEmployee o1, TestEmployee o2) {

        if(o1.getSal()<o2.getSal())return -1;
        if(o1.getSal()>o2.getSal())return 1;
        else return 0;
    }
}
