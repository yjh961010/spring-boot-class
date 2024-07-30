package com.example.test.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.example.test.dto.StudentDTO;
public interface StudentDAO {
	public int insertStudent(StudentDTO dto);
	public List<StudentDTO> listStudent();
	public int deleteStudent(String id);
	List<StudentDTO> findStudent(String cname);
}
