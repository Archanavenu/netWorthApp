package com.archana.demospringboot16thdec.model;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;


@Entity
@Table(name = "userdetails")
public class User {

   public User() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userid; // unique identification key, primary key
   /* @Column(name = "User_name")
    private String username;
    @Column(name = "First_Name")
    private String firstName;
    @Column(name = "Last_Name")
    private String lastName;

    @Column(name = "password")
    private String password;  */

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

  /*  public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

  public User(String username, String firstName, String lastName, int age, String password) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }  */
}
