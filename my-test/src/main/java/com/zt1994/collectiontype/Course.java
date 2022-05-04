package com.zt1994.collectiontype;

/**
 * @author zhongtao
 * @date 2022/5/4 10:54
 */
public class Course {

	/**
	 * 课程名称
	 */
	private String courseName;

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Course{" +
				"courseName='" + courseName + '\'' +
				'}';
	}
}
