/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.dwi.dao.impl;


import com.utp.dwi.bean.UsuarioBean;
import com.utp.dwi.dao.IUsuarioDao;
import com.utp.dwi.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class Usuariolmpl implements IUsuarioDao{
      protected Connection con = null;
    protected PreparedStatement stmt = null;
    protected ResultSet rs = null;

    //String query = "INSERT INTO producto (codigoProducto,descripcion,precioUnitario,observacion,tipoProductoID,estadoID) VALUES(?,?,?,?,?,?);";

      

    

   // @Override
   // public List<UsuarioBean> Listar(String descripcion) throws SQLException {
    //    throw new UnsupportedOperationException("Not supported yet."); // 
    //}

    @Override
    public UsuarioBean insertar(UsuarioBean usuario) throws SQLException {
      String query = "INSERT INTO usuario (userID,usuario,contrasenia,nombre,apellidos,tipoDocumentoID,numeroDocumento,correo,departamento,provincia,distrito,direccion,tipoUsuarioID) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?);";
    
      try {
            con = Conexion.obtenerConexion();
            stmt = con.prepareStatement(query);
            stmt.setInt(0, usuario.getUserID());
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getContrasenia());
            stmt.setString(3, usuario.getNombre());
            stmt.setString(4, usuario.getApellidos());
            stmt.setInt(5, usuario.getTipoDocumentoBean().getTipoDocumentoID());
            stmt.setString(6, usuario.getNumeroDocumento());
            stmt.setString(7, usuario.getCorreo());
            stmt.setString(8, usuario.getDepartamento());
            stmt.setString(9, usuario.getProvincia());
            stmt.setString(10, usuario.getDistrito());
            stmt.setString(11, usuario.getDireccion());            
            stmt.setInt(12, usuario.getTipoUsuarioBean().getTipoUsuarioID());
            int i = stmt.executeUpdate();

            if (i != 1) {
                throw new SQLException("No se pudo insertar");
            }

        } catch (Exception e) {
            System.err.println(e.getMessage());

        } finally {

            stmt.close();
            con.close();
        }

        return usuario;
    
    }

   // @Override
   // public UsuarioBean actualizar(UsuarioBean producto) throws SQLException {
   //     throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   // }
 
   // @Override
   // public void eliminar(int UserID) throws SQLException {
   //     throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   // }

    @Override
    public List<UsuarioBean> Listar(String descripcion) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public UsuarioBean actualizar(UsuarioBean usuario) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(int UserID) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
