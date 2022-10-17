/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.dwi.bean;

/**
 *
 * @author JMR CODE
 */
public class OrdenVentaDetalleBean {
    private Integer ordenVentaDetalleID;
    private OrdenVentaBean ordenVentaBean;
    private ProductoBean productoBean;
    private String descripcion;
    private Double precioUnitario;
    private Double cantidad;
    private Double neto;
    private Double igv;
    private Double total;

    public Integer getOrdenVentaDetalleID() {
        return ordenVentaDetalleID;
    }

    public void setOrdenVentaDetalleID(Integer ordenVentaDetalleID) {
        this.ordenVentaDetalleID = ordenVentaDetalleID;
    }

    public OrdenVentaBean getOrdenVentaBean() {
        return ordenVentaBean;
    }

    public void setOrdenVentaBean(OrdenVentaBean ordenVentaBean) {
        this.ordenVentaBean = ordenVentaBean;
    }

    public ProductoBean getProductoBean() {
        return productoBean;
    }

    public void setProductoBean(ProductoBean productoBean) {
        this.productoBean = productoBean;
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

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getNeto() {
        return neto;
    }

    public void setNeto(Double neto) {
        this.neto = neto;
    }

    public Double getIgv() {
        return igv;
    }

    public void setIgv(Double igv) {
        this.igv = igv;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public OrdenVentaDetalleBean() {
    }

    public OrdenVentaDetalleBean(Integer ordenVentaDetalleID, OrdenVentaBean ordenVentaBean, ProductoBean productoBean, String descripcion, Double precioUnitario, Double cantidad, Double neto, Double igv, Double total) {
        this.ordenVentaDetalleID = ordenVentaDetalleID;
        this.ordenVentaBean = ordenVentaBean;
        this.productoBean = productoBean;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.neto = neto;
        this.igv = igv;
        this.total = total;
    }
    
    
    
}
