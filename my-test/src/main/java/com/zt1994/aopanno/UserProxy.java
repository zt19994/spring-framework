package com.zt1994.aopanno;

import org.springframework.stereotype.Component;

/**
 * 增强类
 *
 * @author zhongtao
 * @date 2022/5/7 21:39
 */
@Component
public class UserProxy {

	/**
	 * 前置通知
	 */
	public void before() {
		System.out.println("before");
	}
}
