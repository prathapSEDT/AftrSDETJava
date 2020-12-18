package com.collections.listpojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToPojo {
    public static void main(String[] args) {
        List<String> userNames= Arrays.asList(
                "user1","user2","user3","user4"
        );

        userNames.stream().map(StudentData::new).forEach(System.out::println);



    }
}
