package esame1_28giugno2024;

/**
 *
 * @author giuse
 */
public abstract class VeicoloAutonomo implements Comparable<VeicoloAutonomo>, Increasable{
    private int carica;
    private int kmPercorsi;
    private String id;
    
    public VeicoloAutonomo(int carica, int km, String id){
        this.carica=carica;
        this.kmPercorsi=km;
        this.id = new String(id);
    }
    
    @Override
    public int compareTo(VeicoloAutonomo v){
        return this.carica-v.carica;
    }
    
    @Override
    public String toString(){
        return "ID: "+this.id+"\tCarica: "+this.carica+"\tkmPercorsi: "+this.kmPercorsi;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this==obj){return true;}
        if(obj==null){return false;}
        if(this.getClass() != obj.getClass()){return false;}
        
        final VeicoloAutonomo v = (VeicoloAutonomo) obj;
        return this.id.compareTo(v.id)==0;
    }
    
    public int getCarica(){return this.carica;}
    public int getKmPercorsi(){return this.kmPercorsi;}
    public String getId(){return this.id;}
}
