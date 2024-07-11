
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
    
    public int getAltezzaCorrente(){return this.altezzaCorrente;}
    
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
        if(this.getClass()!=obj.getClass()){return false;}
        final Drone d = (Drone) obj;
        return this.getId().compareTo(d.getId())==0 &&  this.altezzaCorrente== d.getAltezzaCorrente();
    }
    
   
    
}
