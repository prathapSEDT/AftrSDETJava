package com.collections.listpojo;

public class StudentData {
    private String name;

    public StudentData(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentData{" +
                "name='" + name + '\'' +
                '}';
    }
}
