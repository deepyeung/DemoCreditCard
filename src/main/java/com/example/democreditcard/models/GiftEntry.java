package com.example.democreditcard.models;

import javax.persistence.*;

//通路 CreditCardGiftEntry
@Entity
@Table(name = "GiftEntry")
public class GiftEntry {


    //流水號
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Serial")
    private long serial;

    //通路代號
    @Column(name = "Entry")
    private String entry;


    public long getSerial() {
        return serial;
    }

    public void setSerial(long serial) {
        this.serial = serial;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }
}