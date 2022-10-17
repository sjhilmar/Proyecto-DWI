/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.dwi.bean;

import java.util.Date;

/**
 *
 * @author JMR CODE
 */
public class OrdenVentaBean {

private Integer orderVentaID;
private UsuarioBean usuarioBean;
private SucursalBean sucursalBean;
private String numeroOrden;
private Date fechaCreacion;
private Date fechaAprobacion;
private EstadoBean estadoBean;

    public Integer getOrderVentaID() {
        return orderVentaID;
    }

    public void setOrderVentaID(Integer orderVentaID) {
        this.orderVentaID = orderVentaID;
    }

    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }

    public SucursalBean getSucursalBean() {
        return sucursalBean;
    }

    public void setSucursalBean(SucursalBean sucursalBean) {
        this.sucursalBean = sucursalBean;
    }

    public String getNumeroOrden() {
        return numeroOrden;
    }

    public void setNumeroOrden(String numeroOrden) {
        this.numeroOrden = numeroOrden;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(Date fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public EstadoBean getEstadoBean() {
        return estadoBean;
    }

    public void setEstadoBean(EstadoBean estadoBean) {
        this.estadoBean = estadoBean;
    }

    public OrdenVentaBean() {
    }

    public OrdenVentaBean(Integer orderVentaID, UsuarioBean usuarioBean, SucursalBean sucursalBean, String numeroOrden, Date fechaCreacion, Date fechaAprobacion, EstadoBean estadoBean) {
        this.orderVentaID = orderVentaID;
        this.usuarioBean = usuarioBean;
        this.sucursalBean = sucursalBean;
        this.numeroOrden = numeroOrden;
        this.fechaCreacion = fechaCreacion;
        this.fechaAprobacion = fechaAprobacion;
        this.estadoBean = estadoBean;
    }






    
}
