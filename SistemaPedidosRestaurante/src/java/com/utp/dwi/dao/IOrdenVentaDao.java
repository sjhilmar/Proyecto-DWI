/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.utp.dwi.dao;

import com.utp.dwi.bean.OrdenVentaBean;
import com.utp.dwi.dto.OrdenVentaDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author JMR CODE
 */
public interface IOrdenVentaDao {

    List<OrdenVentaDTO> listarOrdenesVenta(String descripcion) throws SQLException;

    OrdenVentaBean insertar(OrdenVentaBean ordenVenta) throws SQLException;

    OrdenVentaBean actualizar(OrdenVentaBean ordenVenta) throws SQLException;

    void eliminar(Integer ordenVentaID) throws SQLException;

}
