/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.dwi.bean;

/**
 *
 * @author JMR CODE
 */
public class ProductoBean {
    
private Integer productoID;
private String codigoProducto;
private String descripcion;
private Double precioUnitario;
private String observacion;
private TipoProductoBean tipoProductoBean;
private EstadoBean estadoBean;
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

    public TipoProductoBean getTipoProductoBean() {
        return tipoProductoBean;
    }

    public void setTipoProductoBean(TipoProductoBean tipoProductoBean) {
        this.tipoProductoBean = tipoProductoBean;
    }

    public EstadoBean getEstadoBean() {
        return estadoBean;
    }

    public void setEstadoBean(EstadoBean estadoBean) {
        this.estadoBean = estadoBean;
    }

    public ProductoBean() {
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public ProductoBean(Integer productoID, String codigoProducto, String descripcion, Double precioUnitario, String observacion, TipoProductoBean tipoProductoBean, EstadoBean estadoBean) {
        this.productoID = productoID;
        this.codigoProducto = codigoProducto;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.observacion = observacion;
        this.tipoProductoBean = tipoProductoBean;
        this.estadoBean = estadoBean;
    }



}
