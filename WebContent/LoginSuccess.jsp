<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登陆成功</title>
</head>
<body>
	<div>${userBean.name},${userBean.password}</div>
	<button onclick="change()">用户管理</button>
	<%-- <table>
		<tr>
		<th>姓名</th>
		<th>email</th>
		<th>电话</th>
		<th>操作</th>
		</tr>
		<c:forEach items="${userList}" var="user">
			<tr>
				<td>${user.name}</td>
				<td>${user.email}</td>
				<td>${user.phone}</td>
				<td><button id="${user.id}">修改</button></td>
			</tr>
		</c:forEach>
	</table> --%>
<script src="jQuery/jquery-3.3.1.min.js"></script>
<script>
function change(){
	if($("table th:eq(0)").html()!='姓名'){
		$.post("showList",function(data){
			var str="<table><tr><th>姓名</th><th>email</th><th>电话</th><th>操作</th></tr>";
			for(var i=0;i<data.length;i++){
				str+="<tr><td>"+data[i].name+"</td><td>"+data[i].email+"</td><td>"+data[i].phone+"</td><td><button id="+data[i].id+">修改</button></td></tr>"
			}
		str+="</table>";
		$("button:eq(0)").after(str);
		});
	}else{
		if($("table").css("display")=='none'){
			$("table").fadeIn("slow");
		}else{
			$("table").fadeOut("slow");
		}
	}
}
</script>
</body>
</html>