package com.kuheng.entity.common;

public class ObjectJson {

	private String message;	//提示信息
	private String flag;	//
	private String token;   //登陆时的口令
	private String mobile;
	private Integer memberId;
	private Integer tokenId;
	
	
	
	
	
	
	public Integer getMemberId() {
		return memberId;
	}
	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}
	public Integer getTokenId() {
		return tokenId;
	}
	public void setTokenId(Integer tokenId) {
		this.tokenId = tokenId;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	
	
	
}
