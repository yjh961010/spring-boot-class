package com.example.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.test.dto.BoardDTO;
import com.example.test.mapper.BoardMapper;

@Controller
public class BoardController {
	@Autowired
	private BoardMapper boardMapper;
	
	@RequestMapping("/list_board.do")
	private String listBoard1(Model model) {
		List<BoardDTO>list = boardMapper.listBoard();
		model.addAttribute("listBoard",list);
		return "/list";
	}
	@GetMapping("/write_board.do")
	private String write() {
		return "/writeForm";
	}
	
	@PostMapping("/write_board.do")
	private String writeBoard1(BoardDTO dto) {
		int res = boardMapper.insertBoard(dto);
		return "redirect:/list_board.do";
	}
	@RequestMapping("/content_board.do")
	private String contentBoard(int num) {
		List<BoardDTO>list = boardMapper.getBoard(num);
		return "/content";
	}
	@RequestMapping("/updateForm_board.do")
	private String update() {
		return "/updateForm";
	}
	@RequestMapping("/updatePro_board.do")
	private String updateForm(int num) {
		int res = boardMapper.updateBoard(num);
		return "redirect:/list_board.do";
	}
	@RequestMapping("/deleteForm_board.do")
	private String delete() {
		return "/deleteForm";
	}
	@RequestMapping("/deletePro_board.do")
	private String deleteForm(int num) {
		int res = boardMapper.deleteBoard(num);
		return "redirect:/list_board.do";
	}
}
