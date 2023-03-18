package tp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		String resultadosFileName = "C:\\Users\\DARIO\\programming\\tp\\ap-java-proyecto\\resultados.txt";
		String pronosticoFileName = "C:\\Users\\DARIO\\programming\\tp\\ap-java-proyecto\\pronostico.txt";

		try {
			List<String> resultadosLines = Files.readAllLines(Paths.get(resultadosFileName));
			List<String> pronosticoLines = Files.readAllLines(Paths.get(pronosticoFileName));
			for (int i = 0; i < resultadosLines.size(); i++) {
				String[] data = resultadosLines.get(i).split("\\|");
				int id1 = Integer.parseInt(data[0]);
				String nombre1 = data[1];
				int id2 = Integer.parseInt(data[4]);
				String nombre2 = data[5];
				Equipo equipo1 = new Equipo(id1, nombre1, "Seleccionado");
				Equipo equipo2 = new Equipo(id2, nombre2, "Seleccionado");
				int goles1 = Integer.parseInt(data[2]);
				int goles2 = Integer.parseInt(data[3]);
				Partido partido = new Partido(equipo1, equipo2, goles1, goles2);
				String[] pronosticoData = pronosticoLines.get(i).split("\\|");
				ResultadoEnum resultado = null;
				if (pronosticoData[1].equals("X")) {
					resultado = ResultadoEnum.GANADOR;
				} else if (pronosticoData[2].equals("X")) {
					resultado = ResultadoEnum.EMPATE;
				} else if (pronosticoData[3].equals("X")) {
					resultado = ResultadoEnum.PERDEDOR;
				}
				Pronostico pronostico = new Pronostico(partido, equipo1, resultado);
				System.out.println(pronostico);
			}
		} catch (IOException e) {
			System.err.format("IOException: %s%n", e);
		}
	}
}