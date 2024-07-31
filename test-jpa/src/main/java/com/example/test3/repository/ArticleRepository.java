package com.example.test3.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.test3.entity.Article;

import jakarta.transaction.Transactional;

public interface ArticleRepository extends CrudRepository<Article, Long>{
	
	@Override
	ArrayList<Article> findAll();
	
	@Transactional //데이터에 직접 영향이가면
	@Modifying(clearAutomatically = true)
	@Query(value="update article set content='kkk' where id = :id" , nativeQuery = true)
	int updateTest(@Param("id")long id);

	

}
