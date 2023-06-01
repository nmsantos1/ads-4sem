/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.curso.controller.pokemon;

import br.com.curso.dao.GenericDAO;
import br.com.curso.dao.PokemonDAO;
import br.com.curso.model.Pokemon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aluno
 */
@WebServlet(name = "PokemonCadastrar", urlPatterns = {"/PokemonCadastrar"})
public class PokemonCadastrar extends HttpServlet {

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
        response.setContentType("text/html;charset=iso-8859-1");
        int idPokemon = Integer.parseInt(request.getParameter("idpokemon"));
        String nomePokemon = request.getParameter("nomepokemon");
        String mensagem = null;
        
        Pokemon oPokemon = new Pokemon();
        oPokemon.setIdPokemon(idPokemon);
        oPokemon.setNomePokemon(nomePokemon);
        try{
            GenericDAO dao = new PokemonDAO();
            if (dao.cadastrar(oPokemon))
                mensagem = "Pokemon cadastrado com sucesso";
            else
                mensagem = "Problemas ao cadastrar Pokemon. Verifique os dados informados e tente novamente!";
            request.setAttribute("mensagem", mensagem);
            response.sendRedirect("PokemonListar");
        } catch (Exception ex) {
            System.out.println("Problemas no Servlet ao cadastrar Pokemon! Erro: "+ex.getMessage());
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
