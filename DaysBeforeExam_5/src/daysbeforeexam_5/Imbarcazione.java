package daysbeforeexam_5;

/**
 *
 * @author giuse
 */
public abstract class Imbarcazione implements Comparable<Imbarcazione> {
    private int numPasseggeri;
    private int stazza;
    private String nome;
    
    public Imbarcazione(int numPasseggeri, int stazza, String nome){
        this.numPasseggeri = numPasseggeri;
        this.stazza = stazza;
        this.nome = new String(nome);
    }
    
    @Override
    public int compareTo(Imbarcazione i){return this.stazza - i.stazza;}
    
    
    @Override
    public boolean equals(Object obj){
        if(this==obj){return true;}
        if(obj==null){return false;}
        if(this.getClass()!=obj.getClass()){return false;}
        
        final Imbarcazione elem =(Imbarcazione) obj;
        return this.nome.equals(elem.nome);
    }
    
    @Override
    public String toString(){
    return "Nome: "+this.nome+"\tStazza: "+this.stazza+"\tNum passeggeri: "+this.numPasseggeri;}
    
    public abstract int notificaPasseggeri();
    
    public int getNumPasseggeri(){return this.numPasseggeri;}
    
}
