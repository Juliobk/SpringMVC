<%@page import="fh.br.com.bookstore.Interface.impl.DefaultAutorFacade"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page import="java.util.ArrayList"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Autor ${param.nome} adicionado com sucesso!

	<br></br>


	<table>
		<tr>
			<th>Nome</th>
			<th>Livro</th>
			
		</tr>

		
			<tr>
				<td>${param.nome}</td>
				<td>${param.livro}</td>
			</tr>
			<tr>
				<c:forEach items="${autores}" var="autor">
				<tr>
        			<td>${autor.nome} </td>
        		</tr>
    			</c:forEach>
			

	</table>
	
		<a href="formulario.jsp">Criar novo autor</a>
	
</body>
</html>