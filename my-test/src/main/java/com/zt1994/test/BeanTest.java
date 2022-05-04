package com.zt1994.test;

import com.zt1994.bean.Orders;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhongtao
 * @date 2022/3/10 18:19
 */
public class BeanTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContextBean.xml");
		Orders orders = ac.getBean("orders", Orders.class);

		System.out.println("第四步 获取创建bean实例对象");
		System.out.println(orders);
		// 手动让orders bean实例销毁
		((ClassPathXmlApplicationContext) ac).close();
	}

}
