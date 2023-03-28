package tp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
	public static void main(String[] args) {
		// Ruta relativa a los archivos de resultados y pronostico
		String resultadosFileName = "ap-java-proyecto\\resultados.csv";
		String pronosticoFileName = "ap-java-proyecto\\pronostico.csv";
		// Variable para acumular el puntaje total
		int puntaje = 0;

		// El bloque try-catch es para manejar errores de lectura de archivos
		try {
			// Leemos las lineas de los archivos y las guardamos en arreglos
			String[] resultadosLines = Files.readAllLines(Paths.get(resultadosFileName)).toArray(new String[0]);
			String[] pronosticoLines = Files.readAllLines(Paths.get(pronosticoFileName)).toArray(new String[0]);
			// Iteramos sobre las lineas de los archivos (asumimos que existe la misma
			// cantidad de partidos que pronosticos)
			for (int i = 0; i < resultadosLines.length; i++) {
				// Separamos los datos de cada linea de resultados.txt por el caracter |
				String[] data = resultadosLines[i].split("\\|");
				// Convertimos los datos a los tipos correspondientes e instanciamos los objetos
				// (los datos obtenidos del archivo son Strings)
				int id1 = Integer.parseInt(data[0]);
				String nombre1 = data[1];
				Equipo equipo1 = new Equipo(id1, nombre1, "Seleccionado");

				int id2 = Integer.parseInt(data[4]);
				String nombre2 = data[5];
				Equipo equipo2 = new Equipo(id2, nombre2, "Seleccionado");

				int goles1 = Integer.parseInt(data[2]);
				int goles2 = Integer.parseInt(data[3]);
				Partido partido = new Partido(equipo1, equipo2, goles1, goles2);

				// Separamos los datos de cada linea de pronosticos.txt por el caracter |
				String[] pronosticoData = pronosticoLines[i].split("\\|");
				// Obtenemos el resultado del pronostico dependiendo de la posicion de X en la
				// linea (ver formato de pronosticos.txt)
				ResultadoEnum resultado = null;
				if (pronosticoData[1].equals("X")) {
					resultado = ResultadoEnum.GANADOR;
				} else if (pronosticoData[2].equals("X")) {
					resultado = ResultadoEnum.EMPATE;
				} else if (pronosticoData[3].equals("X")) {
					resultado = ResultadoEnum.PERDEDOR;
				}
				// Instanciamos el pronostico
				Pronostico pronostico = new Pronostico(partido, equipo1, resultado);
				// Imprimimos el pronostico y los puntos obtenidos
				System.out.println(pronostico);
				System.out.println("\tPuntos: " + pronostico.puntos());
				// Sumamos los puntos obtenidos al puntaje total
				puntaje += pronostico.puntos();
			}
			// Manejamos los errores de lectura de archivos
		} catch (IOException e) {
			System.err.format("IOException: %s%n", e);
		}
		// Imprimimos el puntaje total
		System.out.println("\nPuntaje total: " + puntaje);
	}
}