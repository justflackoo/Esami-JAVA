package daysbeforeexam_2;

/**
 *
 * @author giuse
 */
public class Image extends Multimedia{
    private int xPixel;
    private int yPixel;
    
    public Image(String fileName, char resolution, boolean raw, int xPixel, int yPixel){
        super(fileName, resolution, raw);
        this.xPixel = xPixel;
        this.yPixel = yPixel;
    }
    
    @Override
    public void resize(int percentage) throws IllegalArgumentException{
        if(percentage<=0 || percentage>=100){
        throw new IllegalArgumentException("Percentuale non consentita");}
        
        this.xPixel = this.xPixel - (this.xPixel*percentage)/100;
        this.yPixel = this.yPixel - (this.yPixel*percentage)/100;
    }
    
    @Override
    public String toString(){
    return super.toString()+"\txPixel: "+this.xPixel+"\tyPixel: "+this.yPixel;}
}
