package com.ceep.ventas;

import com.ceep.domain.*;

public class GestionVentas {

    public static void main(String[] args) {

        Producto p1 = new Producto("Peras", 5.4);
        Producto p2 = new Producto("Mazanas", 6.4);
        Producto p3 = new Producto("Platanos", 7.0);
        Orden ped1 = new Orden();
        
        ped1.agregarProducto(p1);
        ped1.agregarProducto(p2);
        ped1.agregarProducto(p3);
        
        ped1.mostrarOrden();

    }

}
