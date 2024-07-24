/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generici;

/**
 *
 * @author giuse
 */
public class Elemento<T> {

    private final T elemento;
    
    public Elemento(T elemento){
        this.elemento = elemento;
    }
    
    public T getTipo(){return this.elemento;}
}
