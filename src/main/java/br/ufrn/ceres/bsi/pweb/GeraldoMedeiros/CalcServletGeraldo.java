package br.ufrn.ceres.bsi.pweb.GeraldoMedeiros;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalcServletGeraldo")
public class CalcServletGeraldo extends HttpServlet{
    private static final long serialVersionUID = 1L;

    String divisores;
    int contador;
    int somaDividor;
    int numPerfeito;

    public CalcServletGeraldo(){
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter tela = response.getWriter();

        tela.append("<br>Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        int numero = Integer.parseInt(request.getParameter("numero"));
        String ePar = numero % 2 == 0? "é par." : "não é par.";
        contador = 0;
        divisores="";
        numPerfeito = 0;


        for(int iterador =1; iterador<=numero/2; iterador++) {
            if((numero % iterador==0) && (numero!=0)) {
                divisores= divisores + Integer.toString(iterador) +", ";
                contador++;
                numPerfeito = numPerfeito + iterador;
            }
        }
        divisores= divisores + numero;

        String ePrimo = contador==1 ? "é primo." : "não é primo.";

        String ePerfeito = numPerfeito==numero?"é perfeito " : "não é perfeito ";

/*        response.getWriter().append("<!DOCTYPE html>"+
            "<html dir=\"ltr\">"+
            "<head>"+
            "<title>Teste de calculador</title>"+
            "<link rel=\"estilo.css\" type=\"text/css\">"+
            "</head>"+
            "<body>"+
            "<section class=\"overlay\">");
*/
        response.getWriter().append("Esse foi o número digitado: " + numero + ", ele " + ePar);
        response.getWriter().append("<br>Este número " + ePrimo);
        response.getWriter().append("<br>Estes são seus divisores " + divisores + ".");
        response.getWriter().append("<br>Este número " + ePerfeito + "pois a soma dos seus divisores é (excluindo ele mesmo) " + numPerfeito);
        response.getWriter().append("<br>Em Matemática, um <b>número perfeito</b> é um número inteiro para o qual a soma de todos os seus divisores positivos próprios (excluindo ele mesmo) é igual ao próprio número.");
        response.getWriter().append("<br>"/*</section></body></html>"*/);

        doGet(request, response);
    }



}
