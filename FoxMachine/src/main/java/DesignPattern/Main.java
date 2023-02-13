/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPattern;


public class Main {
    public static void main(String[] args){
        Impresora impresora1 = new Impresora ("Cannon",12000, new ReducirPrecio());
        System.out.println("Nombre del producto "+impresora1.getNombre());
        System.out.println("Descuento"+impresora1.getDescuentoPrecio());
    }
}
