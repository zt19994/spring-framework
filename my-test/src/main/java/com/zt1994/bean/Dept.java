package com.zt1994.bean;

/**
 * dept
 *
 * @author zhongtao
 * @date 2022/5/3 17:05
 */
public class Dept {

	private String deptName;

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "Dept{" +
				"deptName='" + deptName + '\'' +
				'}';
	}
}
