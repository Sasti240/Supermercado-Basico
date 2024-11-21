package Supermercado;

import java.text.NumberFormat;
import java.util.Locale;

public class Cajera {

    private final NumberFormat formatoMoneda = NumberFormat.getCurrencyInstance(Locale.of("es", "CO"));

    public void procesarCompra(Cliente cliente) {
        imprimirMensaje(String.format("Iniciando el cobro para el cliente: %s", cliente.getNombre()));
        double total = 0;
        int tiempoTotal = 0;

        for (Producto producto : cliente.getProductos()) {
            procesarProducto(producto);
            total += producto.getPrecio();
            tiempoTotal += producto.getTiempoProcesamiento();
        }

        imprimirMensaje(String.format("Cobro finalizado para %s. Total: %s, Tiempo total: %d ms\n",
                cliente.getNombre(), formatoMoneda.format(total), tiempoTotal));
    }

    private void procesarProducto(Producto producto) {
        imprimirMensaje(String.format("Procesando producto: %s", producto));
        try {
            Thread.sleep(producto.getTiempoProcesamiento());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            imprimirMensaje("Error al procesar el producto: " + producto.getNombre());
        }
    }

    private void imprimirMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}