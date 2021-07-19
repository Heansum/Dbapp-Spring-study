package com.korea.dbapp.test;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.korea.dbapp.domain.comment.Comment;
import com.korea.dbapp.domain.post.Post;
import com.korea.dbapp.domain.post.PostRepository;

@RestController
public class PostApiControllerTest {
	
	private final PostRepository postRepository;

	public PostApiControllerTest(PostRepository postRepository) {
		this.postRepository = postRepository;
	}
	
	@GetMapping("/test/post")
	public List<Post> findAll() {
		return postRepository.findAll();
	}
	
	@GetMapping("/test/post/{id}")
	public String findById(@PathVariable int id) {
		Post postEntity = postRepository.findById(id).get();
		return "ok";
	}
	
	//https://www.juso.go.kr/addrlink/addrLinkUrl.do?confmKey=devU01TX0FVVEgyMDIxMDcwNTE3MjgyMzExMTM2MTE=&returnUrl=http://localhost:8000
	
	
}
