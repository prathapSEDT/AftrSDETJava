package com.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetImpl {
    public static void main(String[] args) {

        String name="veera prathap malepati";
        char[] arr=name.toCharArray();
        Set<Character> vowels=new HashSet<>();
        for (Character c:arr) {
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowels.add(c);
            }
        }
        System.out.println(vowels +"AND THE SIZE IS "+vowels.size());

    }
}
