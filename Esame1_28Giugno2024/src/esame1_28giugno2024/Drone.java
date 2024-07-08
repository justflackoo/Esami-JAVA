
package esame1_28giugno2024;

/**
 *
 * @author giuse
 */
public class Drone extends VeicoloAutonomo{
    private int altezzaCorrente;
    
    public Drone(int carica, int kmPercorsi, String id, int altezza){
        super(carica,kmPercorsi,id);
        this.altezzaCorrente=altezza;
    }
    
    @Override
    public void increase(int value){
        this.altezzaCorrente = this.altezzaCorrente + value;}
    
    @Override
    public String toString(){      
    return super.toString()+"\tAltezzaCorrente: "+this.altezzaCorrente;}
    
    @Override
    public boolean equals(Object obj){
        if(this==obj){return true;}
        if(obj == null){return false;}
        if(!(obj instanceof Drone)){return false;}
        Drone d = (Drone) obj;
        return super.equals(obj) && this.altezzaCorrente==d.altezzaCorrente;
    }
    
   
    
}
