package daysbeforeexam_4;

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
    
    public String getNomeCanale(){return this.nomeCanale;}
    
    @Override
    public int compareTo(Canale c){
    return this.frequenza - c.frequenza;}
    
    @Override
    public boolean equals(Object obj){
        if(this==obj){return true;}
        if(obj==null){return false;}
        if(this.getClass()!=obj.getClass()){return false;}
        
        final Canale elem = (Canale) obj;
        return this.frequenza == elem.frequenza;
    }
    
    @Override
    public String toString(){
    return "Nome canale: "+this.nomeCanale+"\tFrequenza: "+this.frequenza;}
    
}
