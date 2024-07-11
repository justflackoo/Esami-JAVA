package esame1_28giugno2024;

/**
 *
 * @author giuse
 */
public class Automobile extends VeicoloAutonomo{
    private int velocitaCorrente;
    
    public Automobile(int carica, int kmPercorsi, String id, int velocita){
        super(carica,kmPercorsi,id);
        this.velocitaCorrente=velocita;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this==obj){return true;}
        if(obj==null){return false;}
        if(this.getClass()!= obj.getClass()){return false;}
        
        final Automobile auto = (Automobile) obj;
        return this.getId().compareTo(auto.getId())==0 && this.velocitaCorrente==auto.getVelocitaCorrente();
    }
    
    @Override
    public String toString(){
    return super.toString()+"\tvelocitaCorrente: "+this.velocitaCorrente;}
    
    @Override
    public void increase(int value){
        this.velocitaCorrente = velocitaCorrente+value;
    }
        
    public int getVelocitaCorrente(){return this.velocitaCorrente;}
}
