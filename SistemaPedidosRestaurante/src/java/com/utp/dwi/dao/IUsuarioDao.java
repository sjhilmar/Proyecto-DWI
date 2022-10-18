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

    UsuarioBean insertar(UsuarioBean producto) throws SQLException;

    UsuarioBean actualizar(UsuarioBean producto) throws SQLException;

    void eliminar(int UserID) throws SQLException;
}
