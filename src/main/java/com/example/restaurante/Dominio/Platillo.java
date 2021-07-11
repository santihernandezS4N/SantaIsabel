package com.example.restaurante.Dominio;

public class Platillo {

    private String nombre;
    private String descripcion;
    private Integer precio;
    private String posiblesGuarniciones;

    public Platillo(String nombre, String descripcion, Integer precio, String posiblesGuarniciones) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.posiblesGuarniciones = posiblesGuarniciones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public String getPosiblesGuarniciones() {
        return posiblesGuarniciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public void setPosiblesGuarniciones(String posiblesGuarniciones) {
        this.posiblesGuarniciones = posiblesGuarniciones;
    }


}
