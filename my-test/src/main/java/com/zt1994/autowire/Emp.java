package com.zt1994.autowire;

/**
 * 员工emp类
 *
 * @author zhongtao
 * @date 2022/5/3 17:06
 */
public class Emp {

	private Dept dept;

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Emp{" +
				"dept=" + dept +
				'}';
	}

	public void test() {
		System.out.println(dept);
	}
}
