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
    private int userid;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

}
