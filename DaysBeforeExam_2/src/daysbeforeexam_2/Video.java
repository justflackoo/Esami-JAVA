package daysbeforeexam_2;

/**
 *
 * @author giuse
 */
public class Video extends Multimedia{
    private int numFrames;
    
    public Video(String fileName, char resolution, boolean raw, int numFrames){
        super(fileName, resolution, raw);
        this.numFrames = numFrames;
    }
    
    @Override
    public void resize(int percentage) throws IllegalArgumentException{
        if(percentage<=0 || percentage>=100){
        throw new IllegalArgumentException("Percentuale non consentita");}
        
        this.numFrames = this.numFrames - (this.numFrames*percentage)/100;
    }
    
    @Override
    public String toString(){
    return super.toString() +"\tNumFrames: "+this.numFrames;}
}
