package com.kuheng.entity.member;

import java.io.Serializable;

public class KuSendorders implements Serializable{
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_sendorders.itemid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private Long itemid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_sendorders.ordersid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private Long ordersid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_sendorders.userid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private Long userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_sendorders.editer
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private String editer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_sendorders.addtime
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private Integer addtime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_sendorders.isend
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private Boolean isend;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ku_sendorders.status
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    private Boolean status;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_sendorders.itemid
     *
     * @return the value of ku_sendorders.itemid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public Long getItemid() {
        return itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_sendorders.itemid
     *
     * @param itemid the value for ku_sendorders.itemid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setItemid(Long itemid) {
        this.itemid = itemid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_sendorders.ordersid
     *
     * @return the value of ku_sendorders.ordersid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public Long getOrdersid() {
        return ordersid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_sendorders.ordersid
     *
     * @param ordersid the value for ku_sendorders.ordersid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setOrdersid(Long ordersid) {
        this.ordersid = ordersid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_sendorders.userid
     *
     * @return the value of ku_sendorders.userid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_sendorders.userid
     *
     * @param userid the value for ku_sendorders.userid
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_sendorders.editer
     *
     * @return the value of ku_sendorders.editer
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public String getEditer() {
        return editer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_sendorders.editer
     *
     * @param editer the value for ku_sendorders.editer
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setEditer(String editer) {
        this.editer = editer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_sendorders.addtime
     *
     * @return the value of ku_sendorders.addtime
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public Integer getAddtime() {
        return addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_sendorders.addtime
     *
     * @param addtime the value for ku_sendorders.addtime
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_sendorders.isend
     *
     * @return the value of ku_sendorders.isend
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public Boolean getIsend() {
        return isend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_sendorders.isend
     *
     * @param isend the value for ku_sendorders.isend
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setIsend(Boolean isend) {
        this.isend = isend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ku_sendorders.status
     *
     * @return the value of ku_sendorders.status
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ku_sendorders.status
     *
     * @param status the value for ku_sendorders.status
     *
     * @mbggenerated Sun May 21 11:13:41 CST 2017
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }
}