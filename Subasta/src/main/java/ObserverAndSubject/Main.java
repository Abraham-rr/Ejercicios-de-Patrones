
package ObserverAndSubject;


public class Main {
     public static void main(String[] args) {
        Cliente clientePedro = new Cliente("Pedro");
        Cliente clientePaco = new Cliente("Paco");
        
        ProductoASubastar producto1 = new ProductoASubastar("HP DeadPavilton",12000, true);
        ProductoASubastar producto2 = new ProductoASubastar("HP Pavilion",10000, true);
        
        System.out.println("1prodcuto " + producto1.getNombre() + " Precio inicial " + producto1.getPrecio());
        System.out.println("2producti: " + producto2.getNombre() + " Precio inicial: " + producto2.getPrecio());
        
        producto1.registroCliente(clientePaco);
        producto2.registroCliente(clientePedro);
        
        clientePedro.offer(producto1, 12500);
        
        producto1.removeCliente(clientePaco);
       
         System.out.println("Se lo lleva " + clientePedro);
    }   
}
