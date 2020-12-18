package com.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterateSet {
    public static void main(String[] args) {
        Set<String> setElements=new HashSet<>();
        setElements.add("Raj");
        setElements.add("Ram");
        setElements.add("Krish");
        setElements.add("Rahul");



        Iterator itr=setElements.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
