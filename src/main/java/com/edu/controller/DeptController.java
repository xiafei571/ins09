package com.edu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.edu.domain.DeptInfo;
import com.edu.service.dept.DeptService;
import com.edu.service.response.Result;

@Controller
@RequestMapping("/dept")
public class DeptController {
	@Autowired
	private DeptService deptService;

	@RequestMapping("/info/{id}")
	@ResponseBody
	public Result<DeptInfo> getDeptById(@PathVariable Integer id) {
		// 访问 http://localhost:8080/dept/info/10
		return deptService.getDeptById(id);
	}
}
