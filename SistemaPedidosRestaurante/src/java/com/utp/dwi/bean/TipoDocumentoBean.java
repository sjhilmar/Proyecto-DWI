/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.dwi.bean;

/**
 *
 * @author JMR CODE
 */
public class TipoDocumentoBean {
    private Integer tipoDocumentoID;
    private String descripcionDocumnto;

    public Integer getTipoDocumentoID() {
        return tipoDocumentoID;
    }

    public void setTipoDocumentoID(Integer tipoDocumentoID) {
        this.tipoDocumentoID = tipoDocumentoID;
    }

    public String getDescripcionDocumnto() {
        return descripcionDocumnto;
    }

    public void setDescripcionDocumnto(String descripcionDocumnto) {
        this.descripcionDocumnto = descripcionDocumnto;
    }

    @Override
    public String toString() {
        return "TipoDocumentoBean{" + "tipoDocumentoID=" + tipoDocumentoID + ", descripcionDocumnto=" + descripcionDocumnto + '}';
    }

    public TipoDocumentoBean() {
    }

    public TipoDocumentoBean(Integer tipoDocumentoID, String descripcionDocumnto) {
        this.tipoDocumentoID = tipoDocumentoID;
        this.descripcionDocumnto = descripcionDocumnto;
    }
    
    
            
            
    
    
}
