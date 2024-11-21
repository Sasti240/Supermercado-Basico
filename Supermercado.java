package Supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

    public static void main(String[] args) {

        List<Producto> productosDisponibles = crearProductos();

        List<Cliente> clientes = crearClientes(productosDisponibles);

        Cajera cajera = new Cajera();
        for (Cliente cliente : clientes) {
            cajera.procesarCompra(cliente);
        }
    }

    private static List<Producto> crearProductos() {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Pan", 1500, 1000));
        productos.add(new Producto("Leche", 2300, 1500));
        productos.add(new Producto("Huevos", 3000, 2000));
        productos.add(new Producto("Queso", 4500, 2500));
        productos.add(new Producto("Carne", 10000, 3000));
        productos.add(new Producto("Arroz", 2000, 1200));
        productos.add(new Producto("Frijoles", 1800, 1300));
        productos.add(new Producto("Aceite", 5000, 2200));
        productos.add(new Producto("Café", 3500, 1400));
        productos.add(new Producto("Té", 2500, 1100));
        return productos;
    }

    private static List<Cliente> crearClientes(List<Producto> productos) {
        Cliente cliente1 = new Cliente("Carlos");
        cliente1.agregarProducto(productos.get(0)); 
        cliente1.agregarProducto(productos.get(3)); 
        cliente1.agregarProducto(productos.get(7)); 

        Cliente cliente2 = new Cliente("Ana");
        cliente2.agregarProducto(productos.get(1)); 
        cliente2.agregarProducto(productos.get(2)); 
        cliente2.agregarProducto(productos.get(4)); 

        Cliente cliente3 = new Cliente("Luis");
        cliente3.agregarProducto(productos.get(5)); 
        cliente3.agregarProducto(productos.get(6)); 
        cliente3.agregarProducto(productos.get(8)); 

        Cliente cliente4 = new Cliente("Marta");
        cliente4.agregarProducto(productos.get(0)); 
        cliente4.agregarProducto(productos.get(9)); 
        cliente4.agregarProducto(productos.get(2)); 

        Cliente cliente5 = new Cliente("Juan");
        cliente5.agregarProducto(productos.get(3)); 
        cliente5.agregarProducto(productos.get(4)); 
        cliente5.agregarProducto(productos.get(1)); 

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        clientes.add(cliente5);
        return clientes;
    }
}