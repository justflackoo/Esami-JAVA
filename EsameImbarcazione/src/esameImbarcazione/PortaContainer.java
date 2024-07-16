package esameImbarcazione;

/**
 *
 * @author giuse
 */
public class PortaContainer extends Imbarcazione{
    private int numContainer;
    
    public PortaContainer(int numPass, int stazza, String nome, int numContainer){
        super(numPass, stazza, nome);
        this.numContainer = numContainer;
    }
    public int getNumContainer(){return this.numContainer;}
    @Override
    public int notificaPasseggeri(){
        return this.getNumPasseggeri()+(numContainer*2);}
    
    @Override
    public String toString(){
    return super.toString()+"\tNumContainer: "+this.numContainer;}
    
    
}
