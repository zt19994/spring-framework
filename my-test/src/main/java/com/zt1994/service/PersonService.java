package com.zt1994.service;

import com.zt1994.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 在注解里面value属性值可以省略不写
 * 默认值是类名称，首字母小写
 *
 * @author zhongtao
 * @date 2022/5/4 16:37
 */
@Service
public class PersonService {

	/**
	 * @Autowired 根据属性类型进行自动装配
	 */
	@Autowired
	@Qualifier(value = "personDao1Impl")
	private PersonDao personDao;

	@Value(value = "abc")
	private String name;

	public void add() {
		System.out.println("Service add");
		System.out.println(name);
		personDao.add();
	}
}
