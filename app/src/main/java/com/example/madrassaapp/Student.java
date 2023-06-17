package com.example.madrassaapp;


public class Student {
    private String name;
    private int age;
    private String className;

    public Student(String name, int age, String aClass) {
        this.name = name;
        this.age = age;
        className = aClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
