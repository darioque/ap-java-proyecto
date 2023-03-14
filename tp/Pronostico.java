package tp;

import java.util.Scanner;
public class Pronostico {
  private Partido partido = new Partido();
  private Equipo equipo = new Equipo();
  private String resultado;
  public Pronostico(Partido partido, Equipo equipo, String resultado) {
    this.partido = partido;
    this.equipo = equipo;
    this.resultado = resultado;
  }
  public Pronostico() {}
  public void
  leerPronostico() { // aca tendriamos que leer el archivo de los pronosticos
    System.out.println("Informacion de los equipos en el PRONOSTICO: ");
    partido.leerPartido();
    Scanner res = new Scanner(System.in);
    System.out.println("Ingrese Resultado esperado: ");
    this.resultado = res.nextLine();
  }

  public Equipo getEquipo() { return equipo; }

  public String getResultado() { // obtengo el resultado del pronostico
    return resultado;
  }
}

// public class Pronostico {
// 	private Partido partido;
// 	private Equipo equipo;

// 	public Pronostico(Partido partido, Equipo equipo) {
// 		this.partido = partido;
// 		this.equipo = equipo;
// 	}
// }