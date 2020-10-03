package com.edu.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class UserInfo {
	// 用户ID
	@Id
	private Long userId;

	// 用户昵称
	private String userNick;

	// 用户描述
	private String userDesc;

	// 头像
	private String iconPath;

	// 市
	private String city;

	// 性别
	private Integer sex;

	// 生日
	private String birthday;

	// email
	private String email;

	// 手机号
	private String mobilePhone;

	// 开关
	private Integer onOff;

	// 创建时间 now()
	private Date gmtCreate;

	// 修改时间 now()
	private Date gmtModified;
	
	private UserCounter userCounter;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserNick() {
		return userNick;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

	public String getUserDesc() {
		return userDesc;
	}

	public void setUserDesc(String userDesc) {
		this.userDesc = userDesc;
	}

	public String getIconPath() {
		return iconPath;
	}

	public void setIconPath(String iconPath) {
		this.iconPath = iconPath;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public Integer getOnOff() {
		return onOff;
	}

	public void setOnOff(Integer onOff) {
		this.onOff = onOff;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public UserCounter getUserCounter() {
		return userCounter;
	}

	public void setUserCounter(UserCounter userCounter) {
		this.userCounter = userCounter;
	}
}
