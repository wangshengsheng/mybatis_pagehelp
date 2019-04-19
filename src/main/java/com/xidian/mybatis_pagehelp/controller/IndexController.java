package com.xidian.mybatis_pagehelp.controller;

import com.github.pagehelper.PageInfo;
import com.xidian.mybatis_pagehelp.entity.User;
import com.xidian.mybatis_pagehelp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	@Autowired
	private UserService userService;

	@RequestMapping("/findUserList")
	public PageInfo<User> findUserList(int page, int size) {
		return userService.findUserList(page, size);
	}

}
