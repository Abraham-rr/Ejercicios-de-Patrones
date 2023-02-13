
package ObserverAndSubject;


public interface Subject {
    void registroCliente(Cliente c);
    void removeCliente(Cliente c);
    void notifyCliente();
}
