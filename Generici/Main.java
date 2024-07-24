/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generici;

/**
 *
 * @author giuse
 */
public class Main {
    
    public static void main(String[] args){
        Elemento<Italiano> ita = new Elemento<>(new Italiano());
        Elemento<Marocchino> mar = new Elemento<>(new Marocchino());
        
        Anagrafe a = new Anagrafe();
        a.riconosco(ita);
        a.riconosco(mar);
        
    }
    
}
