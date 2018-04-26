package com.example.krish.diseasedetector;

/**
 * Created by krish on 26-04-2018.
 */

public class User_profile {
    public String username;
    public String age;
    public String gender;


    public User_profile(String username, String age, String gender) {
        this.username = username;
        this.age = age;
        this.gender = gender;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
