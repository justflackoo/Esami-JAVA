package esame2_28giugno;
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
            this.next=null;
        }
    }
    Nodo testa;
    
    public Lista(){this.testa = null;}
    
    public boolean isEmpty(){return this.testa==null;}
    
    public void push(Canale c){
        Nodo q = new Nodo(c);
        q.next = testa;
        testa = q;
    }
    
    public void append(Canale c){
        if(isEmpty()){
            push(c);
        }else{
            Nodo temp = testa;
            Nodo q = new Nodo(c);
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = q;
        }
    }
    
    public void insert(Canale c){
        if(isEmpty() || testa.data.compareTo(c)>0){
            push(c);
        }else{
            Nodo temp = testa;
            Nodo q = new Nodo(c);
            while(temp.next!=null && temp.next.data.compareTo(c)<0){
                temp = temp.next;
            }
            q.next = temp.next;
            temp.next=q;
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
funzionamento del metodo.*/
    
    public void modificaLista(){
        System.out.println("Lista iniziale");
        print();
        
        Lista nuovaLista = new Lista();
        
        Nodo temp = testa;
        
        while(temp.next!=null){
            if(temp.data instanceof Video){
                nuovaLista.push(temp.data);
            }
            if(temp.data instanceof Audio){
                nuovaLista.append(temp.data);
            }
            temp = temp.next;
        }
        System.out.println("\n\nRiordinamento");
        nuovaLista.print();
    }
    
    /*Il metodo canaliRipetuti mostra a video i canali che sono ripetuti nella lista
    Funziona un po' male*/
    
    public void canaliRipetuti(){
        System.out.println("Lista iniziale");
        print();
        ArrayList<Canale> canaliRipetuti = new ArrayList<>();
        
        Nodo temp = testa;
        while(temp.next!=null){
            if(temp.data.compareTo(temp.next.data)==0){
                canaliRipetuti.add(temp.data);
                canaliRipetuti.add(temp.next.data);                
            }
            temp = temp.next;           
        }
        
        System.out.println("\n\nCanali ripetuti");
        for(Canale c : canaliRipetuti){
            System.out.println(c);
        }
        
    }
    
}
