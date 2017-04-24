package es.unir.web.dto;

import java.util.List;
import java.util.Set;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

@Entity
@Table(name = "web_usuario")
@TableGenerator(name = "generador", table = "web_pk", pkColumnName = "x_pk", pkColumnValue = "1", valueColumnName = "next_pk", allocationSize = 25)
public class UsuarioDTO extends BaseDTO {

	public static final String CNombre = "nombre";

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "generador")
	@Column(name = "X_USUARIO")
	private Long id;

	@Column(name = "C_USUARIO")
	private String usuario;

	@Column(name = "T_NOMBRE")
	private String nombre;

	@Column(name = "T_CLAVE")
	private String clave;

	@Column(name = "C_PERFIL")
	private Integer perfil;

	@Column(name = "C_CATEGORIA")
	private String categoria;

	public Long getId() {
	    return id;
	}

	public void setId(Long id) {
	    this.id = id;
	}

	public String getUsuario() {
	    return usuario;
	}

	public void setUsuario(String usuario) {
	    this.usuario = usuario;
	}

	public String getNombre() {
	    return nombre;
	}

	public void setNombre(String nombre) {
	    this.nombre = nombre;
	}

	public String getClave() {
	    return clave;
	}

	public void setClave(String clave) {
	    this.clave = clave;
	}

	public Integer getPerfil() {
	    return perfil;
	}

	public void setPerfil(Integer perfil) {
	    this.perfil = perfil;
	}

	public String getCategoria() {
	    return categoria;
	}

	public void setCategoria(String categoria) {
	    this.categoria = categoria;
	}

}
