package com.study.service;

import javax.jws.WebService;

/**
 * @ClassName: HelloWebService
 * @Description: webService服务端接口
 * @date: 2021/11/18
 * @author zhb
 */
@WebService
public interface HelloWebService {
    /**
     * webservice服务端方法
     * @param name
     * @return
     */
    String sayHello(String name);
}
