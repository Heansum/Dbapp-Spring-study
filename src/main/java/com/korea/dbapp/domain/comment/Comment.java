package com.korea.dbapp.domain.comment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.korea.dbapp.domain.post.Post;
import com.korea.dbapp.domain.user.User;

import lombok.Data;

@Data // Getter, Setter, toString을 자동으로 만들어줌
@Entity
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; // 프라이머리(기본키) -> 프라이머리 키를 넣으면 데이터가 정리되어서 index로 만들어짐
	// 나중에 검색으로 찾을 때 프라이머리로 만들지 않으면, 풀 스캔을 한다, 프라이머리 키로 만들어 내면 iddex로 정리되어서 검색할 때 쉽게 검색한다.
	private String text;
	
	@JsonIgnoreProperties({"posts"})
	@JoinColumn(name = "user_id") // 포린키 만들거면 이렇게 만들어줘
	@ManyToOne
	private User user; // 포린키는 N에 적어둔다.
	
	@JsonIgnoreProperties({"user"})
	@JoinColumn(name = "post_id")
	@ManyToOne
	private Post post;
	
	
}
