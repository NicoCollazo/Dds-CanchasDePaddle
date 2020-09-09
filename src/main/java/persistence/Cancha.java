package persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="canchas")
public class Cancha {
	@Id @GeneratedValue
	private Long id_cancha;
	
	private String nombre;
	private Boolean esta_iluminada;
	
	@ManyToOne
	private Color cod_color;

	public Long getId_cancha() {
		return id_cancha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getEsta_iluminada() {
		return esta_iluminada;
	}

	public void setEsta_iluminada(Boolean esta_iluminada) {
		this.esta_iluminada = esta_iluminada;
	}

	public Color getCod_color() {
		return cod_color;
	}
	
}
