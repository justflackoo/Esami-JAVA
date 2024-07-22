package daysbeforeexam_3;

/**
 *
 * @author giuse
 */
public abstract class VeicoloAutonomo implements Comparable<VeicoloAutonomo>, Increasable{
    private int carica;
    private int kmPercorsi; 
    private String ID;
    
    public VeicoloAutonomo(int carica, int kmPercorsi, String ID){
        this.carica = carica;
        this.kmPercorsi = kmPercorsi;
        this.ID = new String(ID);
    }
    
    public String getID(){return this.ID;}
    
    public int getKMPercorsi(){return this.kmPercorsi;}
    
    @Override
    public int compareTo(VeicoloAutonomo v){
        return this.carica-v.carica;}
    
    @Override
    public boolean equals(Object obj){
        if(this==obj){return true;}
        if(obj==null){return false;}
        if(this.getClass()!=obj.getClass()){return false;}
        
        final VeicoloAutonomo elem = (VeicoloAutonomo) obj;
        return this.ID.equals(elem.ID);
    }
    
    @Override
    public String toString(){
    return "ID: "+this.ID+"\tCarica: "+this.carica+"\tKM percorsi: "+this.kmPercorsi;}
}
