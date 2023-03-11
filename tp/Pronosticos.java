package tp;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Pronosticos {
	public static void main(String[] args) throws IOException {
		String archivo = "C:\\Users\\DARIO\\programming\\tp\\ap-java-proyecto\\pronostico.csv";
		for (String linea : Files.readAllLines(Paths.get(archivo))) {
			System.out.println(linea);
		}
		Equipo equipo1 = new Equipo("Argentina", "El equipo de Messi");
		Equipo equipo2 = new Equipo("Brasil", "El equipo de Neymar");
		Partido partido = new Partido(equipo1, equipo2, 2, 1);




	}

}


