package esameImbarcazione;
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.io.IOException;
import java.nio.file.Paths;

/**
 *
 * @author giuse
 */
public class CompagniaNavigazione {
    public static void main(String[] args){
        String file1 = "Elementi.txt";
        OrderedLinkedList lista1 = loadFromFile(file1);
        lista1.print();
        lista1.imbarcazioniAffollate();
        //lista1.numeroContainerInNavigazione();
        //System.out.println(lista1.ricercaMax().getNumPasseggeri());
        Traghetto t1 = new Traghetto(100,10,"Traghetto90",120);
        Traghetto t2 = new Traghetto(110,10,"Traghetto91",12);
        System.out.println(t1.equals(t1));
        System.out.println(t1.equals(t2));

    }
    
    public static OrderedLinkedList loadFromFile(String pathFile){
        OrderedLinkedList lista = new OrderedLinkedList();
        
        try{
            Scanner input = new Scanner(Paths.get(pathFile));
            int numElementi = input.nextInt();
            
            System.out.println("Elementi nella lista: "+numElementi);
            
            for(int i=0; i<numElementi; i++){
                String className;
                className = input.next();
                
                if(className.equals("Imbarcazione.Traghetto")){
                    Traghetto traghetto = new Traghetto(input.nextInt(), input.nextInt(), input.next(), input.nextInt());
                    lista.insert(traghetto);                  
                }              
                if(className.equals("Imbarcazione.PortaContainer")){
                    PortaContainer portaContainer = new PortaContainer(input.nextInt(), input.nextInt(), input.next(), input.nextInt());
                    lista.insert(portaContainer);                    
                }
                
            }
            input.close();
            
        }catch(IOException | NoSuchElementException e){
            System.out.println(e.getMessage());
        }
        return lista;
    }
    
}
