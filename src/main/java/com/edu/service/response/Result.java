package com.edu.service.response;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.edu.service.exception.ErrorCodeEnum;
import com.edu.util.Const;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class Result<T> implements Serializable {

	private static final long serialVersionUID = -2208678659993084839L;

	// 是否成功标识
	private int status = 0;

	// 消息
	private String msg;

	// 返回的数据
	private T res;

	public Result() {
	}

	public Result(T res) {
		this.res = res;
	}

	public Result(ErrorCodeEnum errorCodeEnum, String extendMsg) {
		this.status = errorCodeEnum.getStatus();
		this.msg = errorCodeEnum.getMsg() + Const.WELL_NUMBER_SIGN + extendMsg;
	}

	public Result(ErrorCodeEnum errorCodeEnum) {
		this.status = errorCodeEnum.getStatus();
		this.msg = errorCodeEnum.getMsg();
	}

	public Result(int status, String msg) {
		this.status = status;
		this.msg = msg;
	}

	public Result(ErrorCodeEnum errorCodeEnum, T res) {
		this.status = errorCodeEnum.getStatus();
		this.msg = errorCodeEnum.getMsg();
		this.res = res;
	}

	@JsonIgnore
	public boolean isSuccess() {
		return status == 0 ? true : false;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getRes() {
		return res;
	}

	public void setRes(T res) {
		this.res = res;
	}

	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
	}

}
