
package DesignPattern;


public class Impresora {
    Descuento descuento;
    
    private final String nombre;
    private final double precio;
    private final double descuentoPrecio;
    
    public Impresora(String nombre, double precio, Descuento descuento) {
        this.nombre = nombre;
        this.descuento = descuento;
        this.precio = precio;
        this.descuentoPrecio = descuento.descuento(precio);    
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getPrecio() {
        return precio;
    }


    public double getDescuentoPrecio() {
        return descuentoPrecio;
    }
    
}
    
    
    
    
    
    
    
    
    
