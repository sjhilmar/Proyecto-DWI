/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.dwi.bean;

/**
 *
 * @author JMR CODE
 */
public class CompaniaBean {
    private Integer companiaID;
    private TipoDocumentoBean tipoDocumentoBean;
    private String numeroDocumento;
    private String nombreCompania;
    private String domicilioFiscal;
    private String celular1;
    private String celular2;
    private String correo1;
    private String correo2;

    public Integer getCompaniaID() {
        return companiaID;
    }

    public void setCompaniaID(Integer companiaID) {
        this.companiaID = companiaID;
    }

    public TipoDocumentoBean getTipoDocumentoBean() {
        return tipoDocumentoBean;
    }

    public void setTipoDocumentoBean(TipoDocumentoBean tipoDocumentoBean) {
        this.tipoDocumentoBean = tipoDocumentoBean;
    }
    
    

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombreCompania() {
        return nombreCompania;
    }

    public void setNombreCompania(String nombreCompania) {
        this.nombreCompania = nombreCompania;
    }

    public String getDomicilioFiscal() {
        return domicilioFiscal;
    }

    public void setDomicilioFiscal(String domicilioFiscal) {
        this.domicilioFiscal = domicilioFiscal;
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

    public CompaniaBean(Integer companiaID, String numeroDocumento, String nombreCompania, String domicilioFiscal, String celular1, String celular2, String correo1, String correo2) {
        this.companiaID = companiaID;
        this.numeroDocumento = numeroDocumento;
        this.nombreCompania = nombreCompania;
        this.domicilioFiscal = domicilioFiscal;
        this.celular1 = celular1;
        this.celular2 = celular2;
        this.correo1 = correo1;
        this.correo2 = correo2;
    }

    public CompaniaBean() {
    }
    
    
    
    
}
