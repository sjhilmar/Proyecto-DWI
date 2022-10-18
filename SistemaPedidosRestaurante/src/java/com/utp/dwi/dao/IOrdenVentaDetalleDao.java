/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.utp.dwi.dao;

import com.utp.dwi.bean.OrdenVentaDetalleBean;
import com.utp.dwi.dto.OrdenVentaDetalleDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author JMR CODE
 */
public interface IOrdenVentaDetalleDao {
     List<OrdenVentaDetalleDTO> listarOrdenesVentaDetalle(String descripcion) throws SQLException;

    OrdenVentaDetalleBean insertar(OrdenVentaDetalleBean ordenVenta) throws SQLException;

    OrdenVentaDetalleBean actualizar(OrdenVentaDetalleBean ordenVenta) throws SQLException;

    void eliminar(Integer ordenVentaID) throws SQLException;
}
