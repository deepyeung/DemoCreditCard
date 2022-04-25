package com.example.democreditcard.models;

import javax.persistence.*;
import java.util.Date;


//專案及名單對應表 CreditCardGiftProjectPeopleListMapping
@Entity
@Table(name = "GiftProjectPeopleListMapping")
public class GiftProjectPeopleListMapping {

    //流水號
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Serial")
    private long serial;

    //專案流水號
    @Column(name = "GiftPorjectSerial")
    private long giftPorjectSerial;

    //人員清單id
    @Column(name = "idno")
    private String idno;

    //創立者
    @Column(name = "CreateUser")
    private String createUser;

    //創立時間
    @Temporal(TemporalType.DATE)
    @Column(name = "CreateTime" , updatable = false , nullable = false)
    private Date createTime;

    public long getSerial() {
        return serial;
    }

    public void setSerial(long serial) {
        this.serial = serial;
    }

    public long getGiftPorjectSerial() {
        return giftPorjectSerial;
    }

    public void setGiftPorjectSerial(long giftPorjectSerial) {
        this.giftPorjectSerial = giftPorjectSerial;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}