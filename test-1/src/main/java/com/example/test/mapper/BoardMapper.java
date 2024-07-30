package com.example.test.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.dto.BoardDTO;

@Service
public class BoardMapper {
	@Autowired
	private SqlSession sqlSession;
	
	public int insertBoard(BoardDTO dto) {
		return  sqlSession.insert("insertBoard", dto);	
	}
	public List<BoardDTO> listBoard(){
		List<BoardDTO>list = sqlSession.selectList("listBoard");
		return list;
	}  
	public List<BoardDTO> getBoard(int num){
		List<BoardDTO>list = sqlSession.selectList("getBoard",num);
		return list;
	}
	public int updateBoard(int num) {
		int res = sqlSession.update("updateBoard" , num);
		return res;
	}
	public int deleteBoard(int num) {
		int res = sqlSession.delete("deleteBoard" , num);
		return res;
	}

}
