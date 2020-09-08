package com.nateshao.consumer.client.fallback;

import com.nateshao.consumer.client.UserClient;
import com.nateshao.consumer.pojo.User;
import org.springframework.stereotype.Component;

/**
 * @date Created by 邵桐杰 on 2020/8/31 0:06
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 */
@Component
public class UserClientFallback implements UserClient {

    @Override
    public User queryById(Long id) {
        User user = new User();
        user.setId(id);
        user.setUserName("用户异常");
        return user;
    }
}
