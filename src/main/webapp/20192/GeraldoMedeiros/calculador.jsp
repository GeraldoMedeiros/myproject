<!DOCTYPE html>
<html dir="ltr">
<%@page contentType="text/html" import="java.util.*, java.text.*"
	pageEncoding="UTF-8"%>

<header class="cabecalho">
    <title>Tarefa 01 - 2019.2 - JSP e Servlets</title>
    <link rel="stylesheet" href="estilo.css" type="text/css">
    <p>Criado por: José Geraldo de Medeiros Júnior</p>
    <p>GitHub:
        <a href="https://github.com/GeraldoMedeiros">
            GeraldoMedeiros
        </a>
    </p>
    <p>
        E-mail:
        <a href="mailto:geraldo_sjs@hotmail.com">
            geraldo_sjs@hotmail.com
        </a>
    </p>
</header>

<body>
    <section class="overlay">
        <h1>Calculadora</h1>
        <p>Vamos brincar um pouco com números?</p>
        <form action="/myproject/CalcServletGeraldo" method="post">
            <label for="numero">Número:</label>
            <input id="numero" type="number" name="numero" min="1" max="2147483647" required /><br><br>
            <input type="submit" value="Enviar" />
        </form>
    </section>
</body>

</html>
