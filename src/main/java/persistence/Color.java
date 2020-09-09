package persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="colores")
public class Color {
	@Id @GeneratedValue
	private Long cod_color;
	
	private String descripcion;

	public Long getCod_color() {
		return cod_color;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
