package Supermercado;

public class Producto {
    private final String nombre;
    private final double precio;
    private final int tiempoProcesamiento;

    public Producto(String nombre, double precio, int tiempoProcesamiento) {
        this.nombre = nombre;
        this.precio = precio;
        this.tiempoProcesamiento = tiempoProcesamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getTiempoProcesamiento() {
        return tiempoProcesamiento;
    }

    @Override
    public String toString() {
        return String.format("%s (Precio: $%.2f, Tiempo: %d ms)", nombre, precio, tiempoProcesamiento);
    }
}
