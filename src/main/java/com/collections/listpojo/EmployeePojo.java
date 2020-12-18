package com.collections.listpojo;

import java.util.List;

public class EmployeePojo {
    private String name;
    private String place;
    private List<Integer> phonenumbers;

    public EmployeePojo(String name, String place, List<Integer> phonenumbers) {
        this.name = name;
        this.place = place;
        this.phonenumbers = phonenumbers;
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

    public List<Integer> getPhonenumbers() {
        return phonenumbers;
    }

    public void setPhonenumbers(List<Integer> phonenumbers) {
        this.phonenumbers = phonenumbers;
    }

    @Override
    public String toString() {
        return "EmployeePojo{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", phonenumbers=" + phonenumbers +
                '}';
    }
}
