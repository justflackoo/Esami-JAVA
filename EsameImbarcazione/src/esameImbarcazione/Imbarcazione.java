package esameImbarcazione;

/**
 *
 * @author giuse
 */
public abstract class Imbarcazione implements Comparable <Imbarcazione>{
    private int numPasseggeri;
    private int stazza;
    private String nome;
    
    public Imbarcazione(int numPasseggeri, int stazza, String nome){
        this.numPasseggeri = numPasseggeri;
        this.stazza = stazza;
        this.nome = new String(nome);
    }
    public int getNumPasseggeri(){return this.numPasseggeri;}
    @Override
    public int compareTo(Imbarcazione i){
    return this.stazza - i.stazza;}
    
    @Override
    public boolean equals(Object obj){
        if(this==obj){return true;}
        if(obj==null){return false;}
        if(this.getClass()!=obj.getClass()){return false;}
        
        final Imbarcazione imb = (Imbarcazione) obj;
        return this.nome==imb.nome;
    }
    
    public abstract int notificaPasseggeri();
    
    @Override
    public String toString(){
        return "NumPasseggeri: "+this.numPasseggeri+"\tStazza: "+this.stazza+"\tNome: "+this.nome;}
    
}
