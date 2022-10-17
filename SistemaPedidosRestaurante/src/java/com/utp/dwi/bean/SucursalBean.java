/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.dwi.bean;

/**
 *
 * @author JMR CODE
 */
public class SucursalBean {
    private Integer sucursalID;
    private CompaniaBean companiaBean;
    private String descripcion;
    private String departamento ;
    private String provincia;
    private String distrito;
    private String direccion;
    private String celular1;
    private String celular2;
    private String correo1;
    private String correo2;

    public Integer getSucursalID() {
        return sucursalID;
    }

    public void setSucursalID(Integer sucursalID) {
        this.sucursalID = sucursalID;
    }

    public CompaniaBean getCompaniaBean() {
        return companiaBean;
    }

    public void setCompaniaBean(CompaniaBean companiaBean) {
        this.companiaBean = companiaBean;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular1() {
        return celular1;
    }

    public void setCelular1(String celular1) {
        this.celular1 = celular1;
    }

    public String getCelular2() {
        return celular2;
    }

    public void setCelular2(String celular2) {
        this.celular2 = celular2;
    }

    public String getCorreo1() {
        return correo1;
    }

    public void setCorreo1(String correo1) {
        this.correo1 = correo1;
    }

    public String getCorreo2() {
        return correo2;
    }

    public void setCorreo2(String correo2) {
        this.correo2 = correo2;
    }

    public SucursalBean() {
    }

    public SucursalBean(Integer sucursalID, CompaniaBean companiaBean, String descripcion, String departamento, String provincia, String distrito, String direccion, String celular1, String celular2, String correo1, String correo2) {
        this.sucursalID = sucursalID;
        this.companiaBean = companiaBean;
        this.descripcion = descripcion;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.direccion = direccion;
        this.celular1 = celular1;
        this.celular2 = celular2;
        this.correo1 = correo1;
        this.correo2 = correo2;
    }
    
    
    
   
    
}
