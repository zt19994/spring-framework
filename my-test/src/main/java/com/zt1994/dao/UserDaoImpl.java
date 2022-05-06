package com.zt1994.dao;

/**
 * UserDaoImpl
 *
 * @author zhongtao
 * @date 2022/5/3 16:50
 */
public class UserDaoImpl implements UserDao {

	/**
	 * 更新user
	 */
	@Override
	public void update() {
		System.out.println("dao update");
	}


	/**
	 * add
	 *
	 * @param a
	 * @param b
	 * @return
	 */
	@Override
	public int add(int a, int b) {
		System.out.println("方法执行中");
		return a + b;
	}
}
