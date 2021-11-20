package com.study.service;

import org.apache.cxf.bindings.xformat.ObjectFactory;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * @ClassName: HelloWebService
 * @Description: webService服务端接口
 * @date: 2021/11/18
 * @author zhb
 */
@WebService(targetNamespace = "http://service.study.com/", name = "HelloWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface HelloWebService {

    @WebMethod
    @RequestWrapper(localName = "sayHello", targetNamespace = "http://service.study.com/", className = "com.SayHello")
    @ResponseWrapper(localName = "sayHelloResponse", targetNamespace = "http://service.study.com/", className = "com.SayHelloResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String sayHello(
        @WebParam(name = "arg0", targetNamespace = "")
            java.lang.String arg0
    );
}
