package com.edu.service.dept.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.domain.DeptInfo;
import com.edu.mapper.DeptMapper;
import com.edu.service.dept.DeptService;
import com.edu.service.exception.ErrorCodeEnum;
import com.edu.service.response.Result;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptMapper deptMapper;

	@Override
	public Result<DeptInfo> getDeptById(Integer deptno) {
		DeptInfo dept = deptMapper.getDeptById(deptno);
		if(null == dept) {
			return new Result<DeptInfo>(ErrorCodeEnum.DEPT_NOT_EXIST, dept);
		}
		return new Result<DeptInfo>(dept);
	}

}
