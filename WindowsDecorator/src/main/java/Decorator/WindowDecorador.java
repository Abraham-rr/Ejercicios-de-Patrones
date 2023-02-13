
package Decorator;

public class WindowDecorador implements WindowComponent{
     protected WindowComponent windowToBeDecorated;

    public WindowDecorador(WindowComponent windowToBeDecorated) {
        this.windowToBeDecorated = windowToBeDecorated;
    }

    public void display() {
        windowToBeDecorated.display();
    }
}
