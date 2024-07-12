package esame2_14giugno2024;

/**
 *
 * @author giuse
 */
public class Image extends Multimedia{
    private int xPixel;
    private int yPixel;
    
    public Image(String fileName, char resolution, boolean raw, int x, int y){
        super(fileName,resolution,raw);
        this.xPixel=x;
        this.yPixel=y;
    }
    @Override
    public void resize(int percentage)throws IllegalArgumentException{
        if(percentage<=0 || percentage>=100){
            throw new IllegalArgumentException("Percentuale non consentita");
        }
        this.xPixel = this.xPixel - (percentage*xPixel)/100;
        this.yPixel = this.yPixel - (percentage*yPixel)/100;
    }
    
    @Override
    public String toString(){
        return super.toString()+"\txPixel: "+this.xPixel+"\tyPixel: "+this.yPixel;}
    
    
}
