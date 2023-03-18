package tp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		String fileName = "C:\\Users\\DARIO\\programming\\tp\\ap-java-proyecto\\resultados.txt";

		try {
			List<String> lines = Files.readAllLines(Paths.get(fileName));
			for (String line : lines) {
				String[] data = line.split("\\|");
				int id1 = Integer.parseInt(data[0]);
				String nombre1 = data[1];
				int id2 = Integer.parseInt(data[4]);
				String nombre2 = data[5];
				Equipo equipo1 = new Equipo(id1, nombre1, "Seleccionado");
				Equipo equipo2 = new Equipo(id2, nombre2, "Seleccionado");
				equipo1.mostrarEquipo();
				equipo2.mostrarEquipo();
			}
		} catch (IOException e) {
			System.err.format("IOException: %s%n", e);
		}
	}
}
