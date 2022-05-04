package com.zt1994.test;

import com.zt1994.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhongtao
 * @date 2022/3/10 18:19
 */
public class ApplicationTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:application.xml");
		PersonService personService = ac.getBean("personService", PersonService.class);
		System.out.println(personService);
		personService.add();
	}

}
