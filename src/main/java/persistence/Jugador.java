package persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="jugadores")
public class Jugador {
	@Id @GeneratedValue
	private Long id_jugador;
	
	private String nombre;
	private String apellido;
	private String domicilio;
	private String nacimiento;
	
	@OneToOne
	private Paleta id_paleta;

	public Long getId_jugador() {
		return id_jugador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}

	public Paleta getId_paleta() {
		return id_paleta;
	}
	
}
