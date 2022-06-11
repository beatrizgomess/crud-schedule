<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" %>

<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Meus Contatos</h1>
    <a href="/">Home</a>
    <h2>${msg}</h2>
    <table border='1'>
    	<tr>
    		<th>Código</th>
    		<th>Nome</th>
    		<th>Endereço</th>
    		<th>Telefone 01</th>
    		<th>Telefone 02</th>
    		<th>Email</th>
    		<th>Descrição</th>
    		<th>Operações</th>
    	</tr>
    	<c:forEach items="${contatos}" var="item">
    	<tr>
    		<td>${item.codigo}</td>
    		<td>${item.nome}</td>
    		<td>${item.endereco}</td>
    		<td>${item.telefone1}</td>
    		<td>${item.telefone2}</td>
    		<td>${item.email}</td>
    		<td>${item.descricao}</td>
    		<td> <a href="/contato/visualiza/${item.codigo}">Visualizar</a></td>
    		<td> <a href="/contato/telaAtualiza/${item.codigo}">Alterar</a></td>
    		<td> <a href="/contato/deletar/${item.codigo}">Deletar</a></td>
    	</tr>
    </c:forEach>
    </table>
    
</body>
</html>