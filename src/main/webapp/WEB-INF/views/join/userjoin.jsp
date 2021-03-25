<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div>
	<form action="/user/join" method="POST">
		<h3>선수 등록 페이지</h3>
		<input type="text" name="username" placeholder="선수 이름" /> 
		<input type="text" name="position" placeholder="포지션" /> 
		<input type="text" name="team" placeholder="팀 number" />
		<button>등록</button>
	</form>
</div>


</body>
</html>