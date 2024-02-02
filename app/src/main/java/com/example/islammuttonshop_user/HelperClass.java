package com.example.islammuttonshop_user;

public class HelperClass {
    String UserName;
    String PhoneNo;
    String Password;
    String ConfPassword;


    public HelperClass() {
    }

    public HelperClass(String userName, String phoneNo, String password, String confPassword) {
        UserName = userName;
        PhoneNo = phoneNo;
        Password = password;
        ConfPassword = confPassword;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getConfPassword() {
        return ConfPassword;
    }

    public void setConfPassword(String confPassword) {
        ConfPassword = confPassword;
    }
}



