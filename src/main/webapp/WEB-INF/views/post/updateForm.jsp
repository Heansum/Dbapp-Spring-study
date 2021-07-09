<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>
<div class="container">
	<form action="/post/${postEntity.id}/update" method="post">
		<div class="form-group">
			<label for="title">Title:</label> 
			<input value="${postEntity.title}" type="text" class="form-control" placeholder="Enter username" name="title" required="required" />
		</div>
		<div class="form-group">
			<textarea id="summernote" rows="10" class="form-control" name="content">
				"${postEntity.content}"
			</textarea>
		</div>

		<button type="submit" class="btn btn-primary">글쓰기 수정 완료</button>
	</form>
</div>

<script>
	$(document).ready(function() {
		$('#summernote').summernote();
		// @param {Number} line height - unit is px
		$('#summernote').summernote('lineHeight', 30);
	});
</script>

<%@ include file="../layout/footer.jsp"%>