package com.zt1994.service;

import org.springframework.stereotype.Component;

/**
 * 在注解里面value属性值可以省略不写
 * 默认值是类名称，首字母小写
 *
 * @author zhongtao
 * @date 2022/5/4 16:37
 */
@Component(value = "personService")
public class PersonService {

	public void add() {
		System.out.println("Service add");
	}
}
