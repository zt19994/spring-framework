package com.zt1994.dao;

import org.springframework.stereotype.Repository;

/**
 * @author zhongtao
 * @date 2022/5/4 17:05
 */
@Repository(value = "personDaoImpl")
public class PersonDaoImpl implements PersonDao {

	/**
	 * add
	 */
	@Override
	public void add() {
		System.out.println("PersonDao add");
	}
}
