package Master.model.model;

public class Producto {

    private String código;
    public String nombre;
    private String descripcion;
    private int precio;

    public Producto(String código, String nombre, String descripcion, int precio) {
        this.código = código;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getCódigo() {
        return código;
    }

    public void setCódigo(String código) {
        this.código = código;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
