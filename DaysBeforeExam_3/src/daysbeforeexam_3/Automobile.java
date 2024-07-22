package daysbeforeexam_3;

/**
 *
 * @author giuse
 */
public class Automobile extends VeicoloAutonomo{
    private int velocitaCorrente;
    
    public Automobile(int carica, int kmPercorsi, String ID, int velocitaCorrente){
        super(carica,kmPercorsi,ID);
        this.velocitaCorrente = velocitaCorrente;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this==obj){return true;}
        if(obj==null){return false;}
        if(this.getClass()!=obj.getClass()){return false;}
        
        final Automobile elem = (Automobile)obj;
        return this.getID().equals(elem.getID()) && this.velocitaCorrente == elem.velocitaCorrente;
    }
    
    @Override
    public void increase(int value){this.velocitaCorrente = this.velocitaCorrente + value;}
    
    @Override
    public String toString(){
    return super.toString()+"\t\tVelocità corrente: "+this.velocitaCorrente;}
}
