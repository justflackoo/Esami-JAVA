package daysbeforeexam_2;
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.io.IOException;
import java.nio.file.Paths;

/**
 *
 * @author giuse
 */
public class Galleria {
    
    public static void main(String[] args){
        Lista lista1 = leggiDaFile("Elementi.txt");
        /*lista1.print();
        System.out.println("\nStampa post saveSpace");
        lista1.saveSpace();
        lista1.print();*/
        /*lista1.removeLow();
        System.out.println("\nStampa post removeLow");
        lista1.print();*/
        
        /*Video v1 = new Video("Video100",'H',true,500);
        Video v2 = new Video("Video200",'E',false,380);
        
        System.out.println(v1.equals(v2));
        System.out.println(v1.equals(v1));
        
        v1.resize(100);
        System.out.println(v1);
        v1.resize(50);
        System.out.println(v1);*/
        
        Image img1 = new Image("Image100", 'E', false, 400, 400);
        Image img2 = new Image("Image200", 'H', false, 500, 400);
        
        System.out.println(img1.equals(img2));
        System.out.println(img1.equals(img1));
        
        //img1.resize(100);
        System.out.println(img1);
        img1.resize(50);
        System.out.println(img1);
        
        
    }
    
    public static Lista leggiDaFile(String file){
        Lista lista = new Lista();
        
        try{
            Scanner input = new Scanner(Paths.get(file));
            int numElem = input.nextInt();
        
            for(int i=0; i<numElem; i++){
                String className;
                className = input.next();
                
                if(className.equals("Multimedia.Video")){
                    Video elem = new Video(input.next(), input.next().charAt(0),input.nextBoolean(), input.nextInt());
                    lista.push(elem);
                }
                
                if(className.equals("Multimedia.Image")){
                    Image elem = new Image(input.next(), input.next().charAt(0),input.nextBoolean(), input.nextInt(), input.nextInt());
                    lista.push(elem);
                }
            }
            input.close();
        }catch(IOException | NoSuchElementException e){
            System.out.println(e.getMessage());
    }
        return lista;
    }
    
}
