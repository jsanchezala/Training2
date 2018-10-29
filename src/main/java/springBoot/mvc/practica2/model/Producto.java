package springBoot.mvc.practica2.model;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

public class Producto {

    @Id
    private String codigo;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;

    public Producto(String codigo, String nombre, String descripcion, BigDecimal precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Producto() {

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public BigDecimal getPrice() {
        return precio;
    }

    public void setPrice(BigDecimal precio) {
        this.precio = precio;
    }

}


