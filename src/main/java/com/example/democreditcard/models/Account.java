package com.example.democreditcard.models;

import javax.persistence.*;

//帳號表 Account
@Entity
@Table(name = "Account")
public class Account {

    //流水號
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Serial")
    private long serial;

    @Column(name = "account")
    private String account;

    @Column(name = "pwd")
    private String pwd;

//    @ManyToOne //
//    @JoinColumn(name = "roles") //
//    private AccountR accountR;
//
    public Account(){}
    public Account(String account, String pwd, AccountR accountR) {
            this.account = account;
            this.pwd = pwd;

    }

//    public AccountR getAccountR() {
//        return accountR;
//    }
//
//    public void setAccountR(AccountR accountR) {
//        this.accountR = accountR;
//    }

    public long getSerial() {
        return serial;
    }

    public void setSerial(long serial) {
        this.serial = serial;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}