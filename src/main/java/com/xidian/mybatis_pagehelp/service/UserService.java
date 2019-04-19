package com.xidian.mybatis_pagehelp.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xidian.mybatis_pagehelp.entity.User;
import com.xidian.mybatis_pagehelp.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * page 当前页数<br>
     * size 当前展示的
     * 数据<br>
     *
     * @param page
     * @param size
     * @return
     */
    public PageInfo<User> findUserList(int page, int size) {
        // 开启分页插件,放在查询语句上面
        PageHelper.startPage(page, size);
        List<User> listUser = userMapper.findUserList();
        // 封装分页之后的数据
        PageInfo<User> pageInfoUser = new PageInfo<User>(listUser);
        return pageInfoUser;
    }

}
