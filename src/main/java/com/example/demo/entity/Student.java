package com.example.demo.entity;

public class Student {

    private String firstname;
    private String lastname;
    private int id;

    public Student(String firstname,String lastname,int id) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
