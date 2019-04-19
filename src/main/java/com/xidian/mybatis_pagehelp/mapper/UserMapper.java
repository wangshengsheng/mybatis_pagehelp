package com.xidian.mybatis_pagehelp.mapper;

import com.xidian.mybatis_pagehelp.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {

	@Select("SELECT * FROM USER ")
	List<User> findUserList();
}
