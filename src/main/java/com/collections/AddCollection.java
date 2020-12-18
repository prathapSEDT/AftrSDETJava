package com.collections;

import java.util.ArrayList;
import java.util.List;

public class AddCollection {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<String>();
        list1.add("prathap");
        list1.add("raj");
        list1.add("ram");

        List<String> list2=new ArrayList<String>();
        list2.add("rahul");
        list2.add("rakesh");
        list2.add("harish");

//        list1.addAll(list2);// this method addAll will not return a new list
//        System.out.println(list1);

        //check if my list1 is available in list2
        boolean status=list1.containsAll(list2);
        System.out.println(status);

    }
}
