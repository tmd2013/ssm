package com.ffwang.familytask.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ffwang.familytask.pojo.User;
import com.ffwang.familytask.service.IUserService;
import com.ffwang.util.FTTools;

@Controller
public class FTHomeController {
	@Autowired
	private IUserService userservice;

	@RequestMapping("/hello")
	public String hello() {
		System.out.println("成功");
		return "succeed";
	}
	
	
	@RequestMapping("/alluser")
	@ResponseBody
	public String alluser() {
		List<User> users = userservice.queryAllUser();
		
		return FTTools.getResponseResultData(0, users, "succeed");
	}
}
