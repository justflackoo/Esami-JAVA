package CopiaCarattere_BuffRead;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
/**
 *
 * @author giuse
 */
public class BuffReader {
    public static void main(String[] args){
        try(BufferedReader br = new BufferedReader(new FileReader("File.txt"))){
            String line;
            while((line = br.readLine())!=null){
                System.out.println(line);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    
}
