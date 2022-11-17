/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.dwi.bean;

/**
 *
 * @author JMR CODE
 */
public class UsuarioBean {
    
    private Integer userID;
    private String usuario;
    private String contrasenia;
    private String nombre;
    private String apellidos;
    private int tipoDocumentoBean;
    private String numeroDocumento;
    private String correo;
    private String departamento;
    private String provincia;
    private String distrito;
    private String direccion;
    private int tipoUsuarioBean;

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTipoDocumentoBean() {
        return tipoDocumentoBean;
    }

    public void setTipoDocumentoBean(int tipoDocumentoBean) {
        this.tipoDocumentoBean = tipoDocumentoBean;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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

    public int getTipoUsuarioBean() {
        return tipoUsuarioBean;
    }

    public void setTipoUsuarioBean(int tipoUsuarioBean) {
        this.tipoUsuarioBean = tipoUsuarioBean;
    }

    public UsuarioBean() {
    }

    public UsuarioBean(Integer userID, String usuario, String contrasenia, String nombre, String apellidos, int tipoDocumentoBean, String numeroDocumento, String correo, String departamento, String provincia, String distrito, String direccion, int tipoUsuarioBean) {
        this.userID = userID;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tipoDocumentoBean = tipoDocumentoBean;
        this.numeroDocumento = numeroDocumento;
        this.correo = correo;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.direccion = direccion;
        this.tipoUsuarioBean = tipoUsuarioBean;
    }
    
   
    
    
    
    
    
}
