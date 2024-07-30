package com.example.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.test.dto.StudentDTO;
import com.example.test.mapper.StudentMapper;
import com.example.test.repository.StudentDAOImpl;
@Controller
public class StudentController {
	@Autowired
	private StudentDAOImpl studentDAO;
	@Autowired
	private StudentMapper studentMapper;
	
	@RequestMapping("/list.do")
	public String list (Model model) {
		List<StudentDTO>list = studentMapper.listStudent();
		//List<StudentDTO> list = studentDAO.listStudent();
		
		model.addAttribute("listStudent",list);
		return "/list";
	}
	@GetMapping("/insert.do")
	//@RequestMapping(value="/insert.do" , RequestMethod.GET)
	public String insertForm() {
		return "/insert";
	}
	@PostMapping("/insert.do")
	//@RequestMapping(value="/insert.do" , RequestMethod.POST)
	public String insert(StudentDTO dto) {
		int res = studentMapper.insertStudent(dto);
		//int res = studentDAO.insertStudent(dto);
		return "redirect:/welcome";
		
	}
	@GetMapping("/delete.do")
	
	public String deleteForm() {
		return "/delete";
	}
	@PostMapping("/delete.do")
	public String delete(@RequestParam String id) {
		int res = studentMapper.deleteStudent(id);
		return "redirect:welcome";
	}
	
	@GetMapping("/find.do")
	public String findForm() {
		return "find";
	}
	
	@PostMapping("/find.do")
	public String find(Model model, @RequestParam String cname) {
		List<StudentDTO> list = studentMapper.findStudent(cname);
		model.addAttribute("listStudent", list);
		return "list";
	}
	
}
