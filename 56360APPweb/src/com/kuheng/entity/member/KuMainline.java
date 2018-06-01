package com.kuheng.entity.member;

import java.math.BigDecimal;

public class KuMainline {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ku_mainline.itemid
	 * @mbggenerated
	 */
	private Integer itemid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ku_mainline.userid
	 * @mbggenerated
	 */
	private Long userid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ku_mainline.fromcityid
	 * @mbggenerated
	 */
	private Integer fromcityid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ku_mainline.tocityid
	 * @mbggenerated
	 */
	private Integer tocityid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ku_mainline.addtime
	 * @mbggenerated
	 */
	private Integer addtime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ku_mainline.lasttime
	 * @mbggenerated
	 */
	private Integer lasttime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ku_mainline.carlong
	 * @mbggenerated
	 */
	private BigDecimal carlong;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ku_mainline.cartype
	 * @mbggenerated
	 */
	private String cartype;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ku_mainline.itemid
	 * @return  the value of ku_mainline.itemid
	 * @mbggenerated
	 */
	public Integer getItemid() {
		return itemid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ku_mainline.itemid
	 * @param itemid  the value for ku_mainline.itemid
	 * @mbggenerated
	 */
	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ku_mainline.userid
	 * @return  the value of ku_mainline.userid
	 * @mbggenerated
	 */
	public Long getUserid() {
		return userid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ku_mainline.userid
	 * @param userid  the value for ku_mainline.userid
	 * @mbggenerated
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ku_mainline.fromcityid
	 * @return  the value of ku_mainline.fromcityid
	 * @mbggenerated
	 */
	public Integer getFromcityid() {
		return fromcityid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ku_mainline.fromcityid
	 * @param fromcityid  the value for ku_mainline.fromcityid
	 * @mbggenerated
	 */
	public void setFromcityid(Integer fromcityid) {
		this.fromcityid = fromcityid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ku_mainline.tocityid
	 * @return  the value of ku_mainline.tocityid
	 * @mbggenerated
	 */
	public Integer getTocityid() {
		return tocityid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ku_mainline.tocityid
	 * @param tocityid  the value for ku_mainline.tocityid
	 * @mbggenerated
	 */
	public void setTocityid(Integer tocityid) {
		this.tocityid = tocityid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ku_mainline.addtime
	 * @return  the value of ku_mainline.addtime
	 * @mbggenerated
	 */
	public Integer getAddtime() {
		return addtime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ku_mainline.addtime
	 * @param addtime  the value for ku_mainline.addtime
	 * @mbggenerated
	 */
	public void setAddtime(Integer addtime) {
		this.addtime = addtime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ku_mainline.lasttime
	 * @return  the value of ku_mainline.lasttime
	 * @mbggenerated
	 */
	public Integer getLasttime() {
		return lasttime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ku_mainline.lasttime
	 * @param lasttime  the value for ku_mainline.lasttime
	 * @mbggenerated
	 */
	public void setLasttime(Integer lasttime) {
		this.lasttime = lasttime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ku_mainline.carlong
	 * @return  the value of ku_mainline.carlong
	 * @mbggenerated
	 */
	public BigDecimal getCarlong() {
		return carlong;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ku_mainline.carlong
	 * @param carlong  the value for ku_mainline.carlong
	 * @mbggenerated
	 */
	public void setCarlong(BigDecimal carlong) {
		this.carlong = carlong;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ku_mainline.cartype
	 * @return  the value of ku_mainline.cartype
	 * @mbggenerated
	 */
	public String getCartype() {
		return cartype;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ku_mainline.cartype
	 * @param cartype  the value for ku_mainline.cartype
	 * @mbggenerated
	 */
	public void setCartype(String cartype) {
		this.cartype = cartype == null ? null : cartype.trim();
	}
}