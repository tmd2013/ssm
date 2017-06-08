package com.ffwang.familytask.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ffwang.familytask.dao.IUserDao;
import com.ffwang.familytask.pojo.User;
import com.ffwang.familytask.service.IUserService;

@Service(value="IUserService")
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userdao;
	
	@Override
	public List<User> queryAllUser() {
		return userdao.queryAllUser();
	}

}
