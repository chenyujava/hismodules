package com.neuedu.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentMapper {

	/**
	 * 查询所有部门信息
	 * @return
	 */
	List<Map<String, Object>> getDeptList();
}
