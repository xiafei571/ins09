package com.edu.service.user.impl;

import javax.servlet.http.HttpServletRequest;

import com.edu.service.request.CreateUserRequest;
import com.edu.service.response.OAuthUserResponse;
import com.edu.service.response.Result;
import com.edu.service.user.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public Result<OAuthUserResponse> signupUser(CreateUserRequest createUserRequest, boolean checkUserNick,
			HttpServletRequest httpServletRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
