package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListImp {
    public static void main(String[] args) {
        List mylist=new ArrayList();

        // to add data to the list we need to use add()
        mylist.add("prathap");
        mylist.add(1234);
        mylist.add(false);

        //get data from a specific index position
        //System.out.println(mylist.get(0));

//        // looping on
//        for (Object data:mylist) {
//            System.out.println(data);
//        }

        // iterate loop based on index position
//        for(int i=0;i<=mylist.size()-1;i++){
//            System.out.println(mylist.get(i));
//        }

        //get values from a list using iterator
        /*
        List is having its own iterator called as list iterator
        this iterator is used to get the data in forward direction and aslo in backward direction
        it check whter an element is exist in the next position or in prev position
         */

        Iterator itr=mylist.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }



    }
}
