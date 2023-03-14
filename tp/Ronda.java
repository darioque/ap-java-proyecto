package tp;
import java.util.Scanner;

public class Ronda {
  private String numero;
  private Partido[] partidos;

  public Ronda(String numero, Partido[] partidos) {
    this.numero = numero;
    this.partidos =
        new Partido[2]; // este vector lo usariamos para cargar todos los
                        // partidos desde el en este caso solo 2
  }
  public Ronda() {}

  // en este metodo tendriamos que recorrer el vector sacando la info de cada
  // partido del archivo
  public Partido[] cargarVector() {
    Partido[] vectorP = new Partido[2];
    System.out.println("Informacion de los equipos en las RONDAS: ");
    for (int i = 0; i < vectorP.length; i++) {
      vectorP[i] =
          new Partido(); // cada vez que accedo a una nueva posicion del vector
      vectorP[i].leerPartido(); // llamamos al metodo que lee los partidos
    }
    return partidos = vectorP;
  }
  int puntos = 0;
  public int recorrerVector(Pronostico p, int num) {
    if (partidos[num].ganador().equals(p.getEquipo().getNombre()) ||
        (partidos[num].ganador().equals(
            p.getResultado()))) { // comparo los ganadores del partido y del
                                  // pronostico
      puntos = puntos + 1; // si son iguales sumo uno
    }
    if (num + 1 == partidos.length) {
      System.out.println("puntos: " + puntos);
    }
    return puntos;
  }
}
