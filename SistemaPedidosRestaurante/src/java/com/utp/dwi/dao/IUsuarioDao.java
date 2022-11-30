/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.utp.dwi.dao;


import com.utp.dwi.bean.UsuarioBean;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author JMR CODE
 */
public interface IUsuarioDao {
    List<UsuarioBean> Listar(String descripcion) throws SQLException;

    String insertar(UsuarioBean usuario) throws SQLException;

    UsuarioBean actualizar(UsuarioBean usuario) throws SQLException;

    void eliminar(int UserID) throws SQLException;

    String ValidarUsuario(UsuarioBean usuario) throws SQLException;
}
