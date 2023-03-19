package tp;

public class Partido {
	private Equipo equipo1;
	private Equipo equipo2;
	private int goles1;
	private int goles2;

	public Partido(Equipo equipo1, Equipo equipo2, int goles1, int goles2) {
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.goles1 = goles1;
		this.goles2 = goles2;
	}

	// Determina el resultado del partido para un equipo en particular
	public ResultadoEnum resultado(Equipo equipo) {
		if (goles1 > goles2) {
			if (equipo.equals(equipo1))
				return ResultadoEnum.GANADOR;
			else
				return ResultadoEnum.PERDEDOR;
		} else if (goles1 < goles2) {
			if (equipo.equals(equipo1))
				return ResultadoEnum.PERDEDOR;
			else
				return ResultadoEnum.GANADOR;
		} else {
			return ResultadoEnum.EMPATE;
		}
	}

	// Sobreescritura del metodo toString para mostrar el partido
	@Override
	public String toString() {
		return "Partido: " + equipo1.getNombre() + " " + goles1 + " - " + equipo2.getNombre() + " " + goles2;
	}
}