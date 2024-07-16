/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package esameImbarcazione;

/**
 *
 * @author giuse
 */
public class Traghetto extends Imbarcazione {
    private int numAutomobili;
    
    public Traghetto(int numPass, int stazza, String nome, int numAutomobili){
        super(numPass, stazza, nome);
        this.numAutomobili = numAutomobili;
    }
    
    @Override
    public int notificaPasseggeri(){
    return this.numAutomobili+this.getNumPasseggeri();}
    
    @Override
    public String toString(){
    return super.toString()+"\tNumAutomobili: "+this.numAutomobili;}
    
}
