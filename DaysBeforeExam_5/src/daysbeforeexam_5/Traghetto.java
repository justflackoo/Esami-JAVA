package daysbeforeexam_5;

/**
 *
 * @author giuse
 */
public class Traghetto extends Imbarcazione{
    private int numAutomobili;
    
    public Traghetto(int numPasseggeri, int stazza, String nome, int numAutomobili){
        super(numPasseggeri, stazza, nome);
        this.numAutomobili = numAutomobili;
    }
    
    @Override
    public int notificaPasseggeri(){return this.numAutomobili + this.getNumPasseggeri();}
    
    @Override
    public String toString(){
    return super.toString()+"\tNum automobili: "+this.numAutomobili;}
    
}
