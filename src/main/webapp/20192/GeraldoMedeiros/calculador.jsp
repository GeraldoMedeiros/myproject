<!DOCTYPE html>
<html dir="ltr">
<%@page contentType="text/html" import="java.util.*, java.text.*"
	pageEncoding="UTF-8"%>

<head>
    <title>Teste de calculador</title>
    <link rel="stylesheet" href="estilo.css" type="text/css">

</head>

<body>
    <section class="overlay">
        <h1>Calculadora</h1>
        <p>Vamos brincar um pouco com números</p>
        <form action="/myproject/CalcServletGeraldo" method="post">
            <label for="numero">Número:</label>
            <input id="numero" type="number" name="numero" min="1" max="2147483647" required /><br><br>
            <input type="submit" value="Enviar" />
        </form>
    </section>
</body>

</html>
