package esame1_28giugno2024;

import java.util.Scanner;
import java.util.NoSuchElementException;
import java.io.IOException;
import java.nio.file.Paths;
public class Flotta {
    public static void main(String[] args){
        Lista lista1 = leggiDaFile("Flotta.txt");
        lista1.print();

        /*Automobile auto90 = new Automobile(180,40,"auto90",100);
        Automobile auto91 = new Automobile(16,30,"auto91",100);
        Drone drone90 = new Drone(42,40,"drone90",100);
        Drone drone91 = new Drone(185,30,"drone91",100);
        lista1.insert(auto90);
        lista1.insert(auto91);
        lista1.insert(drone90);
        lista1.insert(drone91);
        System.out.println("\nStampa post inserimento");
        lista1.print();

        System.out.println("\nStampa post eliminazione auto90 e drone91");
        lista1.elimina(auto90);
        lista1.elimina(drone91);
        lista1.print();
        lista1.kmMediPerVeicolo();
        /*System.out.println("a1.equals(a2)"+a1.equals(a2));
        System.out.println("a2.equals(a2)"+a2.equals(a2));
        
        
        System.out.println("d1.equals(d2)"+d1.equals(d2));
        System.out.println("d1.equals(d1)"+d1.equals(d1));*/
        
        Drone droneProva = new Drone(8,20,"DroneProva",50);
        lista1.inserisciConOrdine(droneProva);
        
    }
    
    public static Lista leggiDaFile(String pathFile){
                    Lista lista = new Lista();
        try{

            Scanner input = new Scanner(Paths.get("Flotta.txt"));
            int numElem = input.nextInt();
            
            for(int i=0; i<numElem;i++){
                String className;
                className = input.next();
                
                if(className.equals("VeicoloAutonomo.Automobile")){
                    Automobile a = new Automobile(input.nextInt(), input.nextInt(), input.next(), input.nextInt());
                    lista.insert(a);
                }
                
                if(className.equals("VeicoloAutonomo.Drone")){
                     Drone d = new Drone(input.nextInt(), input.nextInt(), input.next(), input.nextInt());
                    lista.insert(d);
                }
            }
            
            input.close();
            

        }catch(IOException | NoSuchElementException e){
            e.printStackTrace();
        }
        return lista;
    }
    
}
