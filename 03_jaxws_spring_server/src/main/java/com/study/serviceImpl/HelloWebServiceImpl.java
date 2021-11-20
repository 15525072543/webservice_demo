package com.study.serviceImpl;

import com.study.service.HelloWebService;

/**
 * @ClassName: HelloWebServiceImpl
 * @Description: webService服务层实现方法
 * @date: 2021/11/18
 * @author zhb
 */
public class HelloWebServiceImpl implements HelloWebService {
    public String sayHello(String name) {
        return name + ",wellcome to my school!";
    }
}
