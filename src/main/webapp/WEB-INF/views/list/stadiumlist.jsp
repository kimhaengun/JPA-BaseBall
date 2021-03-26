<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<h3>구장 목록 페이지</h3>
<table>
  <tr id="user-${team.id}">
    <th>NO</th>
    <th>구장 이름</th>
    <th>팀 이름</th>
    <th>삭제</th>
  </tr>
  <c:forEach var="stadium" items="${stadiums}">
  <tr>
    <td>${stadium.id}</td>
    <td>${stadium.stadiumname}</td>
    <td>${stadium.team.teamname}</td>
    <td><button id="btn" onclick="btnDelete(${stadium.id})">삭제</button></td>
  </tr>

</c:forEach>

</table>
<script>
function btnDelete(id){
	console.log(id);
	$.ajax({
		type:"DELETE",
		url:"/stadium/"+id,
		dataType:"json"
		}).done(res=>{
			 console.log(res);
			if(res.statusCode === 1){
				$("stadium-"+id).remove();
				alert("삭제 성공");
				}else{
					alert("삭제 실패");
					}
			});
	}
</script>

</body>
</html>