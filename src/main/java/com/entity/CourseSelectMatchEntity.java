package com.entity;
/**
 * 选课信息表 包含：选课操作编号(自增id)、学生学号(stuId)、课程编号(courseId)
 * @author zhy
 *
 */
public class CourseSelectMatchEntity {
private int id;				//选课操作编号(自增id)
private String stuId;		//学生学号(stuId)
private String courseId;	//课程编号(courseId)
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getStuId() {
	return stuId;
}
public void setStuId(String stuId) {
	this.stuId = stuId;
}
public String getCourseId() {
	return courseId;
}
public void setCourseId(String courseId) {
	this.courseId = courseId;
}
}
