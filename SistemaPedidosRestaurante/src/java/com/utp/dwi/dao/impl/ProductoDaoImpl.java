/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.dwi.dao.impl;

import com.utp.dwi.bean.ProductoBean;
import com.utp.dwi.dao.IProductoDao;
import com.utp.dwi.dto.ProductoDTO;
import com.utp.dwi.util.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JMR CODE
 */
public class ProductoDaoImpl implements IProductoDao {

    protected Connection con = null;
    protected PreparedStatement stmt = null;
    protected ResultSet rs = null;

    @Override
    public List<ProductoDTO> listarProducto(String descripcion) throws SQLException {
        ArrayList<ProductoDTO>  lista =  new ArrayList<>();
        String query = "select \n"
                + "t1.productoID, \n"
                + "t1.codigoProducto, \n"
                + "t1.descripcion,\n"
                + "t1.precioUnitario,\n"
                + "t2.descripcion as tipoProducto, \n"
                + "t1.observacion,\n"
                + "t3.descripcion as estado, \n"
                + "t1.imagen\n"
                + "from producto t1\n"
                + "inner join tipoProducto t2 on t1.tipoProductoID=t2.tipoProductoID\n"
                + "inner join estado t3 on t1.estadoID=t3.estadoID\n"
                + "where t1.descripcion like ? and t1.estadoID =6 order by t2.tipoProductoID desc";

        try {
            con = Conexion.obtenerConexion();
            stmt = con.prepareStatement(query);
            stmt.setString(1, "%" + descripcion + "%");
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                ProductoDTO producto = new ProductoDTO();
                producto.setProductoID(rs.getInt("productoID"));
                producto.setCodigoProducto(rs.getString("codigoProducto"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setPrecioUnitario(rs.getDouble("precioUnitario"));
                producto.setTipoProductoDescripcion(rs.getString("tipoProducto"));
                producto.setEstado(rs.getString("estado"));
                producto.setImagen(rs.getString("imagen"));
                lista.add(producto);

            }

        } catch (Exception e) {
            System.err.println(e.getMessage());

        } finally {
            rs.close();
            stmt.close();
            con.close();
        }
        return lista;

    }

    @Override
    public ProductoBean insertar(ProductoBean producto) throws SQLException {
        String query = "INSERT INTO producto (codigoProducto,descripcion,precioUnitario,observacion,tipoProductoID,estadoID) VALUES(?,?,?,?,?,?);";

        try {
            con = Conexion.obtenerConexion();
            stmt = con.prepareStatement(query);
            stmt.setString(0, producto.getCodigoProducto());
            stmt.setString(1, producto.getDescripcion());
            stmt.setDouble(2, producto.getPrecioUnitario());
            stmt.setString(3, producto.getObservacion());
            stmt.setInt(4, producto.getTipoProductoBean().getTipoProductoID());
            stmt.setInt(5, producto.getEstadoBean().getEstadoID());
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

        return producto;

    }

    @Override
    public ProductoBean actualizar(ProductoBean producto) throws SQLException {

        String query = "descripcion = ?,\n"
                + "precioUnitario = <{precioUnitario: }>,\n"
                + "observacion = ?,\n"
                + "tipoProductoID = ?,\n"
                + "estadoID =?>\n"
                + "WHERE productoID = ?";

        try {
            con = Conexion.obtenerConexion();
            stmt = con.prepareStatement(query);
            stmt.setString(1, producto.getDescripcion());
            stmt.setDouble(2, producto.getPrecioUnitario());
            stmt.setString(3, producto.getObservacion());
            stmt.setInt(4, producto.getTipoProductoBean().getTipoProductoID());
            stmt.setInt(5, producto.getEstadoBean().getEstadoID());
            int i = stmt.executeUpdate();
            if (i != 1) {
                throw new SQLException("No se pudo actualizar");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());

        } finally {
            stmt.close();
            con.close();
        }
        return producto;

    }

    @Override
    public void eliminar(int productoID) throws SQLException {

        String query = "delete from producto where productoID=?;";

        try {
            con = Conexion.obtenerConexion();
            stmt = con.prepareStatement(query);
            stmt.setInt(1, productoID);
            int i = stmt.executeUpdate();
            if (i != 1) {
                throw new SQLException("No se pudo eliminar");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
            
        } finally {
            stmt.close();
            con.close();
        }

    }

}
