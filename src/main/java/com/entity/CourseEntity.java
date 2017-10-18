package com.entity;
/**
 * 课程实体类 包括：课程编号(id)、课程名称(name)、课程所属学科(subject)、课程主讲人(speaker)
 * @author zhy
 *
 */
public class CourseEntity {
private String id;
private String name;
private String subject;
private String speaker;
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
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getSpeaker() {
	return speaker;
}
public void setSpeaker(String speaker) {
	this.speaker = speaker;
}
@Override
public String toString() {
	return "Course [id=" + id + ", name=" + name + ", subject=" + subject + ", speaker=" + speaker + "]";
}

}
