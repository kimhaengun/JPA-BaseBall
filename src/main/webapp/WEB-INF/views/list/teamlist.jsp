<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<h3>팀 목록 페이지</h3>
<table>
  <tr>
    <th>NO</th>
    <th>팀 이름</th>
    <th>구장 이름</th>
    <th>삭제</th>
  </tr>
  <c:forEach var="team" items="${teams}">
  <tr id="user-${team.id}">
    <td>${team.id}</td>
    <td>${team.teamname}</td>
    <td>${team.stadium.stadiumname}</td>
    <td><button id="btn" onclick="btnDelete(${team.id})">삭제</button></td>
  </tr>

</c:forEach>

</table>
<script>
function btnDelete(id){
	console.log(id);
	$.ajax({
		type:"DELETE",
		url:"/team/"+id,
		dataType:"json"
		}).done(res=>{
			 console.log(res);
			if(res.statusCode === 1){
				$("team-"+id).remove();
				alert("삭제 성공");
				}else{
					alert("삭제 실패");
					}
			});
	}
</script>

</body>
</html>