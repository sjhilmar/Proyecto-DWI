/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.utp.dwi.dao;

import com.utp.dwi.bean.ProductoBean;
import com.utp.dwi.dto.ProductoDTO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author JMR CODE
 */
public interface IProductoDao {

    List<ProductoDTO> listarProducto(String descripcion) throws SQLException;

    ProductoBean insertar(ProductoBean producto) throws SQLException;

    ProductoBean actualizar(ProductoBean producto) throws SQLException;

    void eliminar(int productoID) throws SQLException;

}
