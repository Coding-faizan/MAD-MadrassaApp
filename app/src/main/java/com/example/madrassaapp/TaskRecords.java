package com.example.madrassaapp;

public class TaskRecords {
        private String  rollNo;
        private String sabaq;
        private String sabaqi;
        private String manzil;

    public TaskRecords(String rollNo, String sabaq, String sabaqi, String manzil) {
        this.rollNo = rollNo;
        this.sabaq = sabaq;
        this.sabaqi = sabaqi;
        this.manzil = manzil;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getSabaq() {
        return sabaq;
    }

    public void setSabaq(String sabaq) {
        this.sabaq = sabaq;
    }

    public String getSabaqi() {
        return sabaqi;
    }

    public void setSabaqi(String sabaqi) {
        this.sabaqi = sabaqi;
    }

    public String getManzil() {
        return manzil;
    }

    public void setManzil(String manzil) {
        this.manzil = manzil;
    }
}
