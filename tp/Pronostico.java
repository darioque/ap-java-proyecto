package tp;

public class Pronostico {
	private Partido partido;
	private Equipo equipo;
	private ResultadoEnum resultado;

	public Pronostico(Partido partido, Equipo equipo, ResultadoEnum resultado) {
		this.partido = partido;
		this.equipo = equipo;
		this.resultado = resultado;
	}

	public int puntos() {
		if (partido.resultado(equipo).equals(resultado)) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Pronostico [partido=" + partido + ", equipo=" + equipo.getNombre() + ", resultado=" + resultado + "]";
	}


}