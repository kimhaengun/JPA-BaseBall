<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<h3>선수 목록 페이지</h3>
<table>
  <tr>
    <th>NO</th>
    <th>선수 이름</th>
    <th>포지션</th>
    <th>팀</th>
    <th>삭제</th>
  </tr>
  <c:forEach var="user" items="${users}">
  <tbody>
  <tr id="user-${user.id}">
    <td>${user.id}</td>
    <td>${user.username}</td>
    <td>${user.position}</td>
    <td>${user.team.teamname}</td>
    <td><button id="btn" onclick="btnDelete(${user.id})">삭제</button></td>
  </tr>

</c:forEach>

</table>
<script>
	function btnDelete(id){
		console.log(id);
		$.ajax({
			type:"DELETE",
			url:"/user/"+id,
			dataType:"json"
			}).done(res=>{
				 console.log(res);
				if(res.statusCode === 1){
					$("user-"+id).remove();
					alert("삭제 성공");
					}else{
						alert("삭제 실패");
						}
				});
		}
</script>

</body>
</html>