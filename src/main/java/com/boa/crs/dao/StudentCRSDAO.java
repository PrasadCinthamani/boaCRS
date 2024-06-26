/**
 * 
 */
package com.boa.crs.dao;

import java.util.List;

import com.boa.crs.bean.Course;
import com.boa.crs.bean.Grade;
import com.boa.crs.bean.Student;

/**
 * @author Admin
 *
 */
public interface StudentCRSDAO {

	public void addStudent(Student student);
	public List<Student> listOfStudent();
	public Student getStudent(int id);
	public List<Course> listOfCourse(int id);
	public List<Grade> listOfGrade(int id);
	
}
