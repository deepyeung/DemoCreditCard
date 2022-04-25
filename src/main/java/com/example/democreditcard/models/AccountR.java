package com.example.democreditcard.models;

import javax.persistence.*;

//權限表 AccounR
@Entity
@Table(name = "AccountR")
public class AccountR {


    //流水號
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Serial")
    private long serial;

    @Column(name = "role")
    private String role;

    @Column(name = "account")
    private String account;

    public long getSerial() {
        return serial;
    }

    public void setSerial(long serial) {
        this.serial = serial;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}