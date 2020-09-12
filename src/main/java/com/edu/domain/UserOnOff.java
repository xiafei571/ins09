package com.edu.domain;

/**
 * 用户开关
 * 
 * @author xiafei
 *
 */
public class UserOnOff {

	//点赞
	public static final int OPTIONS_NOTIFYPRAISE = 1;

	//评论
	public static final int OPTIONS_NOTIFYCOMMENT = 1 << 1;

	//转发
	public static final int OPTIONS_NOTIFYFORWARD = 1 << 2;

	//AT
	public static final int OPTIONS_NOTIFYAT = 1 << 3;

	//关注
	public static final int OPTIONS_FOLLOWING = 1 << 4;

	//系统
	public static final int OPTIONS_NOTIFYSYSTEM = 1 << 5;

	//私信
	public static final int OPTIONS_PRIVATE = 1 << 6;

	//与我相关
	public static final int OPTIONS_PARTICIPATE = 1 << 7;


	public static final int OPTIONS_NOTIFYALL = OPTIONS_NOTIFYPRAISE | OPTIONS_NOTIFYCOMMENT | OPTIONS_NOTIFYFORWARD
			| OPTIONS_NOTIFYAT | OPTIONS_FOLLOWING | OPTIONS_NOTIFYSYSTEM | OPTIONS_PRIVATE | OPTIONS_PARTICIPATE;

	private int value;

	public UserOnOff(int value) {
		this.value = value;
	}

	public void switchOptionsNotifypraise() {
		if (isOptionsNotifypraise()) {
			this.value = ~OPTIONS_NOTIFYPRAISE & value;
		}
		this.value = value | OPTIONS_NOTIFYPRAISE;

	}

	public boolean isOptionsNotifypraise() {
		return (OPTIONS_NOTIFYPRAISE & value) == OPTIONS_NOTIFYPRAISE;
	}

	public void switchOptionsNotifycomment() {
		if (isOptionsNotifycomment()) {
			this.value = ~OPTIONS_NOTIFYCOMMENT & value;
		}

		this.value = value | OPTIONS_NOTIFYCOMMENT;
	}

	public boolean isOptionsNotifycomment() {
		return (OPTIONS_NOTIFYCOMMENT & value) == OPTIONS_NOTIFYCOMMENT;
	}

	public void switchOptionsNotifyforward() {
		if (isOptionsNotifyforward()) {
			this.value = ~OPTIONS_NOTIFYFORWARD & value;
		}

		this.value = value | OPTIONS_NOTIFYFORWARD;
	}

	public boolean isOptionsNotifyforward() {
		return (OPTIONS_NOTIFYFORWARD & value) == OPTIONS_NOTIFYFORWARD;
	}

	public void switchOptionsNotifyat() {
		if (isOptionsNotifyat()) {
			this.value = ~OPTIONS_NOTIFYAT & value;
		}

		this.value = value | OPTIONS_NOTIFYAT;
	}

	public boolean isOptionsNotifyat() {
		return (OPTIONS_NOTIFYAT & value) == OPTIONS_NOTIFYAT;
	}

	public void switchOptionsFollowing() {
		if (isOptionsFollowing()) {
			this.value = ~OPTIONS_FOLLOWING & value;
		}

		this.value = value | OPTIONS_FOLLOWING;
	}

	public boolean isOptionsFollowing() {
		return (OPTIONS_FOLLOWING & value) == OPTIONS_FOLLOWING;
	}

	public void switchOptionsNotifysystem() {
		if (isOptionsNotifysystem()) {
			this.value = ~OPTIONS_NOTIFYSYSTEM & value;
		}

		this.value = value | OPTIONS_NOTIFYSYSTEM;
	}

	public boolean isOptionsNotifysystem() {
		return (OPTIONS_NOTIFYSYSTEM & value) == OPTIONS_NOTIFYSYSTEM;
	}

	public boolean isOptionsPrivate() {
		return (OPTIONS_PRIVATE & value) == OPTIONS_PRIVATE;
	}

	public boolean isOptionsParticipate() {
		return (OPTIONS_PARTICIPATE & value) == OPTIONS_PARTICIPATE;
	}

	public int getValue() {
		return value;
	}
}
