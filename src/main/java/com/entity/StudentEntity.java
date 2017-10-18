package com.entity;

import java.util.Arrays;
/**
 * 学生实体类，包含的学生基本信息包括： 学号(id)、姓名(name)、登录密码(password)、年级(grade)、专业(major)、已选课程(courses)
 * @author zhy
 *
 */
public class StudentEntity {
	private String id;			// 学号(id)
	private String name;		//姓名(name)
	private String password;	//登录密码(password)
	private String grade;		//年级(grade)
	private String major;		//专业(major)
	private String[] courses;	//已选课程(courses)

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + ", courses=" + Arrays.toString(courses)
				+ "]";
	}
}
