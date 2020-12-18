package com.ObjectSorting;

public class TestEmployee implements Comparable<TestEmployee>{

    private String name;
    private String place;
    private int age;
    private int sal;

    @Override
    public String toString() {
        return "TestEmployee{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", age=" + age +
                ", sal=" + sal +
                '}';
    }

    public TestEmployee(String name, String place, int age, int sal) {
        this.name = name;
        this.place = place;
        this.age = age;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public int compareTo(TestEmployee o) {
        return this.sal-o.sal;

        // equal 0
        //> +ve
        //<-ve
    }
}
