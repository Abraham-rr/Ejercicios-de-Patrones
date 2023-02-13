
package ObserverAndSubject;

import java.util.ArrayList;
import java.util.List;


public class ProductoASubastar implements Subject {
    private String nombre;
    private double precio;
    private boolean disponible;
    
     private List<Cliente> clientes = new ArrayList<Cliente>();
     
     public ProductoASubastar(String nombre, double precio, boolean disponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = disponible;
    }
     
     @Override
    public void registroCliente(Cliente c) {
        clientes.add(c);
    }
    
     @Override
    public void removeCliente(Cliente c) {
        clientes.add(c);
    }
     
      @Override
    public void notifyCliente() {
        for (Cliente cliente : clientes) {
            cliente.update(this);
        }
    }
    
     public double getPrecio() {
        return precio;
    }
    public String getNombre() {
        return nombre;
    }
     
      public void setPrecio(double precio) {
        this.precio = precio;
        notifyCliente();
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
     
     
     
     
     
     
     
     
}
