package com.collections;

import java.util.ArrayList;
import java.util.List;

public class ClearList {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<String>();
        list1.add("prathap");
        list1.add("raj");
        list1.add("ram");
        System.out.println(list1);
        // user can remove the element from the list either by index or by object name
//        list1.remove("prathap");
//        System.out.println(list1);
//        list1.remove(1);
//        System.out.println(list1);

        list1.clear();
        System.out.println(list1);
    }
}

