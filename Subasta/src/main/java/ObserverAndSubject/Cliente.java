/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverAndSubject;


public class Cliente {
    
    // Atribute of the tenderer
    private String nombre;

    // Constructor of the tenderer
    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void update(Subject subject) {
        ProductoASubastar productoASubastar = (ProductoASubastar) subject;
        System.out.println("El producto se ha actulaizado ");
    }

    // Licitador ofertando por el producto
    public void offer(ProductoASubastar productoASubastar, double precio) {
        productoASubastar.setPrecio(precio);
    }
}
