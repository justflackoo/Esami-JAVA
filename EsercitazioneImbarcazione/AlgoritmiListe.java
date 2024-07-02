package esercitazioneimbarcazione;

/**
 *
 * @author giuse
 */
public class ListaOrdinata {
    public class Nodo{
        private Imbarcazione data;
        public Nodo next;
        
        public Nodo(Imbarcazione elem){
            this.data=elem;
            this.next=null;
        }
    }
    Nodo testa;
    public ListaOrdinata(){this.testa=null;}
    public boolean isEmpty(){return this.testa==null;}
    public boolean isFull(){return false;}
    
    public void push(Imbarcazione i){
        Nodo q = new Nodo(i);
        q.next=testa;
        testa=q;
    }
    
    public void append(Imbarcazione i){
        if(isEmpty()){
            push(i);
        }else{
            Nodo temp = testa;
            Nodo q = new Nodo(i);
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next=q;
        }
    }
    
    public void insertCompareTo(Imbarcazione i){
        if(isEmpty() || testa.data.compareTo(i)>0){
            push(i);
        }else{
            Nodo temp = testa;
            Nodo q = new Nodo(i);
            while(temp.next!=null && temp.next.data.compareTo(i)<0){
                temp = temp.next;
        }
            q.next=temp.next;
            temp.next=q;
    }
    }
    
    public void insert(Imbarcazione i){
        if(isEmpty() || testa.data.getStazza()>i.getStazza()){
            push(i);
        }
        
        Nodo temp = testa;
        Nodo q = new Nodo(i);
        while(temp.next!=null && temp.next.data.getStazza()<i.getStazza()){
            temp = temp.next;
        }
        q.next=temp.next;
        temp.next=q;
    }
    
    public Imbarcazione pop(){
        Imbarcazione i = testa.data;
        testa = testa.next;
        return i;
    }
    
    public Imbarcazione pop_back(){
        if(testa.next==null){
            return pop();
        }else{
            Nodo temp = testa;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            Imbarcazione i = temp.next.data;
            temp.next=null;
            return i;
        }
    }
    
    public void elimina(Imbarcazione i){
        if(isEmpty()){
            System.out.println("Lista vuota");
        }
            Nodo temp = testa;
            while(!temp.next.data.equals(i)){
                temp = temp.next;
            }
            temp.next=temp.next.next;
        
    }
    
    public Imbarcazione top(){
        Imbarcazione i = testa.data;
        return i;
    }
    
    public Imbarcazione top_back(){
        if(testa.next==null){
            return top();
        }else{
            Nodo temp = testa;
            while(temp.next.next!=null){
                temp = temp.next;
        }
            Imbarcazione i=temp.next.data;
            return i;
    }
    }
    
    public boolean inLista(Imbarcazione i){
        boolean trovato = false;
        Nodo temp = testa;
        while(temp!=null && !trovato){
            if(temp.data.equals(i)){
               trovato = true; 
            }else{
            temp = temp.next;
            }
        }
        return trovato;
    }
    
    public Imbarcazione ricercaMax(){
        Imbarcazione max = testa.data;
        Nodo temp = testa;
        while(temp.next!=null){
            if(temp.data.getStazza()>=max.getStazza()){
                max = temp.data;
            }
            temp = temp.next;
        }
        return max;
    }
    
    public Imbarcazione ricercaMin(){
        Imbarcazione min = testa.data;
        Nodo temp = testa;
        while(temp.next!=null){
            if(temp.data.getStazza()<=min.getStazza()){
                min = temp.data;
            }
            temp = temp.next;
        }
        return min;
    }
    
    public void stampa(){
        Nodo temp = testa;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    } 
    
    /* PER TIPI PRIMITIVI   
    public boolean isOrdered () {
        boolean ordinato = true;
        Nodo temp = testa;
        
        if (temp == null) return true;
        
        if (temp.next == null) return true;
        
        if (temp.next.next == null) {
            return temp.data<=temp.next.data;
        }
        
        while (ordinato && temp.next!=null) {
            if (temp.data>temp.next.data) {
                ordinato = false;
            } else {
                temp = temp.next;
            }
        }
        return ordinato;
    }
*/
    
    
    }
