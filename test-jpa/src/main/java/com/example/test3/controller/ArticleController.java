package com.example.test3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.test3.dto.ArticleForm;
import com.example.test3.entity.Article;
import com.example.test3.repository.ArticleRepository;



@Controller
public class ArticleController {
	@Autowired
	ArticleRepository articleRepository;
	
	@GetMapping("/")
	public String index() {
		int res = articleRepository.updateTest(1l);
		return "index";
	}
	@GetMapping("/articles")
	public String list(Model model) {
		//1. 모든 데이터 가져오기
		List<Article> articleEntityList= articleRepository.findAll(); 
		//2. Model에 가져온 데이터넣기
		model.addAttribute("articleList",articleEntityList);
		//3. view페이지로 이동하기
		return "list";
		
	}
	@GetMapping("/articles/new")
	public String articleForm() {
		return "inputForm";
	}
	@PostMapping("/articles/create")
	public String createArticle(ArticleForm articleForm) {
		//1.DTO를 Entitiy로 변환하기(articleForm에서 toEntity(테이블values) 만들어야함
		//public Article toEntity() {
		//return new Article(id , title , content);
		//System.out.println("dto = "+ articleForm.toString());
		Article article = articleForm.toEntity();
		//2.reopository로 엔티티를 db에 저장하기
		
		Article saved = articleRepository.save(article);
		System.out.println(saved.toString());
		System.out.println(article.getTitle());
		System.out.println(article.getContent());
		return "redirect:/articles";
	}
	@GetMapping("/articles/{id}")
	public String getArticle(@PathVariable long id, Model model) {
		Article article = articleRepository.findById(id).orElse(null);
		//값이있으면 나오고 없으면 null
		model.addAttribute("getArticle",article);
		return "show";	
	}
	@PostMapping("/articles/update")
	public String updateArticle(ArticleForm ArticleForm) {
		Article article = ArticleForm.toEntity();
		//수정하기전에 id가 먼저 존재하는지 확인하기
		Article exist = articleRepository.findById(article.getId()).orElse(null);
		if(exist != null) { //기존데이터가 존재하면 갱신하기
			articleRepository.save(article);
		}
		return "redirect:/articles";
	}
	@GetMapping("/article/{id}/delete")
	public String delete(@PathVariable Long id) {
		//1.삭제할 대상을 가져오기
		Article article = articleRepository.findById(id).orElse(null);
		//2.대상 엔티티삭제하기
		if(article !=null) {
			articleRepository.delete(article);
		}
		//3.페이지이동 (viewresolver 영향안받기위해 redirect사용해줌)
	return	"redirect:/articles";
	}
}
