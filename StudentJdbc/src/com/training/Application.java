package com.training;

import java.sql.SQLException;
import java.util.List;

import com.training.dao.impl.CourseDaoImpl;
import com.training.entity.Course;
import com.training.entity.CourseDao;
import com.training.entity.Student;
import com.training.utils.DbConnection;

public class Application {

	public static void main(String[] args) {
		System.out.println(DbConnection.getOracleConnection());
		
		CourseDao dao = new CourseDaoImpl();
		int key =2;
		
		switch (key) {
			case 1:
				Course datastructure = new Course(101, "DataStructures");
				Course java	= new Course(102,"Java");
				Student sam = new Student(11, "Sam", 101);
				Student john = new Student(12,"John",101);
				Student rick = new Student(13,"Rick",102);
				try {
					System.out.println(dao.addCourse(datastructure));
					System.out.println(dao.addCourse(java));
					System.out.println(dao.addStudent(sam));
					System.out.println(dao.addStudent(john));
					System.out.println(dao.addStudent(rick));
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			case 2:
				try {
					List<Student> studentList = dao.displayStudentsByCourse(102);
					studentList.forEach(System.out::println);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
			default:
				break;
		}
	}

}
