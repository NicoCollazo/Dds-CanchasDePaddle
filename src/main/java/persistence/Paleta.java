package persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="paletas")
public class Paleta {
	@Id @GeneratedValue
	private Long cod_paleta;
	
	private String nombre;
	private Integer grosor;
	
	@ManyToOne
	private Color cod_color;
	@ManyToOne
	private Constructor cod_constructor;
	
	public Long getCod_paleta() {
		return cod_paleta;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer getGrosor() {
		return grosor;
	}
	
	public void setGrosor(Integer grosor) {
		this.grosor = grosor;
	}
	
	public Color getCod_color() {
		return cod_color;
	}
	
	public Constructor getCod_constructor() {
		return cod_constructor;
	}
	
}
