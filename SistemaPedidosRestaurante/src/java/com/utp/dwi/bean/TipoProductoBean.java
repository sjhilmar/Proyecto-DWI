/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.dwi.bean;

/**
 *
 * @author JMR CODE
 */
public class TipoProductoBean {
private Integer tipoProductoID;
private String descripcion;

    public Integer getTipoProductoID() {
        return tipoProductoID;
    }

    public void setTipoProductoID(Integer tipoProductoID) {
        this.tipoProductoID = tipoProductoID;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoProductoBean() {
    }

    public TipoProductoBean(Integer tipoProductoID, String descripcion) {
        this.tipoProductoID = tipoProductoID;
        this.descripcion = descripcion;
    }


    
}
