package com.di;

import javax.inject.Inject;

public class ChildClass {
    @Inject
    static ParentClass parentClass;

    public static void main(String[] args) {
        parentClass.m1();
    }
}
