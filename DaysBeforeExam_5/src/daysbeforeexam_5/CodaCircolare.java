package daysbeforeexam_5;

/**
 *
 * @author giuse
 */
public class CodaCircolare {
    public int numElem;
    public int max;
    public int testa;
    public int coda;
    public Imbarcazione[] C;
    
    public CodaCircolare(int dim){
        this.testa = this.coda = 0;
        this.max = dim;
        this.numElem = 0;
        this.C = new Imbarcazione[max];
    }
    
    public void append(Imbarcazione elem){
        C[coda] = elem;
        coda = (coda+1)%max;
        numElem++;
    }
    
    public Imbarcazione pop(){
        Imbarcazione elem = C[testa];
        testa = (testa+1)%max;
        numElem--;
        return elem;
    }
    
    public void print(){
        for(int i=0; i<numElem; i++){
            System.out.println(C[(testa+1)%max]);
        }
    }
    
}
