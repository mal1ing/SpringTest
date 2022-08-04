package com.ghfkd1235.spring.ex.lifecycle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ghfkd1235.spring.ex.lifecycle.model.Post;

@RestController	// @Controller + @RequestBody

@RequestMapping("/lesson01/test02")
public class Test02Controller {
	
	
	@RequestMapping("/1")
	public List<Map<String, Object>> listMapResponse() {
		
		List<Map<String, Object>> movieList = new ArrayList<>();
		
		Map<String, Object> movie = new HashMap<>();
		movie.put("title", "기생충");
		movie.put("director", "봉준호");
		movie.put("time", 131);
		movie.put("rate", 15);
		movieList.add(movie);
		
		movie = new HashMap<>();
		movie.put("title", "인생은 아름다워");
		movie.put("director", "로베르토 베니니");
		movie.put("time", 116);
		movie.put("rate", 0);
		movieList.add(movie);
		
		movie = new HashMap<>();
		movie.put("title", "인셉션");
		movie.put("director", "크리스토퍼 놀란");
		movie.put("time", 147);
		movie.put("rate", 12);
		movieList.add(movie);
		
		return movieList;
		
	
		

	}
	@RequestMapping("/2")
	public List<Post> listObjectResponse() {
		
		List<Post> postList = new ArrayList<>();
		
		Post post = new Post();
		post.setTitle("hi");
		post.setUser("hagulu");
		post.setContent("hi");
		
		postList.add(post);
		
		post = new Post();
		post.setTitle("hg");
		post.setUser("ghfkd1235");
		post.setContent("gg");
		
		postList.add(post);
		
		return postList;
		
	}
	

	@RequestMapping("/3")
	public ResponseEntity<Post> entity() {
		Post post = new Post();
		post.setTitle("hi");
		post.setUser("hagulu");
		post.setContent("hi");
		
		ResponseEntity<Post> entity = new ResponseEntity(post, HttpStatus.INTERNAL_SERVER_ERROR);
		return entity;
		
		
	}

}
