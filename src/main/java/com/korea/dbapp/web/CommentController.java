package com.korea.dbapp.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.korea.dbapp.domain.comment.Comment;
import com.korea.dbapp.domain.comment.CommentRepository;
import com.korea.dbapp.domain.post.Post;
import com.korea.dbapp.domain.post.PostRepository;
import com.korea.dbapp.domain.user.User;
import com.korea.dbapp.web.dto.CMRespDto;
import com.korea.dbapp.web.dto.CommentSaveReqDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class CommentController {
	
	private final CommentRepository commentRepository;
	private final HttpSession session;
	private final PostRepository postRepository;
	
	// 1. save - Post - Data Return
	@PostMapping("/comment")
	public @ResponseBody CMRespDto<Comment> save(@RequestBody CommentSaveReqDto dto){
		
		User principal = (User) session.getAttribute("principal");
		int principalId = principal.getId();
		
		Comment comment = new Comment();
		comment.setText(dto.getText());
		
		Post postEntity = postRepository.findById(dto.getPostId()).get();
		postEntity.setId(dto.getPostId());
		comment.setPost(postEntity);
		
		comment.setUser(principal);
		int commentUserId = comment.getUser().getId();
		
		
		Comment commentEntity = null;
	
		
		if(principalId == commentUserId) {
			commentEntity = commentRepository.save(comment);
			return new CMRespDto<>(1, "댓글쓰기성공", commentEntity);
		} else {
			return new CMRespDto<>(-1, "댓글쓰기실패", commentEntity);
		}
		
	}
	
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
