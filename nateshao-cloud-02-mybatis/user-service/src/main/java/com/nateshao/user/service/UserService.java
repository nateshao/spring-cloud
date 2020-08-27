package com.nateshao.user.service;

import com.nateshao.user.mapper.UserMapper;
import com.nateshao.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @date Created by 邵桐杰 on 2020/8/27 23:08
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据主键查询用户
     * @param id 用户id
     * @return 用户
     */
    public User queryById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }
}
