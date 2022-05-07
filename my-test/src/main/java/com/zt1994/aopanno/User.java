package com.zt1994.aopanno;

import org.springframework.stereotype.Component;

/**
 * 被增强类
 *
 * @author zhongtao
 * @date 2022/5/7 21:37
 */
@Component
public class User {

	public void add() {
		System.out.println("add");
	}
}
