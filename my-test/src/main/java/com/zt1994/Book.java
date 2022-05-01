package com.zt1994;

/**
 * 使用set方法进行属性注入
 *
 * @author zhongtao
 * @date 2022/5/1 22:11
 */
public class Book {

	/**
	 * 书名
	 */
	private String name;

	/**
	 * 作者
	 */
	private String author;

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void readBook() {
		System.out.println("read, " + name);
	}

}
