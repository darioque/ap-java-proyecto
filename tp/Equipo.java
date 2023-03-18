package tp;

public class Equipo {
	private int id;
	private String nombre;
	private String descripcion;

	public Equipo(int id, String nombre, String descripcion) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public void mostrarEquipo() {
		System.out.println("ID: " + id);
		System.out.println("Nombre: " + nombre);
		System.out.println("Descripcion: " + descripcion);
	}
}