package com.collections.lambdasintroduction;

public class TestLambdas {
    public static void main(String[] args) {
        Registration registration=(username)-> System.out.println("The User "+username);

        //lambdas
        /*
        Synatx:
        ()->expression or class implementation {logic};
         */


        registration.registerUser("Prathap");

    }
}
