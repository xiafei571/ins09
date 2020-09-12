package com.edu.service.user;

import javax.servlet.http.HttpServletRequest;

import com.edu.service.request.CreateUserRequest;
import com.edu.service.response.OAuthUserResponse;
import com.edu.service.response.Result;

public interface UserService {

	/**
	 * 用户注册服务
	 * 
	 * @param createUserRequest
	 * @param checkUserNick
	 * @param httpServletRequest
	 * @return
	 */
	public Result<OAuthUserResponse> signupUser(CreateUserRequest createUserRequest, boolean checkUserNick,
			HttpServletRequest httpServletRequest);
}
