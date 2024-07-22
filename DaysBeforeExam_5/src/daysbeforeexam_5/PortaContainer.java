package daysbeforeexam_5;

/**
 *
 * @author giuse
 */
public class PortaContainer extends Imbarcazione{
    private int numContainer;
    
    public PortaContainer(int numPasseggeri, int stazza, String nome, int numContainer){
        super(numPasseggeri, stazza, nome);
        this.numContainer = numContainer;
    }
    
    public int getNumContainer(){return this.numContainer;}
    
    @Override
    public int notificaPasseggeri(){return this.numContainer*2 + this.getNumPasseggeri();}
    
    @Override
    public String toString(){
    return super.toString()+"\tNum container: "+this.numContainer;}
    
}
