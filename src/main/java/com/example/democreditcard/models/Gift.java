package com.example.democreditcard.models;

import javax.persistence.*;
import java.util.Date;

//首刷禮表 CreditCardGift
@Entity
@Table(name = "Gift")
public class Gift {

    //流水號
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "GiftSerial")
    private long giftSerial;

    //首刷禮名稱
    @Column(name = "GiftTitle")
    private String giftTitle;

    //首刷禮文宣
    @Column(name = "GiftNote")
    private String giftNote;

    //首刷禮對應code example 1001
    @Column(name = "GiftCode")
    private String giftCode;

    //首刷禮圖片
    @Column(name = "GiftImage")
    private String giftImage;

    //首刷禮狀態
    @Column(name = "GiftStatus")
    private String giftStatus;

    //首刷禮上架開始時間
    @Temporal(TemporalType.DATE)
    @Column(name = "StartDate", updatable = false, nullable = false)
    private Date startDate;

    //首刷禮上架結束時間
    @Temporal(TemporalType.DATE)
    @Column(name = "EndDate", updatable = false, nullable = false)
    private Date endDate;

    //創建使用者
    @Column(name = "CreateUser")
    private String createUser;

    //更新使用者
    @Column(name = "UpdateUser")
    private String updateUser;

    //更新時間
    @Column(name = "UpdateTime")
    private Date updateTime;

    //申請者
    @Column(name = "ApproveUser")
    private String approveUser;

    //申請者申請時間
    @Column(name = "ApproveTime")
    private Date approveTime;

    //庫存
    @Column(name = "Inventory")
    private long inventory;

    //剩餘庫存
    @Column(name = "InventoryOver")
    private long inventoryOver;

    public long getGiftSerial() {
        return giftSerial;
    }

    public void setGiftSerial(long giftSerial) {
        this.giftSerial = giftSerial;
    }

    public String getGiftTitle() {
        return giftTitle;
    }

    public void setGiftTitle(String giftTitle) {
        this.giftTitle = giftTitle;
    }

    public String getGiftNote() {
        return giftNote;
    }

    public void setGiftNote(String giftNote) {
        this.giftNote = giftNote;
    }

    public String getGiftCode() {
        return giftCode;
    }

    public void setGiftCode(String giftCode) {
        this.giftCode = giftCode;
    }

    public String getGiftImage() {
        return giftImage;
    }

    public void setGiftImage(String giftImage) {
        this.giftImage = giftImage;
    }

    public String getGiftStatus() {
        return giftStatus;
    }

    public void setGiftStatus(String giftStatus) {
        this.giftStatus = giftStatus;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getApproveUser() {
        return approveUser;
    }

    public void setApproveUser(String approveUser) {
        this.approveUser = approveUser;
    }

    public Date getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }

    public long getInventory() {
        return inventory;
    }

    public void setInventory(long inventory) {
        this.inventory = inventory;
    }

    public long getInventoryOver() {
        return inventoryOver;
    }

    public void setInventoryOver(long inventoryOver) {
        this.inventoryOver = inventoryOver;
    }
}