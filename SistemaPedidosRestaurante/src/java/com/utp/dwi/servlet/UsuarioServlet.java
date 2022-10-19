/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.utp.dwi.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrador
 */
@WebServlet(name = "UsuarioServlet", urlPatterns = {"/UsuarioServlet"})
public class UsuarioServlet extends HttpServlet {

    String usuario="usuario.html";
    String index="index.html";
    String acceso="";
      
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       String accion=request.getParameter("Registrar");
       if(accion.equals("usuario")){
           acceso=usuario;
       }
       else if(accion.equals("Registrar")){
           
           int id=Integer.parseInt(request.getParameter("userID"));
           String usu=request.getParameter("usuario");
           String con=request.getParameter("contrasenia");
           String nom=request.getParameter("nombres");
           String ape=request.getParameter("apellidos");
           int tdoc=Integer.parseInt(request.getParameter("tipo_documento"));
           String ndoc=request.getParameter("numero_documento");
           String corr=request.getParameter("correo");
           String dep=request.getParameter("departamento");
           String pro=request.getParameter("Provincia");
           String dis=request.getParameter("Distrito");
           String tel=request.getParameter("direccion");
           int tusu=Integer.parseInt(request.getParameter("tipo_usuario"));
           
       
           
       }
       RequestDispatcher dispatcher=request.getRequestDispatcher(acceso);
       dispatcher.forward(request, response);
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
