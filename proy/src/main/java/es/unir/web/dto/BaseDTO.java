package es.unir.web.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class BaseDTO implements Serializable {

	private static final long serialVersionUID = -2848092092781870484L;

	public static final String CFechaModificacion = "fechaModificacion";

	@Basic
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "F_MODIFICACION", updatable = false, insertable = false)
	public Date fechaModificacion;

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

}
