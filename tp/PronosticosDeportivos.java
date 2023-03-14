package tp;
public class PronosticosDeportivos {

  public static void main(String[] args) {
    Ronda r1 = new Ronda();             // creo una ronda
    r1.cargarVector();                  // cargo cada partido partidos
    Pronostico pro1 = new Pronostico(); // creo un objeto pronostico
    pro1.leerPronostico(); // ingreso la info del pronostico(hay que sacarla del
                           // archivo)
    Pronostico pro2 = new Pronostico(); // creo otro objeto pronostico
    pro2.leerPronostico(); // ingreso la info del pronostico(hay que sacarla del
                           // archivo)
    r1.recorrerVector(pro1, 0); // recorro el vector hasta la posicion que le
                                // mando y me fijo si los resultados son iguales
    r1.recorrerVector(pro2, 1); // lo mismo pero en la posicion siguiente
  }
  // creo que la ruta a los archivos tendriamos que pasarlas en las clase ronda
  // y en la clase pronostico
}
// import java.io.IOException;
// import java.nio.file.Files;
// import java.nio.file.Paths;

// public class Pronosticos {
// 	public static void main(String[] args) throws IOException {
// 		String archivo =
// "C:\\Users\\DARIO\\programming\\tp\\ap-java-proyecto\\pronostico.csv"; 		for
// (String linea : Files.readAllLines(Paths.get(archivo))) {
// 			System.out.println(linea);
// 		}
// 		Equipo equipo1 = new Equipo("Argentina", "El equipo de Messi");
// 		Equipo equipo2 = new Equipo("Brasil", "El equipo de Neymar");
// 		Partido partido = new Partido(equipo1, equipo2, 2, 1);
//}
//}
