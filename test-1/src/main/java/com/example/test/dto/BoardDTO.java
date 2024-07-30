package com.example.test.dto;

import lombok.Data;

@Data
public class BoardDTO {
	private int num;
	private String writer;
	private String email;
	private String subject;
	private String passwd;
	private String reg_date;
	private int readcount;
	private String content;
	private String ip;
	
}
