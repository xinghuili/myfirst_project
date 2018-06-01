package com.kuheng.entity.member;

import java.io.Serializable;
import java.math.BigDecimal;

public class KuFinanceCharge implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_charge.itemid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private Long itemid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_charge.username
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_charge.userid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private Long userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_charge.bank
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private String bank;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_charge.amount
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_charge.fee
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private BigDecimal fee;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_charge.money
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private BigDecimal money;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_charge.sendtime
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private Integer sendtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_charge.receivetime
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private Integer receivetime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_charge.editor
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private String editor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_charge.status
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private Boolean status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_charge.note
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_charge.itemid
     *
     * @return the value of ku_finance_charge.itemid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public Long getItemid() {
        return itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_charge.itemid
     *
     * @param itemid the value for ku_finance_charge.itemid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setItemid(Long itemid) {
        this.itemid = itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_charge.username
     *
     * @return the value of ku_finance_charge.username
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_charge.username
     *
     * @param username the value for ku_finance_charge.username
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_charge.userid
     *
     * @return the value of ku_finance_charge.userid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_charge.userid
     *
     * @param userid the value for ku_finance_charge.userid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_charge.bank
     *
     * @return the value of ku_finance_charge.bank
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public String getBank() {
        return bank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_charge.bank
     *
     * @param bank the value for ku_finance_charge.bank
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setBank(String bank) {
        this.bank = bank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_charge.amount
     *
     * @return the value of ku_finance_charge.amount
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_charge.amount
     *
     * @param amount the value for ku_finance_charge.amount
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_charge.fee
     *
     * @return the value of ku_finance_charge.fee
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_charge.fee
     *
     * @param fee the value for ku_finance_charge.fee
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_charge.money
     *
     * @return the value of ku_finance_charge.money
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_charge.money
     *
     * @param money the value for ku_finance_charge.money
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_charge.sendtime
     *
     * @return the value of ku_finance_charge.sendtime
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public Integer getSendtime() {
        return sendtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_charge.sendtime
     *
     * @param sendtime the value for ku_finance_charge.sendtime
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setSendtime(Integer sendtime) {
        this.sendtime = sendtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_charge.receivetime
     *
     * @return the value of ku_finance_charge.receivetime
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public Integer getReceivetime() {
        return receivetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_charge.receivetime
     *
     * @param receivetime the value for ku_finance_charge.receivetime
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setReceivetime(Integer receivetime) {
        this.receivetime = receivetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_charge.editor
     *
     * @return the value of ku_finance_charge.editor
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public String getEditor() {
        return editor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_charge.editor
     *
     * @param editor the value for ku_finance_charge.editor
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setEditor(String editor) {
        this.editor = editor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_charge.status
     *
     * @return the value of ku_finance_charge.status
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_charge.status
     *
     * @param status the value for ku_finance_charge.status
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_charge.note
     *
     * @return the value of ku_finance_charge.note
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_charge.note
     *
     * @param note the value for ku_finance_charge.note
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setNote(String note) {
        this.note = note;
    }
}