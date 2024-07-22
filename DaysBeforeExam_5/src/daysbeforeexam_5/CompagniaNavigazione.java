package daysbeforeexam_5;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.NoSuchElementException;
/**
 *
 * @author giuse
 */
public class CompagniaNavigazione {
    
    public static void main(String[] args){
        Lista lista = leggiDaFile("Elementi.txt");
        lista.print();
        //lista.imbarcazioniAffollate();
       // System.out.println("\n\n");
        //lista.numeroContainerInNavigazione();
        
        lista.popBack();
        System.out.println("\n\n");
        lista.print();
        
    }
    
    public static Lista leggiDaFile(String file){
        Lista lista = new Lista();
        
        try{
            Scanner input = new Scanner(Paths.get(file));
            int numElem = input.nextInt();
            
            for(int i=0; i<numElem; i++){
                String className;
                className = input.next();
                
                if(className.equals("Imbarcazione.PortaContainer")){
                    PortaContainer elem = new PortaContainer(input.nextInt(), input.nextInt(), input.next(), input.nextInt());
                    lista.insert(elem);
                }
                
                if(className.equals("Imbarcazione.Traghetto")){
                    Traghetto elem = new Traghetto(input.nextInt(), input.nextInt(), input.next(), input.nextInt());
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
