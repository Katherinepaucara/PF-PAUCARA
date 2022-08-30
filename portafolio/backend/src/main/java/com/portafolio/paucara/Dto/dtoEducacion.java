
package com.portafolio.paucara.Dto;

import javax.validation.constraints.NotBlank;


public class dtoEducacion {
    @NotBlank
    private String nombreED;
    @NotBlank
    private String descripcionED;

    public dtoEducacion() {
    }

    public dtoEducacion(String nombreED, String descripcionED) {
        this.nombreED = nombreED;
        this.descripcionED = descripcionED;
    }

    public String getNombreED() {
        return nombreED;
    }

    public void setNombreED(String nombreED) {
        this.nombreED = nombreED;
    }

    public String getDescripcionED() {
        return descripcionED;
    }

    public void setDescripcionED(String descripcionED) {
        this.descripcionED = descripcionED;
    }
    
    
}
