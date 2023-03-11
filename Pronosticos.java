package tp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Pronosticos {
	public static void main(String args[]) throws IOException {
	String archivo = "C:\\Users\\DARIO\\programming\\ap-utn-java\\tp\\equipo.txt" ;
	for (String linea : Files.readAllLines(Paths.get(archivo))){
		System.out.println(linea);
	}



	}


}