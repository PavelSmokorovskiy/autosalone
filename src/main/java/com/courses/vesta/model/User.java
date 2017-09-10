package com.courses.vesta.model;

public class User {

    private int userid;

    private String name;

    public User(int userid, String name) {
        this.userid = userid;
        this.name = name;
    }

    public int getUserid() {
        return userid;
    }

    public String getName() {
        return name;
    }
}
