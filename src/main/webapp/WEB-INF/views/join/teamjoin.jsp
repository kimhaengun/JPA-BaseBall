<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div>
	<form action="/team/join" method="POST">
		<h3>팀 등록 페이지</h3>
		<input type="text" name="teamname" placeholder="팀 이름" /> 
		<input type="text" name="stadium" placeholder="구장 Id" /> 
		<button>등록</button>
	</form>
</div>


</body>
</html>