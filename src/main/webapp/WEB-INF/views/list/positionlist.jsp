<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>

<h3>포지션 목록 페이지</h3>
<table>
  <tr>
    <th>포지션</th>
    <th>롯데</th>
    <th>한화</th>
    <th>삼성</th>
  </tr>
  <c:forEach var="dto" items="${dtos}">
  <tbody>
  <tr >
    <td>${dto.position}</td>
    <td>${dto.lotte}</td>
    <td>${dto.hanwha}</td>
    <td>${dto.samsung}</td>
  </tr>

</c:forEach>

</table>
</body>
</html>