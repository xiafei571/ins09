package com.edu.domain;

/**
 * 用户计数器
 * 
 * @author xiafei
 *
 */
public class UserCounter {

	// 作品数
	private Long opusCount = 0L;
	// 关注用户数
	private Long followingCount = 0L;
	// 粉丝数
	private Long followerCount = 0L;
	// 点赞数
	private Long praiseCount = 0l;

	public Long getOpusCount() {
		return opusCount;
	}

	public void setOpusCount(Long opusCount) {
		this.opusCount = opusCount;
	}

	public Long getFollowingCount() {
		return followingCount;
	}

	public void setFollowingCount(Long followingCount) {
		this.followingCount = followingCount;
	}

	public Long getFollowerCount() {
		return followerCount;
	}

	public void setFollowerCount(Long followerCount) {
		this.followerCount = followerCount;
	}

	public Long getPraiseCount() {
		return praiseCount;
	}

	public void setPraiseCount(Long praiseCount) {
		this.praiseCount = praiseCount;
	}
}
