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
<h1>Contato: </h1>
    <a href="/contatos">Contatos</a>
    <h2>${contato.nome}</h2>
    		<h3>${contato.codigo}</h3>
    		<h3>${contato.nome}</h3>
    		<h3>${contato.endereco}</h3>
    		<h3>${contato.telefone1}</h3>
    		<h3>${contato.telefone2}</h3>
    		<h3>${contato.descricao}</h3>
    		<h3>${contato.email}</h3>

</body>
</html>