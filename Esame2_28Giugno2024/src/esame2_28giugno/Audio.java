package esame2_28giugno;

/**
 *
 * @author giuse
 */
public class Audio extends Canale{
    private int audioQuality;
    
    public Audio(int frequenza, String nomeCanale, int audioQuality){
        super(frequenza, nomeCanale);
        this.audioQuality = audioQuality;
    }
    
    @Override
    public void tune(int value) throws IllegalArgumentException{
        if(value==0){
            throw new IllegalArgumentException("Non è consentito utilizzare 0 come argomento");
        }else{
            this.audioQuality = this.audioQuality + value;
        }
    }
    
    @Override
    public String toString(){
        return super.toString()+"\tAudioQuality: "+this.audioQuality;
    }
    
}
