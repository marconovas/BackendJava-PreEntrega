package com.techlab.model;

public class Categoria {
    private int codigo;
    private String nombre;
    private String descripcion;

    //CONSTRUCTOR
    public Categoria(int codigo, String nombre, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    @Override 
    public String toString() {
        return "{codigo=" + this.codigo  +
                ", nombre=" + this.nombre + ", descripcion=" +
                this.descripcion + " }";
    }

    //GETTERS
    public int getCodigo() {
        return this.codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    //SETTERS
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
