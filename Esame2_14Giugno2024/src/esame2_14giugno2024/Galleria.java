package esame2_14giugno2024;
import java.util.Scanner;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.io.IOException;

/**
 *
 * @author giuse
 */
public class Galleria {
    
    public static void main(String[] args){
        String file1 = "Galleria.txt";
        Lista lista = leggiDaFile(file1);
        lista.print();
        //lista.saveSpace();
        lista.removeLow();
        System.out.println("\n\nLista aggiornata: ");
        lista.print();
    }
    
    public static Lista leggiDaFile(String filePath){
        Lista lista = new Lista();    
        try{
            Scanner input = new Scanner(Paths.get(filePath));
            int numElem = input.nextInt();
            System.out.println("Ci sono "+numElem+" elementi nella lista");
            for(int i=0; i<numElem;i++){
                String className;
                className = input.next();
                if(className.equals("Multimedia.Video")){       
                Video video = new Video(input.next(), input.next().charAt(0),input.nextBoolean(), input.nextInt());
                lista.push(video);}
                
                if(className.equals("Multimedia.Image")){
                Image image = new Image(input.next(), input.next().charAt(0),input.nextBoolean(), input.nextInt(), input.nextInt());
                lista.push(image);}
                
            }
            
            input.close();
            
        }catch(IOException | NoSuchElementException e){
            e.printStackTrace();
        }
        return lista;
    }
    
}
