<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>
<div class="container">
	<form action="#" onsubmit="updatePost()">
		<div class="form-group">
			<label for="title">Title:</label>
			 <input id="title" value="${postEntity.title}" type="text" class="form-control" placeholder="Enter username" name="title" required="required" />
		</div>
		<div class="form-group">
			<textarea id="content" rows="10" class="form-control" name="content">
				"${postEntity.content}"
			</textarea>
		</div>

		<button type="submit" class="btn btn-primary">글쓰기 수정 완료</button>
	</form>
</div>


<script>
	
	// async를 붙여서 non-blocking 구현
	async function updatePost() {
		alert("나실행됨?");
		console.log(event);
		event.preventDefault(); // submit 동작을 막는다. -> form 태그야 일하지마 내가할게
		
		let title = document.querySelector("#title").value;
		let content = document.querySelector("#content").value;
		
		console.log(title);
		console.log(content);
		
		let updateDto = {
				title:title,
				content:content
		};
		
		// await 로 기다려준다					// 여기서 $를 쓰면 `$`을 쓰지 못한다, el표현식과 같이 쓰여지기 때문에 곂쳐져서 쓰지 못한다.
		//											// 자바스크립트가 해석되기전에 el표현식을 읽기 때문이다.
		let response = await fetch("/post/${postEntity.id}", {
			method: "put",
			body: JSON.stringify(updateDto),
			headers: {
				"Content-Type": "application/json;charset=utf-8"
			}
		});
		let parseResponse = await response.text(); // json(), text()
		
		console.log(parseResponse);
		
		if(parseResponse === "ok"){
			location.href="/post/${postEntity.id}";
		} else{
			location.href="/auth/loginForm";
		}
	}

	$(document).ready(function() {
		$('#content').summernote();
		// @param {Number} line height - unit is px
		$('#content').summernote('lineHeight', 30);
	});
</script>

<%@ include file="../layout/footer.jsp"%>