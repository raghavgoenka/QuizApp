package com.example.internshala.entities;

import javax.persistence.*;
import java.util.Base64;
import java.util.UUID;

@Entity
@Table(name="users")
public class User {



    public User(String userName, String userEmail,String file,String salary){
        this.userName=userName;
        this.userEmail=userEmail;

        this.file=file;
        this.salary = salary;
    }
    public User(){}


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;


    private  String userName;
    private String userEmail;

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    private String file;

    private String salary;


    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
}
