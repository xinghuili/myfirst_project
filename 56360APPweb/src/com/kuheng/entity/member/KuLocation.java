package com.kuheng.entity.member;

import java.io.Serializable;

public class KuLocation implements Serializable{

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ku_location.itemid
	 * @mbggenerated
	 */
	private Integer itemid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ku_location.ordersid
	 * @mbggenerated
	 */
	private Long ordersid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ku_location.userid
	 * @mbggenerated
	 */
	private Long userid;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ku_location.longitude
	 * @mbggenerated
	 */
	private Double longitude;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ku_location.latitude
	 * @mbggenerated
	 */
	private Double latitude;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ku_location.deatiladdress
	 * @mbggenerated
	 */
	private String deatiladdress;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column ku_location.addtime
	 * @mbggenerated
	 */
	private Integer addtime;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ku_location.itemid
	 * @return  the value of ku_location.itemid
	 * @mbggenerated
	 */
	public Integer getItemid() {
		return itemid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ku_location.itemid
	 * @param itemid  the value for ku_location.itemid
	 * @mbggenerated
	 */
	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ku_location.ordersid
	 * @return  the value of ku_location.ordersid
	 * @mbggenerated
	 */
	public Long getOrdersid() {
		return ordersid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ku_location.ordersid
	 * @param ordersid  the value for ku_location.ordersid
	 * @mbggenerated
	 */
	public void setOrdersid(Long ordersid) {
		this.ordersid = ordersid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ku_location.userid
	 * @return  the value of ku_location.userid
	 * @mbggenerated
	 */
	public Long getUserid() {
		return userid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ku_location.userid
	 * @param userid  the value for ku_location.userid
	 * @mbggenerated
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ku_location.longitude
	 * @return  the value of ku_location.longitude
	 * @mbggenerated
	 */
	public Double getLongitude() {
		return longitude;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ku_location.longitude
	 * @param longitude  the value for ku_location.longitude
	 * @mbggenerated
	 */
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ku_location.latitude
	 * @return  the value of ku_location.latitude
	 * @mbggenerated
	 */
	public Double getLatitude() {
		return latitude;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ku_location.latitude
	 * @param latitude  the value for ku_location.latitude
	 * @mbggenerated
	 */
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ku_location.deatiladdress
	 * @return  the value of ku_location.deatiladdress
	 * @mbggenerated
	 */
	public String getDeatiladdress() {
		return deatiladdress;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ku_location.deatiladdress
	 * @param deatiladdress  the value for ku_location.deatiladdress
	 * @mbggenerated
	 */
	public void setDeatiladdress(String deatiladdress) {
		this.deatiladdress = deatiladdress == null ? null : deatiladdress
				.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column ku_location.addtime
	 * @return  the value of ku_location.addtime
	 * @mbggenerated
	 */
	public Integer getAddtime() {
		return addtime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column ku_location.addtime
	 * @param addtime  the value for ku_location.addtime
	 * @mbggenerated
	 */
	public void setAddtime(Integer addtime) {
		this.addtime = addtime;
	}
}