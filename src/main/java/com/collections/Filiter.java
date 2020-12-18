package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Filiter {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("prathap");
        list.add("raj");
        list.add("ram");
        list.add("america");
        list.add("bombay");

        //lambdas on collection

        // listvariable.stream().foreach(somevarioable->sout(somevariable)
        // interface--->> consumer
        list.stream().forEach(i-> System.out.println(i));

        System.out.println("-----------------------");
        // interface name-- predicate( T/F)
        List data=list.stream().filter(i->!i.equals("ram")).collect(Collectors.toList());
        System.out.println(data);
    }
}
