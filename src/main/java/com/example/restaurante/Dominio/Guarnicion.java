package com.example.restaurante.Dominio;

public class Guarnicion {

    private String nombre;
    private String precioIndividual;

    public Guarnicion(String nombre, String precioIndividual) {
        this.nombre = nombre;
        this.precioIndividual = precioIndividual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecioIndividual() {
        return precioIndividual;
    }

    public void setPrecioIndividual(String precioIndividual) {
        this.precioIndividual = precioIndividual;
    }
}
