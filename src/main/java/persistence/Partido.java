package persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="partidos")
public class Partido {
	@Id @GeneratedValue
	private Long id_partido;
	
	@ManyToOne
	private Color cod_color_cancha;
	@OneToOne
	private Reserva id_reserva;

}
