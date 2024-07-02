package esercitazioneimbarcazione.Esame;
import esercitazioneimbarcazione.Imbarcazione;

/**
 *
 * @author giuse
 */
public class CodaCircolare {
    private int coda;
    private int testa;
    private int max;
    private int nElem;
    private Imbarcazione C[];
    
    public CodaCircolare(int dim){
        this.testa=this.coda=0;
        this.max=dim;
        this.nElem=0;
        this.C = new Imbarcazione[max];
    }
    
    public boolean isEmpty(){return this.nElem==0;}
    public boolean isFull(){return this.nElem==max;}
    
    public void append(Imbarcazione i){
            C[coda] = i;
            coda = (coda+1)%max;
            nElem++;
    }
    
    public Imbarcazione pop(){
        Imbarcazione i = C[testa];
        testa = (testa+1)%max;
        nElem--;
        return i;
    }
    
    public void print(){
        for(int i=0; i<nElem;i++){
            System.out.println(i);
        }
    }
    
}
