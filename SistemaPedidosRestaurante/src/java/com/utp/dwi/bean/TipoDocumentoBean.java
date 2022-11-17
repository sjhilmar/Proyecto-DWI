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
    private int tipoDocumentoID;
    private String descripcionDocumnto;

    public int getTipoDocumentoID() {
        return tipoDocumentoID;
    }

    public void setTipoDocumentoID(int tipoDocumentoID) {
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

    public TipoDocumentoBean(int tipoDocumentoID, String descripcionDocumnto) {
        this.tipoDocumentoID = tipoDocumentoID;
        this.descripcionDocumnto = descripcionDocumnto;
    }
    
    
            
            
    
    
}
