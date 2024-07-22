package daysbeforeexam_4;

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
    public void tune(int value) throws EccezioneTune{
        if(value==0){
        throw new EccezioneTune("Non è consentito value = 0.");}
        
        this.audioQuality = audioQuality + value;
    }
    
    @Override
    public String toString(){
    return super.toString()+"\tAudio quality: "+this.audioQuality;}
    
}
