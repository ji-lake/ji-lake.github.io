<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<title>湖</title>

<style>
.h3_lake {
	text-align: center;
	margin-top: 260px;
	color: white;
}

.div1 {
	text-align: center;
}

.Pwd {
	text-align: center;
}

.Enter {
	background: black;
	color: white;
	border: 0; 
	/* 클릭 전 버튼 테두리 */
	/*outline: 0; */
	/* 클릭 후 버튼 파란색 테두리 */
}
</style>

</head>
<body style="background: black;" oncontextmenu="return false" onselectstart="return false" ondragstart="return false">
<!-- 드래그 금지 https://tren-d.tistory.com/entry/HTML-%EB%93%9C%EB%9E%98%EA%B7%B8-%EA%B8%88%EC%A7%80%ED%95%98%EA%B8%B0 -->

	<div>
		<h3 class="h3_lake" style="">湖</h3>
		<hr>
		<br />
		<form method="post" action="/board/home">
		<div class="div1" style="">
			<input class="Pwd" type="password" style=""> <br /> <br />
			<button class="Enter" style="">入場</button>
		</div>
		</form>
	</div>
</body>
</html>
