package com.example.madrassaapp;


public class Student {
    private String name;
    private int age;
    private String classroom;

    public Student(String name, int age, String aClass) {
        this.name = name;
        this.age = age;
        classroom = aClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
