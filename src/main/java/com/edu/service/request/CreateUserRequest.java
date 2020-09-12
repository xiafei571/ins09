package com.edu.service.request;

public class CreateUserRequest extends BaseUserRequest{
	
	private static final long serialVersionUID = -1945869208883502993L;
	
	private Long userId;

	private String accountNo;
	
	private String email;

    private String password;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
