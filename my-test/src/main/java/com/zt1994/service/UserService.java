package com.zt1994.service;

import com.zt1994.dao.UserDao;

/**
 * userService
 *
 * @author zhongtao
 * @date 2022/5/3 16:48
 */
public class UserService {

	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void add() {
		System.out.println("Service add");
		userDao.update();
	}
}
