package com.example.madrassaapp;


public class Student {
    private String name;
    private String rollNo;
    private String age;
    private String Class;

    public Student(String name, String age, String aClass,String rollNo) {
        this.name = name;
        this.age = age;
        Class = aClass;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getclass() {
        return Class;
    }

    public void setClass(String aClass) {
        this.Class = aClass;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
}
