package com.training.dao.impl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.training.entity.Course;
import com.training.entity.CourseDao;
import com.training.entity.Student;
import com.training.utils.DbConnection;

public class CourseDaoImpl implements CourseDao {
	
	private Connection con;
	
	
	public CourseDaoImpl() {
		super();
		con=DbConnection.getOracleConnection();
	}

	@Override
	public int addCourse(Course course) throws SQLException {
		String sql = "insert into course values(?,?)";
		PreparedStatement pstmt = null;
		int rowAdded;
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, course.getCourseId());
		pstmt.setString(2, course.getCourseName());
		
		rowAdded = pstmt.executeUpdate();
		pstmt.close();
		return rowAdded;
	}

	@Override
	public int addStudent(Student student) throws SQLException {
		String sql = "insert into studentas values(?,?,?)";
		PreparedStatement pstmt =null;
		int rowAdded;
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, student.getStudentId());
		pstmt.setString(2, student.getStudentName());
		pstmt.setInt(3, student.getCourseId());
		
		rowAdded = pstmt.executeUpdate();
		pstmt.close();
		return rowAdded;
	}

	@Override
	public List<Student> displayStudentsByCourse(int courseId) throws SQLException {
		String sql = "select * from studentas s inner join course c on s.courseid=c.courseid where s.courseid=?";
		PreparedStatement pstmt = null;
		List<Student> studentList = new ArrayList<>();
		pstmt= con.prepareStatement(sql);
		pstmt.setInt(1, courseId);
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()){
			int studentId = rs.getInt("studentId");
			String studentName = rs.getString("studentName");
			int courseid = rs.getInt("courseId");
			
			Student student =new Student(studentId, studentName, courseid);
			studentList.add(student);
		}
		pstmt.close();
		return studentList;
	}

}
