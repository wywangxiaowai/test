package com.example.swagger2.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.swagger2.model.User;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@Api(value = "UserController", description = "这是用户操作类")
public class UserController {

	@ApiOperation(value = "通过userid获取user", response = User.class, httpMethod = "GET")
	@RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
	public User getUser(@ApiParam(value = "用户id", required = true) @PathVariable("id") Integer id) {
		return new User(1, "小黑", "123");
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	@ApiImplicitParam(name = "User", value = "用户的实体类")
	public String addUser(@RequestBody User user) {
		System.out.println(user);
		return "success";
	}

	public void test() {
		System.out.println("hello");
		System.out.println("word");
		System.out.println("你好");
		System.out.println("不好");
		System.out.println("真不好");
		System.out.println("第二次瞅瞅图");
	}
}
