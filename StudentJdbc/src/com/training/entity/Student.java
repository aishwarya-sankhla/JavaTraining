package com.training.entity;

import java.io.Serializable;

public class Student implements Serializable {
	private int studentId;
	private String studentName;
	private int courseId;
	
	public Student(int studentId, String studentName, int courseId) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.courseId = courseId;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", courseId=" + courseId + "]";
	}
	
}
