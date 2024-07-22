package daysbeforeexam_4;
import java.util.ArrayList;
/**
 *
 * @author giuse
 */
public class Lista {
    public class Nodo{
        private Canale data;
        private Nodo next;
        
        public Nodo(Canale elem){
            this.data = elem;
            this.next = null;
        }
    }
    
    Nodo testa;
    public Lista(){this.testa = null;}
    public boolean isEmpty(){return this.testa == null;}
    
    public void push(Canale c){
        Nodo q = new Nodo(c);
        q.next = testa;
        testa = q;
    }
    
    public void insert(Canale c){
        if(isEmpty() || testa.data.compareTo(c)>0){
        push(c);}else{
            Nodo temp = testa;
            Nodo q = new Nodo(c);
            while(temp.next!=null && temp.next.data.compareTo(c)<0){
                temp = temp.next;
            }
            q.next = temp.next;
            temp.next = q;
        }
    }
    
    public void append(Canale c){
        if(isEmpty()){push(c);}else{
            Nodo temp = testa;
            Nodo q = new Nodo(c);
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = q;
        }
    }
    
    public Canale pop(){
        Canale c = testa.data;
        testa = testa.next;
        return c;
    }
    
    public void rimuovi(Canale c){
        if(isEmpty()){System.out.println("Lista vuota");}
        
        if(testa.data.equals(c)){pop();}else{
            Nodo temp = testa;
            while(temp.next!=null && !temp.next.data.equals(c)){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }
    
    public void print(){
        Nodo temp = testa;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    /*Il metodo modificaLista modifica l’ordine naturale della lista in modo tale che nella lista si
vengano a creare due blocchi logici. Il primo blocco che contiene solo i segnali video. Il
secondo blocco con soli segnali audio. Nella pagina successiva è riportato un esempio di
funzionamento del metodo*/
    
    public void modificaLista(){
        System.out.println("Lista iniziale");
        print();       
        ArrayList<Canale> elenco = new ArrayList<>();
        
        Nodo temp = testa;
        while(temp.next!=null){
            elenco.add(temp.data);
            temp = temp.next;
            rimuovi(temp.data);
            
        }
        
        for(int i=0; i<elenco.size();i++){
            if(elenco.get(i) instanceof Video){
                push(elenco.get(i));
            }         
            if(elenco.get(i) instanceof Audio){
                append(elenco.get(i));
            }
        }
        
        System.out.println("\nRiordinamento");
        print();
        
    }
    
    public void canaliRipetuti(){
        ArrayList<Canale> visti = new ArrayList<>();
        ArrayList<Canale> ripetuti = new ArrayList<>();
        
        Nodo temp = testa;
        while(temp!=null){
            if(!visti.contains(temp.data)){
                visti.add(temp.data);
            }else{
                ripetuti.add(temp.data);
            }
            temp = temp.next;
        }
        
        /*for(int i=0; i<visti.size(); i++){
            if(ripetuti.contains(visti.get(i))){
                System.out.println(visti.get(i));
                for(int j=0; j<ripetuti.size();j++){
                    if(ripetuti.get(j).equals(visti.get(i))){
                        System.out.println(ripetuti.get(j));
                    }
                }
            }
        }*/
        
        for(int i=0; i<visti.size();i++){
            if(ripetuti.contains(visti.get(i))){
                System.out.println(visti.get(i));
                for(int j=0; j<ripetuti.size(); j++){
                    if(ripetuti.get(j).equals(visti.get(i))){
                        System.out.println(ripetuti.get(j));
                    }
                }
            }
        }
        
    }
 
    
}
