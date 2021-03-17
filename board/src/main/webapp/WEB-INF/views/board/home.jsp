<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</P>

	<h3>湖</h3>

	<hr>

	<p>
		<a href="../board/list">게시물 목록</a><br /> <a href="../board/write">게시물
			작성</a><br /> <a href="../board/home">HOME</a>
	</p>

	<br />
	<c:if test="${member == null}">
		<form role="form" method="post" autocomplete="off" action="../member/loginCheck">
			아이디 : <input type="text" placeholder="ID"><br /> 
			비밀번호 : <input type="password" placeholder="PWD"><br /><br />
			<button>로그인</button>
		</form>
	</c:if>
	
	<c:if test="${member != null}">
		<p>${member.member_id} 님 환영합니다.</p>
	</c:if>

</body>
</html>
