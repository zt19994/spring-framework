package com.zt1994.collectiontype;

import java.util.List;

/**
 * @author zhongtao
 * @date 2022/5/4 10:59
 */
public class ReadBook {

	private List<String> list;

	public void setList(List<String> list) {
		this.list = list;
	}

	public void test() {
		System.out.println(list);
	}
}
