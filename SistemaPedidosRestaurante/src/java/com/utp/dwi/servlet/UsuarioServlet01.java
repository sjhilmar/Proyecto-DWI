/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.utp.dwi.servlet;

import com.utp.dwi.bean.UsuarioBean;
import com.utp.dwi.dao.impl.Usuariolmpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrador
 */
public class UsuarioServlet01 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
     Usuariolmpl Ul = new Usuariolmpl();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          request.setCharacterEncoding("UTF-8");

        String accion = request.getParameter("accion");

        if (accion.equalsIgnoreCase("InsertarUsuario")) {
            InsertarUsuario(request, response);
        }
        
        if (accion.equalsIgnoreCase("LoguearUsuario")) {
            LoguearUsuario(request, response);
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

    private void InsertarUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       try {

            String usu = request.getParameter("usuario");
            String con = request.getParameter("contrasenia");
            String nom = request.getParameter("nombres");
            String ape = request.getParameter("apellidos");
            int td = Integer.parseInt(request.getParameter("tipo_documento"));
            String ndoc = request.getParameter("numero_documento");
            String corr = request.getParameter("Correo");
            String dep = request.getParameter("departamento");
            String pro = request.getParameter("Provincia");
            String dis = request.getParameter("Distrito");
            String dir = request.getParameter("direccion");
            int tusu = Integer.parseInt(request.getParameter("tipo_usuario"));

            UsuarioBean ub = new UsuarioBean();
            ub.setUsuario(usu);
            ub.setContrasenia(con);
            ub.setNombre(nom);
            ub.setApellidos(ape);
            ub.setTipoDocumentoBean(td);
            ub.setNumeroDocumento(ndoc);
            ub.setCorreo(corr);
            ub.setDepartamento(dep);
            ub.setProvincia(pro);
            ub.setDistrito(dis);
            ub.setDireccion(dir);
            ub.setTipoUsuarioBean(tusu);

            //Ul.insertar(ub);
            String mensaje = Ul.insertar(ub);

            if (mensaje.equals("Agregado")) {
                request.setAttribute("mensaje", mensaje);
            } else {
                request.setAttribute("error", mensaje);
            }

            request.getRequestDispatcher("usuario.jsp").forward(request, response);

        } catch (Exception e) {
            request.setAttribute("error", e);
            request.getRequestDispatcher("usuario.jsp").forward(request, response);
        }
        
    }

    private void LoguearUsuario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {

            String usu = request.getParameter("usuario");
            String con = request.getParameter("contrasenia");
            
            UsuarioBean ub = new UsuarioBean();
            ub.setUsuario(usu);
            ub.setContrasenia(con);
            
             String mensaje = Ul.ValidarUsuario(ub);

            if (mensaje.equals("Conectar")) {
               // request.setAttribute("mensaje", mensaje);
                 request.getRequestDispatcher("index.jsp").forward(request, response);
            } else {
               // request.setAttribute("error", mensaje);
                request.getRequestDispatcher("Login.jsp").forward(request, response);
            }
            
          
           
         } catch (Exception e) {
            request.setAttribute("error", e);
            request.getRequestDispatcher("Login.jsp").forward(request, response);
        }
            
    }

}
