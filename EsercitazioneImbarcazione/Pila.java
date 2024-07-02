package esercitazioneimbarcazione.Esame;
import esercitazioneimbarcazione.Imbarcazione;
/**
 *
 * @author giuse
 */
public class Pila {
    private int max;
    private Imbarcazione[] C;
    private int testa;
    
    public Pila(int dim){
        this.testa=0;
        this.max=dim;
        this.C = new Imbarcazione[max];
    }
    
    public void push(Imbarcazione i){
        C[testa] = i;
        testa++;
    }
    
    public Imbarcazione pop(){
        testa--;
        Imbarcazione i = C[testa];
        return i;
    }
    public void print(){
        for(int i=testa-1; i>=0; i--){
           System.out.println(C[i]);
        }
    }
    
    public Imbarcazione top(){
        return C[testa-1];
    }
        
    
}
