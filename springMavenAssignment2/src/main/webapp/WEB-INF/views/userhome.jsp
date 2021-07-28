<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="getalluser">Get all user details </a><br/>
	<c:forEach var="item" items="${user}">
         
     ${item.username }
     ${item.password }
     ${item.city }
     ${item.phone }
    
      ${item.email}<br />
	</c:forEach>
	
	<h1 style="color:green">${msg }</h1>
	<%--  <table>
      	<thead>
      		<th>Name</th>
      	</thead>
      	<tbody>
      		<tr>
      		<td>${item.username}</td>
      		</tr>
      	</tbody>
      </table>
       </c:forEach> --%>
	<br />
	<br />

	<a href="profile/${sessionScope.userName }"> Details of looged user <%-- user ${sessionScope.userName }  --%>
	</a> ${userName }
</body>
</html>