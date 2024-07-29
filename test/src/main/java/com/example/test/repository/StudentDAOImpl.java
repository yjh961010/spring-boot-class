package com.example.test.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.test.dto.StudentDTO;
@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insertStudent(StudentDTO dto) {
		String sql= "insert into student values(?,?,?)";
		Object[] values = new Object[] {dto.getId(), dto.getName(), dto.getCname()};
		int res = jdbcTemplate.update(sql , values);
		return res;
	}

	@Override
	public List<StudentDTO> listStudent() {
		String sql = "select *from student";
		RowMapper<StudentDTO> mapper = new RowMapper<StudentDTO>() {

			@Override
			public StudentDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				StudentDTO dto = new StudentDTO();
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setCname(rs.getString("cname"));
				return dto;
			}
		};
		List<StudentDTO> list = jdbcTemplate.query(sql, mapper);
		return list;
		
	}

	@Override
	public List<StudentDTO> findStudent(String cname) {
		String sql = "select * from student where cname= ?";
		RowMapper<StudentDTO> mapper = new RowMapper<StudentDTO>() {

			@Override
			public StudentDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				StudentDTO dto = new StudentDTO();
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setCname(rs.getString("cname")); 
				return dto;
			}	
		};
		List <StudentDTO> list = jdbcTemplate.query(sql,mapper,cname);
		
		return list;
	}

	@Override
	public int deleteStudent(String id) {
		String sql = "delete from student where id = ?";
		int res = jdbcTemplate.update(sql,id);
		return res;
	}

}
