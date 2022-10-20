/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.dwi.dto;

import com.utp.dwi.bean.EstadoBean;
import com.utp.dwi.bean.TipoProductoBean;
import java.io.Serializable;

/**
 *
 * @author JMR CODE
 */
public class ProductoDTO implements Serializable{
    private Integer productoID;
private String codigoProducto;
private String descripcion;
private Double precioUnitario;
private String observacion;
private String tipoProductoDescripcion;
private String estado;
private String imagen;

    public Integer getProductoID() {
        return productoID;
    }

    public void setProductoID(Integer productoID) {
        this.productoID = productoID;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getTipoProductoDescripcion() {
        return tipoProductoDescripcion;
    }

    public void setTipoProductoDescripcion(String tipoProductoDescripcion) {
        this.tipoProductoDescripcion = tipoProductoDescripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    
    
}
