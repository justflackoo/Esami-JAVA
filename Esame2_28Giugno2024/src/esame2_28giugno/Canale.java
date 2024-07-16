package esame2_28giugno;

/**
 *
 * @author giuse
 */
public abstract class Canale implements Comparable<Canale>, Tunable{
    private int frequenza;
    private String nomeCanale;
    
    public Canale(int frequenza, String nomeCanale){
        this.frequenza = frequenza;
        this.nomeCanale = new String(nomeCanale);
    }
    
    @Override
    public int compareTo(Canale c){return this.frequenza-c.frequenza;}
    
    
    @Override
    public String toString(){
    return "NomeCanale: "+this.nomeCanale+"\tFrequenza: "+this.frequenza;}
    
    @Override
    public boolean equals(Object obj){
        if(this==obj){return true;}
        if(obj==null){return false;}
        if(this.getClass()!=obj.getClass()){return false;}
        
        final Canale c = (Canale) obj;
        return this.frequenza==c.frequenza;
        
    }
    
}
