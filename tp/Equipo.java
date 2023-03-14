package tp;
import java.util.Scanner;
public class Equipo {
  private String nombre;
  private String descripcion;

  //    public Equipo(String nombre,String descripcion){
  //        this.nombre=nombre;
  //        this.descripcion=descripcion;
  //    }
  public Equipo() {}
  public void leerEquipo() {
    Scanner nom = new Scanner(System.in);
    System.out.println("ingrese nombre del equipo: ");
    this.nombre = nom.nextLine();
  }
  public String getNombre() { return nombre; }
}
