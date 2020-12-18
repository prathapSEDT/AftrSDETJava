package com.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSewt {
    public static void main(String[] args) {
        Set<String> setElements=new LinkedHashSet<>();
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
