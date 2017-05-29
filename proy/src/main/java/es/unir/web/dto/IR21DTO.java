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
@Table(name = "web_ir21")
@TableGenerator(name = "generador", table = "web_pk", pkColumnName = "x_pk", pkColumnValue = "1", valueColumnName = "next_pk", allocationSize = 25)
public class IR21DTO extends BaseDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "generador")
	@Column(name = "X_IR21")
	private Long id;

	@Column(name = "T_FICHERO")
	private String fichero;

	@Column(name = "T_OPERADORA")
	private String operadora;

	@Column(name = "C_PAIS")
	private String pais;

	public Long getId() {
	    return id;
	}

	public String getFichero() {
	    return fichero;
	}


	public void setId(Long id) {
	    this.id = id;
	}

	public void setFichero(String fichero) {
	    this.fichero = fichero;
	}

	public String getOperadora() {
	    return operadora;
	}

	public String getPais() {
	    return pais;
	}

	public void setOperadora(String operadora) {
	    this.operadora = operadora;
	}

	public void setPais(String pais) {
	    this.pais = pais;
	}


}
