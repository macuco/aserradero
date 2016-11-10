/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinespera.model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author macuco
 */
@Entity
@Table(name = "COLAS")
@XmlRootElement
public class Cola implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cola")
    private Collection<LineaEspera> lineasEspera;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_COLA")
    private String idCola;
    @Column(name = "NOMBRE")
    private String nombre;
    @JoinColumn(name = "ID_SERVICIO", referencedColumnName = "ID_SERVICIO")
    @OneToOne(optional = false)
    private Servicio servicio;

    public Cola() {
    }

    public Cola(String idCola) {
        this.idCola = idCola;
    }

    public String getIdCola() {
        return idCola;
    }

    public void setIdCola(String idCola) {
        this.idCola = idCola;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCola != null ? idCola.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cola)) {
            return false;
        }
        Cola other = (Cola) object;
        if ((this.idCola == null && other.idCola != null) || (this.idCola != null && !this.idCola.equals(other.idCola))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pruebas.Cola[ idCola=" + idCola + " ]";
    }

    @XmlTransient
    public Collection<LineaEspera> getLineasEspera() {
        return lineasEspera;
    }

    public void setLineasEspera(Collection<LineaEspera> lineasEspera) {
        this.lineasEspera = lineasEspera;
    }
    
}
