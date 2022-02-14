package com.example.realestatedeveloperapplication;

public class Personnel {

    private String FullName;
    private String Position;
    private String PhoneNumber;
    private String Email;
    private String Tasks;

    public Personnel() {
    }

    public Personnel(String fullName, String position, String phoneNumber, String email, String tasks) {
        FullName = fullName;
        Position = position;
        PhoneNumber = phoneNumber;
        Email = email;
        Tasks = tasks;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTasks() {
        return Tasks;
    }

    public void setTasks(String tasks) {
        Tasks = tasks;
    }
}

