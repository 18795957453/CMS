package com.website.pojo;

public class User {

    //ѧ��
    private String stuNumber;
    //����
    private String name;
    //�û���
    private String userName;
    //����
    private String passWord;
    //�ֻ���
    private String phoneNumber;
    //����
    private String email;
    public User(String stuNumber, String name, String userName, String passWord, String phoneNumber, String email) {
        super();
        this.stuNumber = stuNumber;
        this.name = name;
        this.userName = userName;
        this.passWord = passWord;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public User() {
        super();
    }
    public String getStuNumber() {
        return stuNumber;
    }
    public void setStuNumber(String stuNumber) {
        this.stuNumber = stuNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassWord() {
        return passWord;
    }
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "User [stuNumber=" + stuNumber + ", name=" + name + ", userName=" + userName + ", passWord=" + passWord + ", phoneNumber="
                + phoneNumber + ", email=" + email + "]";
    }
    
}
