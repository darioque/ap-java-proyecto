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

	// Getter de nombre
	public String getNombre() {
		return nombre;
	}

	// Sobreescritura del metodo toString para mostrar el equipo
	// Esto hace que cuando se llame a System.out.println(equipo) se muestre así
	@Override
	public String toString() {
		return "Equipo: " + nombre + "\nID: " + id + "\nDescripción: " + descripcion;
	}
}