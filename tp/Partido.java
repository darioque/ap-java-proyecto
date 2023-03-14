package tp;
import java.util.Scanner;
public class Partido {
  private Equipo equipo1 = new Equipo();
  private Equipo equipo2 = new Equipo();
  private int golesE1;
  private int golesE2;

  public Partido(Equipo equipo1, Equipo equipo2, int golesE1, int golesE2) {
    this.equipo1 = equipo1;
    this.equipo2 = equipo2;
    this.golesE1 = golesE1;
    this.golesE2 = golesE2;
  }
  public Partido() {}

  public String ganador() {
    String resultado;
    if (this.golesE1 > this.golesE2) {
      resultado = this.equipo1.getNombre();
    } else if (this.golesE2 > this.golesE1) {
      resultado = this.equipo2.getNombre();
    } else
      resultado = "Empate";
    return resultado;
  }

  public void leerPartido() { // en este metodo tendriamos que leer el archivo
                              // de los partidos
                              // Equipo equipo1=new Equipo();
    //  Equipo equipo2=new Equipo();
    equipo1.leerEquipo();
    equipo2.leerEquipo();
    Scanner cantG1 = new Scanner(System.in);
    System.out.println("cantidad de goles " /*this.equipo1.getNombre()*/);
    this.golesE1 = cantG1.nextInt();
    Scanner cantG2 = new Scanner(System.in);
    System.out.println("cantidad de goles " /*+ this.equipo2.getNombre()*/);
    this.golesE2 = cantG2.nextInt();
  }
}

// public class Partido {
// 	private Equipo equipo1;
// 	private Equipo equipo2;
// 	private int goles1;
// 	private int goles2;

// 	public Partido(Equipo equipo1, Equipo equipo2, int goles1, int goles2) {
// 		this.equipo1 = equipo1;
// 		this.equipo2 = equipo2;
// 		this.goles1 = goles1;
// 		this.goles2 = goles2;
// 	}

// 	public String resultado() {
// 		if (goles1 > goles2) {
// 			return "Gano " + equipo1;
// 		} else if (goles1 < goles2) {
// 			return "Gano " + equipo2;
// 		} else {
// 			return "Empate";
// 		}
// 	}
// }