package com.edu.service.dept;

import com.edu.domain.DeptInfo;
import com.edu.service.response.Result;

public interface DeptService {
	Result<DeptInfo> getDeptById(Integer deptno);
}
