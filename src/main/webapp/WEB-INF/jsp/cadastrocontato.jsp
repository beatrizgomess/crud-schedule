<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Cadastre um contato</h1>
    <a href="/">Home</a>
	<br>

    <form action="${(!(contato eq null))? '/contato/atualiza':'cadContato'}" method="post">
        ${(!(contato eq null))? '':'Codigo'} <input type="${(!(contato eq null)) ? 'hidden':'text'}" name="codigo" value="${(!(contato eq null))? contato.codigo:''}"/>
        <br>
        Nome: <input type="text" name="nome" value="${(!(contato eq null))? contato.nome:''}"/>
        <br>
        Endereco: <input type="text" name="endereco" value="${(!(contato eq null)) ? contato.endereco:''}"/>
        <br>
        Telefone 01: <input type="text" name="telefone1" value="${(!(contato eq null)) ? contato.telefone1:''}"/>
        <br>
        Telefone 02: <input type="text" name="telefone2" value="${(!(contato eq null))? contato.telefone2:''}"/>
        <br>
        Email: <input type="text" name="email" value="${(!(contato eq null)) ? contato.email:''}"/>
        <br>
        Descricao: <br>
        <textarea rows="5" col="20" type="text"  name="descricao" value="${(!(contato eq null)) ? contato.descricao:''}"/></textarea>
        <br>
        <input type="submit" value="${(!(contato eq null))? "Atualizar":"Cadastrar"}"/>



    </form>
</body>
</html>