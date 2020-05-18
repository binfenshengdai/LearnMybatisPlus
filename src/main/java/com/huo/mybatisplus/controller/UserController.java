package com.huo.mybatisplus.controller;

import com.alibaba.fastjson.JSON;
import com.huo.mybatisplus.entity.User;
import com.huo.mybatisplus.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Api(value = "userController",tags = {"用户信息获取"})
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @Autowired
    private TestUtil testUtil;

//    @ResponseBody
//    @RequestMapping("/test")
//    public String test(){
//        return testUtil.getName();
//    }

    @ApiOperation(value = "获取所有的用户",notes = "以list形式获取用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "telephone", value = "电话号码", paramType = "query", required = true, dataType = "Integer"),
            @ApiImplicitParam(name = "name", value = "姓名", paramType = "query", required = true, dataType = "Integer")
    })
    //@ApiImplicitParam(name = "telephone", value = "电话号码", paramType = "query", required = true, dataType = "Integer")
    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String listUser(){
        List<User> list = userService.list();
        String result = JSON.toJSONString(list);
        return result;
    }
}
