package com.archana.demospringboot16thdec.model;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;


@Entity
@Table(name = "userdetails")
public class User {

    User(){

    }

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private int userid; // unique identification key, primary key
    @Column(name = "User_name")
    private String username;
    @Column(name = "First_Name")
    private String FirstName;
    @Column(name = "Last_Name")
    private String LastName;
    @Column(name = "age")
    private int age;
    @Column(name = "password")
    private String password;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String username, String firstName, String lastName, int age, String password) {
        this.username = username;
        FirstName = firstName;
        LastName = lastName;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}
