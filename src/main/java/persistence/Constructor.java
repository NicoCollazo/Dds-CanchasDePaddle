package persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="constructores")
public class Constructor {
	@Id @GeneratedValue
	private Long cod_constructor;
	
	private String nombre;
	private String domicilio;
	
	public Long getCod_constructor() {
		return cod_constructor;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDomicilio() {
		return domicilio;
	}
	
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	
}
