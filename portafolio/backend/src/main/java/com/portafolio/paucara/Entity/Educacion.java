
package com.portafolio.paucara.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreED;
    private String descripcionED;

    public Educacion() {
    }

    public Educacion(String nombreED, String descripcionED) {
        this.nombreED = nombreED;
        this.descripcionED = descripcionED;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
