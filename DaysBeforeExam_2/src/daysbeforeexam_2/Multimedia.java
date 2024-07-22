package daysbeforeexam_2;

/**
 *
 * @author giuse
 */
public abstract class Multimedia implements Resizable{
    private String fileName;
    private char resolution;
    private boolean raw;
    
    public Multimedia(String fileName, char resolution, boolean raw){
        this.fileName = new String(fileName);
        this.resolution = resolution;
        this.raw = raw;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this==obj){return true;}
        if(obj==null){return false;}
        if(this.getClass()!=obj.getClass()){return false;}
        
        final Multimedia elem = (Multimedia) obj;
        
        return this.fileName.equals(elem.fileName);
    }
    
    @Override
    public boolean checkQuality(){
    return (this.resolution == 'E' || this.resolution == 'H') && this.raw == true;}
    
    
    @Override
    public String toString(){
    return "FileName: "+this.fileName+"\tResolution: "+this.resolution+"\tRaw: "+this.raw;}
}
