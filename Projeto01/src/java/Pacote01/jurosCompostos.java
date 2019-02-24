/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pacote01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author andre
 */
@WebServlet(name = "jurosCompostos", urlPatterns = {"/jurosCompostos"})
public class jurosCompostos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet jurosCompostos</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Juros Compostos</h1>");
            out.println("<hr></hr>");
            out.println("<form method='post'>");
            out.println("<p>Principal: </p>");
            out.println("<input type='text' name='principal'>");
            out.println("<p>Taxa de juros em porcentagem: </p>");
            out.println("<input type='text' name='taxa'>");
            out.println("<p>Tempo aplicado em meses: </p>");
            out.println("<input type='text' name='tempo'>");
            out.println("<input type='submit' value='Calcular'>");
            out.println("</form>");
            
            int i, j = 0;
            double montante, aux, taxames = 0, taxatotal;
            double taxa = Double.parseDouble(request.getParameter("taxa")); 
            double principal = Double.parseDouble(request.getParameter("principal"));
            int tempo = Integer.parseInt(request.getParameter("tempo"));
            taxa = taxa / 100;
            DecimalFormat formatar = new DecimalFormat("###,###,###.00");
            
            out.println("<hr></hr>");
            out.println("<h2>Montante calculado:</h2>");
            for(i = 1; i <= tempo; i++){
                j++;
            aux = Math.pow(1 + taxa, j);
            montante = principal * aux;
            taxatotal = montante - principal;
            taxames = taxatotal - taxames;
            
            
            out.println("<table border='1'>");
            out.println("<tr>");
            out.println("<th>Mês</th>");
            out.println("<th>Principal</th>");
            out.println("<th>Taxa do mês</th>");
            out.println("<th>Taxas totais</th>");
            out.println("<th>Montante</th>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>"+i+"</td>");
            out.println("<td>"+principal+"</td>");
            out.println("<td>"+formatar.format(taxames)+"</td>");
            out.println("<td>"+formatar.format(taxatotal)+"</td>");
            out.println("<td>"+formatar.format(montante)+"</td>");
            out.println("</tr>");
            out.println("</table>");
            
            taxames = taxatotal;
            }
            
            out.println("<hr></hr>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
