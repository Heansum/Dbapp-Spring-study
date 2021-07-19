package com.korea.dbapp.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.korea.dbapp.domain.comment.Comment;
import com.korea.dbapp.domain.comment.CommentRepository;
import com.korea.dbapp.domain.post.Post;
import com.korea.dbapp.domain.post.PostRepository;
import com.korea.dbapp.domain.user.User;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class CommentController {
	
	private final CommentRepository commentRepository;
	private final HttpSession session;
	
	// 1. save - Post - Data Return
	
	// 2. delete - Delete (fetch 가 ajax, 비동기 함수)
	@DeleteMapping("/comment/{id}") // 이게 where절에 들어감, // 안드로이드면 api를 붙여줌
	public @ResponseBody String deleteById(@PathVariable int id) {
		User principal = (User) session.getAttribute("principal");
		int userId = principal.getId();
		
		Comment commentEntity = commentRepository.findById(id).get();
		int commentUserId = commentEntity.getUser().getId();
		
		if(userId == commentUserId) {
			commentRepository.deleteById(id);
			return "ok";	
		} else {
			return "fail";
		}
		
	} // end of deleteById
	
	
	// 3.
	
	
}
