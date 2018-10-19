package springBoot.mvc.practica2.model;

public class Producto {
	String codigo;
	String nombre;
	String descripcion;
	int precio;
	
	
	public Producto(String codigo, String nombre, String descripcion, int precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	
	@Override
	public String toString() {
		return "Codigo: " + codigo + ", Nombre: " + nombre+ ", Descripcion: " + descripcion+ ", Precio: " + precio;
	}
}
