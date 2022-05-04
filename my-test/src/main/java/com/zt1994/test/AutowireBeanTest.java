package com.zt1994.test;

import com.zt1994.autowire.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhongtao
 * @date 2022/3/10 18:19
 */
public class AutowireBeanTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContextAutowire.xml");
		Emp emp = ac.getBean("emp", Emp.class);
		System.out.println(emp);
	}

}
