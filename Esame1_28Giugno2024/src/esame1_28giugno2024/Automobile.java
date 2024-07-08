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
        if(!(obj instanceof Automobile)){return false;}
        
        Automobile auto = (Automobile) obj;
        return super.equals(auto) && this.velocitaCorrente == auto.velocitaCorrente;
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
