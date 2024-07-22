package daysbeforeexam_4;

import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 *
 * @author giuse
 */
public class Scrittura {
    
    public static void main(String[] args){
        
        Audio elem = new Audio(14,"AudioProvaX",100);
        Audio elem2 = new Audio(15,"AudioProvaY",100);
        Audio elem3 = new Audio(18,"AudioProvaZ",100);
        
        Video elem4 = new Video(19,"VideoProvaX",100,12);
        Video elem5 = new Video(21,"VideoProvaY",100,12);
        Video elem6 = new Video(16,"VideoProvaZ",100,12);
        
        Lista lista = new Lista();
        
        lista.insert(elem);
        lista.insert(elem2);
        lista.insert(elem3);
        lista.insert(elem4);
        lista.insert(elem5);
        lista.insert(elem6);
        
        
        try{
            PrintStream fileOutput = new PrintStream(new FileOutputStream("Testing.txt"));
            PrintStream console = System.out;
            System.setOut(fileOutput);
            lista.print();
            System.setOut(console);
            System.out.close();
            
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        
    }
    
}
