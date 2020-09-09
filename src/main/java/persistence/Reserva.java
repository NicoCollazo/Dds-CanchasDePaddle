package persistence;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="reservas")
public class Reserva {
	@Id @GeneratedValue
	private Long id_reserva;
	
	private LocalDate inicio_partido;
	private LocalDate fin_partido;
	
	@ManyToOne
	private Cancha id_cancha;
	@ManyToOne
	private Jugador responsable;
	
	public LocalDate getInicio_partido() {
		return inicio_partido;
	}
	
	public void setInicio_partido(LocalDate inicio_partido) {
		this.inicio_partido = inicio_partido;
	}
	
	public LocalDate getFin_partido() {
		return fin_partido;
	}
	
	public void setFin_partido(LocalDate fin_partido) {
		this.fin_partido = fin_partido;
	}
	
	public Cancha getId_cancha() {
		return id_cancha;
	}
	public Jugador getResponsable() {
		return responsable;
	}
	
	
	
}
