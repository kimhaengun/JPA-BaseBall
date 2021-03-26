<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div>
	<form action="/stadium/join" method="POST">
		<h3>구장 등록 페이지</h3>
		<input type="text" name="stadiumname" placeholder="구장 이름" /> 
		<!-- <input type="text" name="team" placeholder="팀 Id" />  -->
		<button>등록</button>
	</form>
</div>


</body>
</html>