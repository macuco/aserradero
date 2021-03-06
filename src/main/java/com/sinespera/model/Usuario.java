package com.sinespera.model;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="Usuarios")
public class Usuario {
	
	@Id
    //@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO")
	private String idUsuario;
	private String nombre;
	
	@NotEmpty
	@Column(unique = true, nullable = false)
	private String usuario;

	@JsonIgnore
	@NotEmpty
	private String contrasena;

	@JsonIgnore
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "usuario_rol", joinColumns = { @JoinColumn(name = "id_usuario") }, inverseJoinColumns = { @JoinColumn(name = "id_rol") })
	private Set<Role> roles = new HashSet<Role>();
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private Collection<LineaEspera> lineasEspera;


	

	public Usuario(Usuario user) {
		super();
		this.idUsuario = user.getIdUsuario();
		this.nombre = user.getNombre();
		this.usuario = user.getUsuario();
		this.contrasena = user.getContrasena();
		this.roles = user.getRoles();
	}
	
	public Usuario(String id, String nombre) {
		this.idUsuario=id;
		this.nombre = nombre;
	}
	public Usuario() {}

	

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	public Collection<LineaEspera> getLineasEspera() {
		return lineasEspera;
	}

	public void setLineasEspera(Collection<LineaEspera> lineasEspera) {
		this.lineasEspera = lineasEspera;
	}
	
	 @Override
	    public String toString() {
	        return String.format(
	                "Usuario[id=%s rol=%s", idUsuario,roles.toString());
	    }
	

}
