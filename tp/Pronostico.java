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
	// Determina si el pronostico es correcto
	public int puntos() {
		// Si el resultado pronosticado es igual al resultado real del partido se obtiene 1 punto
		ResultadoEnum resultadoReal = partido.resultado(equipo);
		if (resultadoReal.equals(resultado)) {
			return 1;
		} else {
			return 0;
		}
	}
	// Sobreescritura del metodo toString para mostrar el pronostico
	@Override
	public String toString() {
		return "Pronostico: \n" + partido + "\nEquipo: " + equipo.getNombre() + "\nResultado: " + resultado;
	}

}