package com.example.tuan2;

public class Student3 {
    private int id;
    private String name;
    private String class3;
    private boolean gender;
    private String address;
    private int score;

    public Student3() {

    }

    public Student3(int id, String name, String class3, boolean gender, String address, int score) {
        this.id = id;
        this.name = name;
        this.class3= class3;
        this.gender = gender;
        this.address = address;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getclass3() {
        return class3;
    }

    public void setClass(String class3) {
        class3 = class3;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
