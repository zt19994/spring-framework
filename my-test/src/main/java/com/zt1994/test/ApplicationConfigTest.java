package com.zt1994.test;

import com.zt1994.config.SpringConfig;
import com.zt1994.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhongtao
 * @date 2022/3/10 18:19
 */
public class ApplicationConfigTest {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
		PersonService personService = ac.getBean("personService", PersonService.class);
		System.out.println(personService);
		personService.add();
	}

}
