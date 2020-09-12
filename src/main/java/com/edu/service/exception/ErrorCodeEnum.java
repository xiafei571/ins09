package com.edu.service.exception;

/**
 * 错误代码枚举
 * 
 * @author xiafei
 *
 */
public enum ErrorCodeEnum {

	/*
	 * 用户相关
	 */
	DUPLICATION_USER(0001, "用户已存在"), DUPLICATION_USER_ACCOUNT(0002, "用户账户已存在"), USER_NOT_EXIST(0004, "用户不存在"),
	NOT_FOLLOWING_ONESELF(0005, "不能关注自己"), FOLLOWING_USER_NOT_EXIST(0006, "关注用户不存在"),
	
	/*
	 * 部门相关
	 */
	DEPT_NOT_EXIST(1001, "部门不存在"),

	/*
	 * 通用
	 */
	INVALID_PARAMETER(9000, "非法参数"), INVALID_PROVIDERID(9001, "非法账号平台"), CONTENT_NOT_NULL(9002, "内容不能为空"),
	INVALID_INVITE_CODE(9003, "无效邀请码"), INVALID_USER_ACCOUNT_TYPE(9005, "非法账户类型"),
	INVALID_LOTTERY_USER(9006, "无效的中奖用户"), ORDER_MULTI_COMMIT(9010, "请求太过频繁"),
	API_DEPRECATED_NEED_UPDATE(9011, "请升级最新版本或者联系客服"), INIT_ERROR(9014, "初始化异常"), ALREADY_EXIST(9015, "数据已存在"),
	MULTI_UPDATE(9016, "重复请求"), SYSTEM_ERROR(9999, "系统异常");

	private int status;

	private String msg;

	private ErrorCodeEnum(int status, String msg) {
		this.status = status;
		this.msg = msg;
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
}
