package daysbeforeexam_4;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
/**
 *
 * @author giuse
 */
public class Sintonizzatore {
    
    public static void main(String[] args){
        Lista lista = leggiDaFile("Elementi.txt");
        //lista.print();
        
        
        /*lista.modificaLista();
        System.out.println("\n\nCanali ripetuti");
        lista.canaliRipetuti();*/
        
        Audio elem = new Audio(15,"AudioProvaX",100);
        Audio elem2 = new Audio(15,"AudioProvaZ",100);
        
        
        
        ConfrontaPerNome cn = new ConfrontaPerNome();
        //System.out.println(cn.compare(elem, elem2));
        
    }
    
    public static Lista leggiDaFile(String file){
        Lista lista = new Lista();
        try{
            Scanner input = new Scanner(Paths.get(file));
            int numElem = input.nextInt();
            
            for(int i=0; i<numElem; i++){
                String className;
                className = input.next();
                
                if(className.equals("Canale.Audio")){
                    Audio elem = new Audio(input.nextInt(), input.next(), input.nextInt());
                    lista.insert(elem);
                }
                
                if(className.equals("Canale.Video")){
                    Video elem = new Video(input.nextInt(), input.next(), input.nextInt(), input.nextInt());
                    lista.insert(elem);
                }
            }
            input.close();
        }catch(IOException | NoSuchElementException e){
            System.out.println(e.getMessage());
        }
        return lista;
    }
}
