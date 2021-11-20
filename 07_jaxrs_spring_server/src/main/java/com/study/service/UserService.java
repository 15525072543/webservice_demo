package com.study.service;

import com.study.pojo.User;

import javax.ws.rs.*;
import java.util.List;

/**
 * @ClassName: UserService
 * @Description:
 * @date: 2021/11/20
 * @author zhb
 */
// 访问当前服务接口对应的路径
@Path("/userService")
// 服务器支持返回的数据格式类型
@Produces("*/*")
public interface UserService {

    // 表示处理请求的类型，post对应的insert新增操作
    @POST
    // 访问当前方法对应的路径。【.../userService/user】
    @Path("/user")
    // 服务器支持请求的数据格式类型
    @Consumes({"application/xml","application/json"})
    public void saveUser(User user);

    // 表述处理请求的类型，put对应的是update修改操作
    @PUT
    @Path("/user")
    @Consumes({"application/xml","application/json"})
    public void updateUser(User user);

    // 表述处理请求的类型，get对应的是select查询操作
    @GET
    @Path("/user")
    @Produces({"application/xml","application/json"})
    public List<User> findUsers();

    @GET
    @Path("/user/{id}")
    @Consumes({"application/xml","application/json"})
    @Produces({"application/xml","application/json"})
    public User findUserById(@PathParam("id") Integer id);

    // 表述处理请求的类型，delete对应的是delete删除操作
    @DELETE
    @Path("/user/{id}")
    @Consumes({"application/xml","application/json"})
    public void deleteUser(@PathParam("id") Integer id);
}
