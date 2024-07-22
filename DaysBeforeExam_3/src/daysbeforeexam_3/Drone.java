package daysbeforeexam_3;

/**
 *
 * @author giuse
 */
public class Drone extends VeicoloAutonomo{
    private int altezzaCorrente;
    
    public Drone(int carica, int kmPercorsi, String ID, int altezzaCorrente){
        super(carica, kmPercorsi, ID);
        this.altezzaCorrente = altezzaCorrente;
    }
    
    @Override
    public void increase(int value){this.altezzaCorrente = this.altezzaCorrente + value;}
    
    @Override
    public boolean equals(Object obj){
        if(this==obj){return true;}
        if(obj==null){return false;}
        if(this.getClass()!=obj.getClass()){return false;}
        
        final Drone elem = (Drone) obj;
        return this.getID().equals(elem.getID()) && this.altezzaCorrente == elem.altezzaCorrente;
    }
    
    @Override
    public String toString(){
    return super.toString()+"\t\tAltezza corrente: "+this.altezzaCorrente;}
}
