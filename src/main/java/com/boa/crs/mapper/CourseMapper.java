package com.boa.crs.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.boa.crs.bean.Course;


public class CourseMapper implements RowMapper<Course> {

	@Override
	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Course course = new Course();
		course.setCourseId(rs.getInt("id"));
		course.setCourseName(rs.getString("name"));
		return course;
	}

}
