package com.example.madrassaapp;

public class TaskRecords {
        private int id;
        private int studentId;
        private String taskType;
        private String taskDetails;

    public TaskRecords(int id, int studentId, String taskType, String taskDetails) {
        this.id = id;
        this.studentId = studentId;
        this.taskType = taskType;
        this.taskDetails = taskDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    public String getTaskDetails() {
        return taskDetails;
    }

    public void setTaskDetails(String taskDetails) {
        this.taskDetails = taskDetails;
    }
}
