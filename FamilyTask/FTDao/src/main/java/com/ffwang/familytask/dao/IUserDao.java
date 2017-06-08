package com.ffwang.familytask.dao;

import java.util.List;

import com.ffwang.familytask.pojo.User;

public interface IUserDao {
	List<User> queryAllUser();
}
