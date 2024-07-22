
package daysbeforeexam_4;

import java.util.Comparator;

/**
 *
 * @author giuse
 */
public class ConfrontaPerNome implements Comparator<Canale>{
    
    @Override
    public int compare(Canale c1, Canale c2){
        String x1 = c1.getNomeCanale();
        String x2 = c2.getNomeCanale();
        return x1.compareTo(x2);
    }
    
}
