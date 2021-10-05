package com.ceep.domain;

public class Orden {

    private final int idOrden;
    Producto productos[];
    private static int contadorOrdenes;
    private static int contadorProductos;
    private static final int maxProductos = 10;

    //Constructor
    public Orden() {
        productos = new Producto[Orden.maxProductos];
        this.idOrden = ++Orden.contadorOrdenes;
    }

    //Metodos
    public void agregarProducto(Producto producto) {
        if (Orden.contadorProductos < Orden.maxProductos) {
            productos[Orden.contadorProductos++] = producto;
        } else {
            System.out.println("Has alcanzado el maximo de productos por orden de " + Orden.maxProductos);
        }
    }

    public double calcularTotal() {
        var res = 0.0;
        for (int i = 0; i < Orden.contadorProductos; i++) {
            res += productos[i].getPrecio();
        }
        return res;

    }

    public void mostrarOrden() {
        System.out.println("Id de Orden: " + this.idOrden);
        for (int i = 0; i < Orden.contadorProductos; i++) {
            System.out.println("Nombre producto[" + i + "] -> " + productos[i].getNombre());
            System.out.println("Precio producto[" + i + "] -> " + productos[i].getPrecio());

        }
        System.out.println("Total: "+ this.calcularTotal());
    }
}
