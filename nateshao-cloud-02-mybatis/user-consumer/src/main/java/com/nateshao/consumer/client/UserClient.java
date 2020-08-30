package com.nateshao.consumer.client;

import com.nateshao.consumer.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @date Created by 邵桐杰 on 2020/8/30 21:36
 * @微信公众号 千羽的编程时光
 * @个人网站 www.nateshao.cn
 * @博客 https://nateshao.gitee.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 */
//声明当前类是一个Feign客户端，指定服务名为user-service
@FeignClient(value = "user-service")
public interface UserClient {

    //http://user-service/user/123      此地址要真实存在
    @GetMapping("/user/{id}")
    User queryById(@PathVariable Long id);
}
