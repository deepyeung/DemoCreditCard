package com.example.democreditcard.models;

import javax.persistence.*;

//信用卡表 CreditCardProduct
@Entity
@Table(name = "Product")
public class Product {


    //流水號
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CardSerial")
    private long cardSerial;

    //信用卡名稱
    @Column(name = "CardTitle")
    private String cardTitle;

    //信用卡對應號碼 example 1001
    @Column(name = "ProductId")
    private String productId;

    public long getCardSerial() { return cardSerial; }

    public void setCardSerial(long cardSerial) {
        this.cardSerial = cardSerial;
    }

    public String getCardTitle() {
        return cardTitle;
    }

    public void setCardTitle(String cardTitle) {
        this.cardTitle = cardTitle;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}