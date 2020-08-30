package com.nateshao.consumer.client;

import com.nateshao.consumer.client.fallback.UserClientFallback;
import com.nateshao.consumer.feigin.FeignConfig;
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
@FeignClient(value = "user-service",fallback = UserClientFallback.class,configuration = FeignConfig.class)
public interface UserClient {

    //http://user-service/user/123      此地址要真实存在
    @GetMapping("/user/{id}")
    User queryById(@PathVariable Long id);


    /*
    * 查看8080端口占用pid: netstat -ano | findstr 8080
    *
    * 停掉：taskkill /F /PID 12100
    * */
}
