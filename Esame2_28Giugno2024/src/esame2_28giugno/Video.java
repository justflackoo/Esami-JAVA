package esame2_28giugno;

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
    public void tune(int value)throws IllegalArgumentException{
        if(value==0){
            throw new IllegalArgumentException("Non è consentito utilizzare 0 come argomento");
        }else{ 
            videoQuality = videoQuality * value;
        }
        
    }
    
    @Override
    public String toString(){
        return super.toString()+"\tVideoQuality: "+this.videoQuality+"\tResolution: "+this.resolution;
    }
    
}
