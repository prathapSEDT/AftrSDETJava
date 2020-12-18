package com.collections.listpojo;

public class SingleData {
    private String name;
    private String place;
    private int salary;

    public SingleData(String name, String place, int salary) {
        this.name = name;
        this.place = place;
        this.salary = salary;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "SingleData{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", salary=" + salary +
                '}';
    }
}
