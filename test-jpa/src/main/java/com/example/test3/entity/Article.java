package com.example.test3.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@SequenceGenerator(         
	      name = "article_seq_generator",
	      sequenceName = "article_seq",
	      initialValue = 1, allocationSize = 1)
//@Table(name="board")
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "article_seq_generator")
	private Long id;
	@Column
	private String title;
	@Column
	private String content;
	

}
