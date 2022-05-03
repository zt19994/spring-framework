package com.zt1994;

import com.zt1994.bean.Emp;
import com.zt1994.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhongtao
 * @date 2022/3/10 18:19
 */
public class MyApplication {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Hello hello = (Hello) ac.getBean("hello");
		hello.sayHello();

		Book book = (Book) ac.getBean("book");
		book.readBook();

		/*Book book1 = (Book) ac.getBean("book1");
		book1.readBook();*/

		Order order = (Order) ac.getBean("order");
		order.addOrder();

		UserService userService = (UserService) ac.getBean("userService");
		userService.add();

		Emp emp = ac.getBean("emp", Emp.class);
		emp.add();

	}

}
