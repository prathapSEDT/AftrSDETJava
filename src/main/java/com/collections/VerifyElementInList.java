package com.collections;

import java.util.ArrayList;
import java.util.List;

public class VerifyElementInList {
    public static void main(String[] args) {
        List<String> employees=new ArrayList<String>();
        for(int i=1;i<=30;i++){
            employees.add("user"+i);
        }

        //check if the user is exist on the list or not
        if(employees.contains("user200")){
            System.out.println("User 02 exist");
        }else{
            System.out.println("user 02 not exist");
        }
    }
}
