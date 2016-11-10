/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinespera.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author macuco
 */
@Entity
@Table(name = "LINEAS_ESPERA")
@XmlRootElement
public class LineaEspera implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_LINEA_ESPERA")
    private String idLineaEspera;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "TURNO")
    private Long turno;
    @Column(name = "FECHA_SOLICITUD_SERVICIO")
    private Serializable fechaSolicitudServicio;
    @JoinColumn(name = "ID_COLA", referencedColumnName = "ID_COLA")
    @ManyToOne(optional = false)
    private Cola cola;
    @JoinColumn(name = "ID_USUARIO", referencedColumnName = "ID_USUARIO")
    @ManyToOne(optional = false)
    private Usuario usuario;

    public LineaEspera() {
    }

    public LineaEspera(String idLineaEspera) {
        this.idLineaEspera = idLineaEspera;
    }

    public String getIdLineaEspera() {
        return idLineaEspera;
    }

    public void setIdLineaEspera(String idLineaEspera) {
        this.idLineaEspera = idLineaEspera;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getTurno() {
        return turno;
    }

    public void setTurno(Long turno) {
        this.turno = turno;
    }

    public Serializable getFechaSolicitudServicio() {
        return fechaSolicitudServicio;
    }

    public void setFechaSolicitudServicio(Serializable fechaSolicitudServicio) {
        this.fechaSolicitudServicio = fechaSolicitudServicio;
    }

    public Cola getCola() {
        return cola;
    }

    public void setCola(Cola idCola) {
        this.cola = idCola;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLineaEspera != null ? idLineaEspera.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LineaEspera)) {
            return false;
        }
        LineaEspera other = (LineaEspera) object;
        if ((this.idLineaEspera == null && other.idLineaEspera != null) || (this.idLineaEspera != null && !this.idLineaEspera.equals(other.idLineaEspera))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "pruebas.LineaEspera[ idLineaEspera=" + idLineaEspera + " ]";
    }
    
}
