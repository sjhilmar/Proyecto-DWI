/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.utp.dwi.servlet;


import com.utp.dwi.bean.*;
import com.utp.dwi.dao.IUsuarioDao;
import com.utp.dwi.dao.impl.Usuariolmpl;
import com.utp.dwi.dto.UsuarioDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        // response.setContentType("text/html;charset=UTF-8");
     //   String accion = request.getParameter("accion");
        int id = Integer.parseInt(request.getParameter("userID"));
        String usu = request.getParameter("usuario");
        String con = request.getParameter("contrasenia");
        String nom = request.getParameter("nombres");
        String ape = request.getParameter("apellidos");   
        //TipoDocumentoBean tdb = new TipoDocumentoBean(); 
        int td =  Integer.parseInt(request.getParameter("tipo_documento"));
        //TipoDocumentoBean td = TipoDocumentoBean.getTipoDocumentoID(a);
        String ndoc = request.getParameter("numero_documento");
        String corr = request.getParameter("correo");
        String dep = request.getParameter("departamento");
        String pro = request.getParameter("Provincia");
        String dis = request.getParameter("Distrito");
        String dir = request.getParameter("direccion");
        int tusu = Integer.parseInt(request.getParameter("tipo_usuario"));
        UsuarioBean ub = new UsuarioBean(id, usu, con, nom, ape, td, ndoc, corr, dep, pro, dis, dir, tusu);
        
        Usuariolmpl Ul = new Usuariolmpl();
        //switch(accion){
        //    case  "Registrar":
        //            Ul.insertar(ub);
        //}
        if (Ul.insertar(ub)){
            x
        }else{
        
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
        // processRequest(request, response);

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
        // processRequest(request, response);

        //TipoDocumentoBean tdb = new TipoDocumentoBean();
        //TipoUsuarioBean tub = new TipoUsuarioBean();
        //  ub.setUsuario(usu);
        //  ub.setContrasenia(con);
        //  ub.setNombre(nom);
        //  ub.setApellidos(ape);
        //ub.setTipoDocumentoBean(2);
        // tdb.setTipoDocumentoID(tdoc);
        //  ub.setNumeroDocumento(ndoc);
        //  ub.setCorreo(corr);
        // ub.setDepartamento(dep);
        // ub.setProvincia(pro);
        //  ub.setDistrito(dis);
        // ub.setDireccion(dir);
        //ub.setTipoUsuarioBean(tub.setTipoUsuarioID(tusu));
        //tub.setTipoUsuarioID(tusu);
        //try {
        //  Usuariolmpl.insertar(ub);
        //} catch (SQLException ex) {
        // }
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
