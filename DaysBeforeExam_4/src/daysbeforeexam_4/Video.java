package daysbeforeexam_4;

/**
 *
 * @author giuse
 */
public class Video extends Canale{
    private int videoQuality;
    private int resolution;
    
    public Video(int frequenza, String nomeCanale, int videoQuality, int resolution){
        super(frequenza, nomeCanale);
        this.videoQuality = videoQuality;
        this.resolution = resolution;
    }
    
    @Override
    public void tune(int value)throws EccezioneTune{
        if(value==0){
        throw new EccezioneTune("Non è consentito value = 0.");}
        
        this.resolution = this.resolution*value;
    }
    
    @Override
    public String toString(){
    return super.toString()+"\tVideo quality: "+this.videoQuality+"\tResolution: "+this.resolution;}
    
}
