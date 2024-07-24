package CopiaCarattere_BuffRead;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author giuse
 */
public class CopiaCarattere {
    public static void main(String[] args){
        try{
            FileReader filein = new FileReader("Dati.txt");
            FileWriter fileout = new FileWriter("Copia.txt");
            int next = filein.read();
            
            while(next!=-1){
                System.out.printf("%c",next);
                fileout.write((char)next);
                next = filein.read();
            }
            filein.close();
            fileout.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
    }
}
