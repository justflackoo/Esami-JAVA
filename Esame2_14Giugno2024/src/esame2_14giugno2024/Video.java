package esame2_14giugno2024;

/**
 *
 * @author giuse
 */
public class Video extends Multimedia{
    private int numFrames;
    
    public Video(String fileName, char Resolution, boolean raw, int numFrames){
        super(fileName,Resolution,raw);
        this.numFrames=numFrames;
    }
    
    @Override
    public void resize(int percentage)throws IllegalArgumentException{
        if(percentage<=0 || percentage>=100){
            throw new IllegalArgumentException("Percentuale non consentita");
        }
        this.numFrames = this.numFrames - (percentage*numFrames)/100;
    }
    
    @Override
    public String toString(){
       return super.toString()+"\tnumFrames: "+this.numFrames;
    }
    
}
