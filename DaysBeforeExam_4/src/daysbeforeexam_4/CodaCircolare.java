package daysbeforeexam_4;

/**
 *
 * @author giuse
 */
public class CodaCircolare {
    private int testa;
    private int coda;
    private int max;
    private int numElem;
    private Canale[] C;
    
    public CodaCircolare(int dim){
        this.testa = this.coda = 0;
        this.numElem=0;
        this.max = dim;
        this.C = new Canale[max];
    }
    
    public void append(Canale c){
        C[coda] = c;
        coda = (coda+1)%max;
        numElem++;
    }
    
    public Canale pop(){
        Canale c = C[testa];
        testa = (testa+1)%max;
        numElem--;
        return c;
    }
    
    public void print(){
        for(int i=0; i<numElem;i++){
            System.out.println(C[(testa+1)%max]);
        }
    }
    
}
