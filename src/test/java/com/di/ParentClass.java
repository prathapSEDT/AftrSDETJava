package com.di;

import javax.inject.Named;

@Named
public class ParentClass {
    public void m1(){
        System.out.println("method 1");
    }
    public void m2(){
        System.out.println("method 2");
    }
}
