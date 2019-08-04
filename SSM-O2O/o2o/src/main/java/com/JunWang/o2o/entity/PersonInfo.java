package com.JunWang.o2o.entity;

import java.util.Date;

public class PersonInfo {
	// 用户ID
	private Long userId;
	// 用户名称
	private String name;
	// 用户头像文件地址 
	private String profileImg;
	// user email
	private String email;
	// user gender
	private String gender;
	// user status
	private Integer enableStatus;
	// 这里定义：1.顾客 2.店家 3.超级管理员
	private Integer userType;
	private Date createTime;
	private Date lastEditTime;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrifileImg() {
		return profileImg;
	}

	public void setPrifileImg(String prifileImg) {
		this.profileImg = prifileImg;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getEnableStatus() {
		return enableStatus;
	}

	public void setEnableStatus(Integer enableStatus) {
		this.enableStatus = enableStatus;
	}

	public Integer getUserType() {
		return userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastEditTime() {
		return lastEditTime;
	}

	public void setLastEditTime(Date lastEditTime) {
		this.lastEditTime = lastEditTime;
	}

}
