package com.edu.service.request;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BaseUserRequest implements Serializable{
	
	private static final long serialVersionUID = -7360063711806445402L;

	private String userNick;

    private String userDesc;

    private String iconPath;

    private Integer sex;

    private String city;
    
    public String getUserNick() {
        if (userNick != null){
            return userNick.trim();
        }
        return userNick;
    }

    public void setUserNick(String userNick) {
        if (userNick != null){
            userNick = userNick.trim();
        }
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

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
        return ReflectionToStringBuilder.toString(this);
	}
}
