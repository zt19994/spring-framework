package com.zt1994.test;

import com.zt1994.dao.UserDao;
import com.zt1994.dao.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * JDK动态代理
 *
 * @author zhongtao
 * @date 2022/5/6 22:48
 */
public class JDKProxy {

	public static void main(String[] args) {
		Class[] interfaces = {UserDao.class};
		UserDaoImpl userDao = new UserDaoImpl();
		UserDao instance = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
		int result = instance.add(1, 2);
		System.out.println(result);
	}
}

class UserDaoProxy implements InvocationHandler {

	private Object obj;

	public UserDaoProxy(Object obj) {
		this.obj = obj;
	}

	/**
	 * 增强逻辑
	 *
	 * @param proxy
	 * @param method
	 * @param args
	 * @return
	 * @throws Throwable
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("方法执行前:" + method.getName() + ", 参数:" + Arrays.toString(args));
		// 被增强的方法执行
		Object res = method.invoke(obj, args);
		System.out.println("方法执行后:" + obj);
		return res;
	}
}
