package esame2_28giugno;
import java.io.IOException;
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.nio.file.Paths;

/**
 *
 * @author giuse
 */
public class Sintonizzatore {
    public static void main (String[] args){
        String file1 = "Canale.txt";
        Lista lista1 = leggiDaFile(file1);
        //lista1.print();
        //lista1.modificaLista();
        //lista1.canaliRipetuti();
        Audio a1 = new Audio(10,"Audio90",100);
        Audio a2 = new Audio(11, "Audio91",120);
        Video v1 = new Video (10,"Video90",100,80);
        Video v2 = new Video (19,"Video91",20,30);
        
        /*System.out.println(a1);
        a1.tune(10);
        System.out.println(a1);*/
        
        /*System.out.println(v1);
        v1.tune(4);
        System.out.println(v1);
        System.out.println(a1.compareTo(a1));
        System.out.println(a1.compareTo(a2));
        System.out.println(a1.compareTo(v1));
        System.out.println(a1.compareTo(v2));*/
        
        
        
    }
    
    public static Lista leggiDaFile(String pathFile){
        Lista lista = new Lista();
        
        try{
            Scanner input = new Scanner(Paths.get(pathFile));
            int numElem = input.nextInt();
            System.out.println("Elementi presenti nella lista: "+numElem);
            
            for(int i=0; i<numElem; i++){
                String className;
                className = input.next();
                
                if(className.equals("Canale.Audio")){
                    Audio audio = new Audio(input.nextInt(), input.next(), input.nextInt());
                    lista.insert(audio);
                }
                
                if(className.equals("Canale.Video")){
                    Video video = new Video(input.nextInt(), input.next(), input.nextInt(), input.nextInt());
                    lista.insert(video);
                }    
            }
                  input.close();
        }catch(IOException | NoSuchElementException e){  
            System.out.println(e.getMessage());       
    }
            return lista;
    }
}
