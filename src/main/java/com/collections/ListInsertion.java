package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInsertion {
    public static void main(String[] args) {
        List<String> userdata= new ArrayList<String>();
        userdata.add("ramesh");

        //insert a new value in the index number 0
userdata.add("rahul");
userdata.add(0,"krish");
        System.out.println(userdata);

    }
}
