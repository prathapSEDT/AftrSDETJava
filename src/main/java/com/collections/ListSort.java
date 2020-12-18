package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("prathap");
        list.add("raj");
        list.add("ram");
        list.add("america");
        list.add("bombay");
        System.out.println(list);
        System.out.println("------------------------");
        Collections.sort(list);

        System.out.println(list);

    }
}
