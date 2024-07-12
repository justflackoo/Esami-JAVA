package esame2_14giugno2024;

/**
 *
 * @author giuse
 */
public abstract class Multimedia implements Resizable{
    private String name;
    private char resolution;
    private boolean raw;
    
    public Multimedia(String name, char resolution, boolean raw){
        this.name = new String(name);
        this.resolution=resolution;
        this.raw=raw;
    }
    
    @Override
    public boolean checkQuality(){
    return (this.resolution=='H' || this.resolution=='E') && this.raw == true;}
    
    
    @Override
    public boolean equals(Object obj){
        if(this==obj){return true;}
        if(obj==null){return false;}
        if(this.getClass()!= obj.getClass()){return false;}
        
        final Multimedia elem = (Multimedia) obj;
        return this.name == elem.name;
    }
    
    @Override
    public String toString(){
        return "Name: "+this.name+"\tResolution: "+this.resolution+"\tRaw: "+this.raw;}
    
}
