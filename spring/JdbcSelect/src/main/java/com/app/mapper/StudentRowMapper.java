package com.app.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.app.bean.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int count) throws SQLException {
		Student s=new Student();
		s.setSid(rs.getInt(1));
		s.setSname(rs.getString(2));
		s.setScourse(rs.getString(3));
		s.setSfee(rs.getDouble(4));
		return s;
	}
	

}
