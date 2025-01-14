package com.training.entity;

import java.sql.SQLException;
import java.util.List;

public interface CourseDao {
	public int addCourse(Course course) throws SQLException;
	public int addStudent(Student student) throws SQLException;
	public List<Student> displayStudentsByCourse(int courseId) throws SQLException;
}
