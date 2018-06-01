package com.kuheng.entity.member;

import java.io.Serializable;
import java.math.BigDecimal;

public class KuFinanceRecord implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_record.itemid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private Integer itemid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_record.ordid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private Long ordid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_record.username
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private String fusername;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_record.userid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private Long fuserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_record.orderid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private Long orderid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_record.balance
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private BigDecimal balance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_record.addtime
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private Integer addtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_record.apptype
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private Integer apptype;
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_record.bank
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private String bank;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_record.amount
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private BigDecimal amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_record.reason
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private String reason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_record.note
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private String note;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_record.editor
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private String editor;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_record.ip
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_finance_record.content
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private String content;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_record.itemid
     *
     * @return the value of ku_finance_record.itemid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public Integer getItemid() {
        return itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_record.itemid
     *
     * @param itemid the value for ku_finance_record.itemid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setItemid(Integer itemid) {
        this.itemid = itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_record.ordid
     *
     * @return the value of ku_finance_record.ordid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public Long getOrdid() {
        return ordid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_record.ordid
     *
     * @param ordid the value for ku_finance_record.ordid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setOrdid(Long ordid) {
        this.ordid = ordid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_record.username
     *
     * @return the value of ku_finance_record.username
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public String getFusername() {
        return fusername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_record.username
     *
     * @param username the value for ku_finance_record.username
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setFusername(String fusername) {
        this.fusername = fusername;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_record.userid
     *
     * @return the value of ku_finance_record.userid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public Long getFuserid() {
        return fuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_record.userid
     *
     * @param userid the value for ku_finance_record.userid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setFuserid(Long fuserid) {
        this.fuserid = fuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_record.orderid
     *
     * @return the value of ku_finance_record.orderid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public Long getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_record.orderid
     *
     * @param orderid the value for ku_finance_record.orderid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_record.balance
     *
     * @return the value of ku_finance_record.balance
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_record.balance
     *
     * @param balance the value for ku_finance_record.balance
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_record.apptype
     *
     * @return the value of ku_finance_record.apptype
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public Integer getApptype() {
        return apptype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_record.apptype
     *
     * @param addtime the value for ku_finance_record.apptype
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setApptype(Integer apptype) {
        this.apptype = apptype;
    }
    
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_record.addtime
     *
     * @return the value of ku_finance_record.addtime
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public Integer getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_record.addtime
     *
     * @param addtime the value for ku_finance_record.addtime
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }
    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_record.bank
     *
     * @return the value of ku_finance_record.bank
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public String getBank() {
        return bank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_record.bank
     *
     * @param bank the value for ku_finance_record.bank
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setBank(String bank) {
        this.bank = bank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_record.amount
     *
     * @return the value of ku_finance_record.amount
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_record.amount
     *
     * @param amount the value for ku_finance_record.amount
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_record.reason
     *
     * @return the value of ku_finance_record.reason
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public String getReason() {
        return reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_record.reason
     *
     * @param reason the value for ku_finance_record.reason
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_record.note
     *
     * @return the value of ku_finance_record.note
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_record.note
     *
     * @param note the value for ku_finance_record.note
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_record.editor
     *
     * @return the value of ku_finance_record.editor
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public String getEditor() {
        return editor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_record.editor
     *
     * @param editor the value for ku_finance_record.editor
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setEditor(String editor) {
        this.editor = editor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_record.ip
     *
     * @return the value of ku_finance_record.ip
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_record.ip
     *
     * @param ip the value for ku_finance_record.ip
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_finance_record.content
     *
     * @return the value of ku_finance_record.content
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_finance_record.content
     *
     * @param content the value for ku_finance_record.content
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setContent(String content) {
        this.content = content;
    }
}