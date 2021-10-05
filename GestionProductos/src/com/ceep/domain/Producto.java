package com.ceep.domain;

public class Producto {

    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    //Constructor
    public Producto() {
        this.idProducto = ++Producto.contadorProductos;
    }

    public Producto(String nombre, double precio) {
        this(); //Para hacer referencia al constructor vacio
        this.nombre = nombre;
        this.precio = precio;
    }

    //Getter and Setter
    public final int getIdProducto() {
        return this.idProducto;
    }

//    public static void setIdProducto(int idProducto) {
//        Producto.idProducto =  idProducto;
//    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getContadorProductos() {
        return this.contadorProductos;
    }

    public static void setContadorProductos(int contadorProductos) {
        Producto.contadorProductos = contadorProductos;
    }

    //toString
    @Override
    public String toString() {
        return "Producto{" + "nombre=" + this.nombre + ", precio=" + this.precio + '}';
    }

}
