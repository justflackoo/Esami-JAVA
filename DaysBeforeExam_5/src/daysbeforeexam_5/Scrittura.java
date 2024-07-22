package daysbeforeexam_5;

import java.io.IOException;
import java.io.PrintStream;
import java.io.FileOutputStream;

/**
 *
 * @author giuse
 */
public class Scrittura {
    
    public static void main(String[] args){
        Traghetto elem = new Traghetto(100,80,"Traghetto1",90);
        Traghetto elem2 = new Traghetto(100,85,"Traghetto2",90);
        Traghetto elem3 = new Traghetto(100,20,"Traghetto3",90);
        Traghetto elem4 = new Traghetto(100,40,"Traghetto3",90);
        
        PortaContainer elem5 = new PortaContainer(90,50,"PortaContainer1",85);
        PortaContainer elem6 = new PortaContainer(90,74,"PortaContainer2",85);
        PortaContainer elem7 = new PortaContainer(90,80,"PortaContainer3",85);
        PortaContainer elem8 = new PortaContainer(90,210,"PortaContainer4",85);
        
        Lista lista = new Lista();
        
        lista.insert(elem);
        lista.insert(elem2);
        lista.insert(elem3);
        lista.insert(elem4);
        lista.insert(elem5);
        lista.insert(elem6);
        lista.insert(elem7);
        lista.insert(elem8);
        
        try{
            PrintStream fileOutput = new PrintStream(new FileOutputStream("STAMPA.txt"));
            PrintStream console = System.out;
            System.setOut(fileOutput);
            lista.print();
            System.out.close();
            System.setOut(console);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
