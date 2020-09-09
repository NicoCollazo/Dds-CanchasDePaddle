package persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="participacion")
public class Participacion {
	@Id @GeneratedValue
	@ManyToOne
	private Jugador id_jugador;
	
	@Id @GeneratedValue
	@ManyToOne
	private Partido id_partido;
	
	@ManyToOne
	private Paleta id_paleta;

}
