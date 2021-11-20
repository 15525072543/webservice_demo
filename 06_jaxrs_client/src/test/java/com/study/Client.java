package com.study;

import com.study.pojo.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.jws.WebService;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @ClassName: Client
 * @Description:
 * @date: 2021/11/20
 * @author zhb
 */
public class Client {

    @Test
    public void insertUser(){
        User user = new User();
        user.setId(100);
        user.setCity("北京");
        user.setUsername("xiaozhang");
        WebClient
            .create("http://localhost:8001/ws/userService/user")
            .type(MediaType.APPLICATION_JSON) //指定请求的数据格式为json
            .post(user);

    }

    @Test
    public void findAllUsers(){

        Collection<? extends User> collection = WebClient
            .create("http://localhost:8001/ws/userService/user")
            .accept(MediaType.APPLICATION_JSON) //指定响应的数据格式为json
            .getCollection(User.class); //发送get请求接收集合

        for (User user : collection) {
            System.out.println(user);
        }

    }

}
