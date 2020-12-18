package com.collections.listpojo;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class MapINT {
    public static void main(String[] args) {
        List<SingleData> singleData= Arrays.asList(
                new SingleData("raj","hyd",2000),
                new SingleData("ram","chennai",4567),
                new SingleData("rahul","blz",800)
        );

        OptionalDouble salaray=singleData.stream().mapToDouble(user-> user.getSalary()).max();
        System.out.println(salaray);
    }
}
