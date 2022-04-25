package com.example.democreditcard.models;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

//信用卡表 CreditCardProduct
@Entity
@Table(name = "GiftProject")
public class GiftProject {

    //流水號
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "GiftProjectSerial")
    private long giftProjectSerial;

    //專案名稱
    @Column(name = "GiftProjectName")
    private String giftProjectName;

    //專案開始時間
    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    @Column(name = "GiftProjectStartTime" , updatable = false , nullable = false)
    private Date giftProjectStartTime;

    //專案結束時間
    @Temporal(TemporalType.DATE)
    @Column(name = "GiftProjectEndTime")
    private Date giftProjectEndTime;

    //專案代號
    @Column(name = "GiftProjectCode")
    private String giftProjectCode;

    //專案狀態
    @Column(name = "Status")
    private String status;

    //創立者
    @Column(name = "CreateUser")
    private String createUser;

    //創立時間
    @Temporal(TemporalType.DATE)
    @Column(name = "CreateTime" , updatable = false , nullable = false)
    private Date createTime;

    //放行者
    @Column(name = "ApproveUser")
    private String approveUser;

    //放行時間
    @Temporal(TemporalType.DATE)
    @Column(name = "ApproveTime")
    private Date approveTime;

    //更新者
    @Column(name = "UpdateUser")
    private String updateUser;

    //更新時間
    @Temporal(TemporalType.DATE)
    @Column(name = "UpdateTime" , nullable = false)
    private Date updateTime;

    //有無清單
    @Column(name = "PeopleListStatus")
    private boolean peopleListStatus;

    //通路
    @Column(name = "EntryType")
    private String entryType;





    public long getGiftProjectSerial() {
        return giftProjectSerial;
    }

    public void setGiftProjectSerial(long giftProjectSerial) {
        this.giftProjectSerial = giftProjectSerial;
    }

    public String getGiftProjectName() {
        return giftProjectName;
    }

    public void setGiftProjectName(String giftProjectName) {
        this.giftProjectName = giftProjectName;
    }

    public Date getGiftProjectStartTime() {
        return giftProjectStartTime;
    }

    public void setGiftProjectStartTime(Date giftProjectStartTime) {
        this.giftProjectStartTime = giftProjectStartTime;
    }

    public Date getGiftProjectEndTime() {
        return giftProjectEndTime;
    }

    public void setGiftProjectEndTime(Date giftProjectEndTime) {
        this.giftProjectEndTime = giftProjectEndTime;
    }

    public String getGiftProjectCode() {
        return giftProjectCode;
    }

    public void setGiftProjectCode(String giftProjectCode) {
        this.giftProjectCode = giftProjectCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public boolean isPeopleListStatus() {
        return peopleListStatus;
    }

    public void setPeopleListStatus(boolean peopleListStatus) {
        this.peopleListStatus = peopleListStatus;
    }

    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }
}
