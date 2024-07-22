package daysbeforeexam_3;
import java.util.Scanner;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.nio.file.Paths;
/**
 *
 * @author giuse
 */
public class Flotta {
    public static void main(String[] args){
        Lista lista = leggiDaFile("Elementi.txt");
        //lista.print();
        //lista.kmMediPerTipoVeicolo();
        Drone elem = new Drone(40,30,"DroneProva",300);
        Automobile elem2 = new Automobile(120,30,"AutoProva",300);
        lista.inserisciConOrdine(elem);
        System.out.println("\n\nLista attuale: ");
        lista.print();
        System.out.println("\n\n"+elem.equals(elem2));
        System.out.println(elem.equals(elem));
        
        /*
        lista.inserisciConOrdine(elem2);
        System.out.println("\n\nLista attuale: ");
        lista.print();
        System.out.println("\n\n"+elem);
        elem.increase(20);
        System.out.println(elem);*/
        
        
    }
    
    public static Lista leggiDaFile(String file){
        Lista lista = new Lista();
        
        try{
            Scanner input = new Scanner(Paths.get(file));
            int numElem = input.nextInt();
            
            for(int i=0; i<numElem; i++){
                String className;
                className = input.next();
                
                if(className.equals("VeicoloAutonomo.Automobile")){
                    Automobile elem = new Automobile(input.nextInt(), input.nextInt(),input.next(), input.nextInt());
                    lista.insert(elem);
                }
                
                if(className.equals("VeicoloAutonomo.Drone")){
                    Drone elem = new Drone(input.nextInt(), input.nextInt(),input.next(), input.nextInt());
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
