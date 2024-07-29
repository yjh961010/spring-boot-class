package com.example.test.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.dto.StudentDTO;

@Service
public class StudentMapper {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<StudentDTO> listStudent(){
		return sqlSession.selectList("mybatis.student.student-mapper.studentlist");
	}
	public List<StudentDTO> findStudent(String cname){
		return sqlSession.selectList("findStudent", cname);
	}
	
	public int insertStudent(StudentDTO dto) {
		return sqlSession.insert("insertStudent", dto);
	}
	
	public int deleteStudent(String id) {
		return sqlSession.delete("deleteStudent", id);
	}
}
