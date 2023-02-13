/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author USER
 */
public class WindowConcreteComponent implements WindowComponent{
    private String description = "";

    public String getDescription() {
        return description;
    }

    public void display() {
        System.out.println("Display " + description);
    }
}
