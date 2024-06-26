package esercitazioneimbarcazione;

/**
 *
 * @author giuse
 */
public class ListaOrdinata {
    public class Nodo{
        private Imbarcazione data;
        private Nodo next;
        
        public Nodo(Imbarcazione elem){
            this.data = elem;
            this.next=null;
        }
    }
    Nodo testa;
    public ListaOrdinata(){this.testa = null;}
    
    public boolean isEmpty(){return this.testa==null;}
    public boolean isFull(){return false;}
    
    //Inserimento in testa
    public void push(Imbarcazione i){
        Nodo q = new Nodo(i);
        q.next = testa;
        testa = q;
    }

    //Inserimento in coda
    public void append(Imbarcazione i){
        if(isEmpty()){push(i);
        }else{
            Nodo temp = testa;
            Nodo q = new Nodo(i);
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = q;
        }
    }

    //Inserimento secondo l'ordine definito dal compareTo
    public void insert(Imbarcazione i ){
        if(isEmpty() || testa.data.compareTo(i)>0){
            push(i);
        }else{
            Nodo q = new Nodo(i);
            Nodo temp = testa;
            while(temp.next!=null && temp.next.data.compareTo(i)<0){
                temp = temp.next;
            }
            q.next=temp.next;
            temp.next = q;
        }
    }

    //Rimuovi in testa
    public Imbarcazione pop(){
        Imbarcazione imb = testa.data;
        testa = testa.next;
        return imb;
    }

    //Rimuovi in coda
    public Imbarcazione pop_back(){
        if(testa.next==null){return pop();
        }else{
            Nodo temp = testa;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            Imbarcazione imb = temp.next.data;
            temp.next = null;
            return imb;
        }
    }

    //Rimuovi prima occorrenza
    public void delete(Imbarcazione imb){
        if(isEmpty()){System.out.println("Lista vuota");}
        
        Nodo temp = testa;
        while(!temp.next.data.equals(imb)){
            temp = temp.next;
        }
        if(temp.next==null){System.out.println("Elemento non trovato");}
        temp.next = temp.next.next;
    }

    //Ricerca di un elemento
    public boolean inLista(Imbarcazione imb){
        boolean trovato = false;
        Nodo temp = testa;
        while(temp!=null && !trovato){
            if(temp.data.equals(imb)){
                trovato = true;
            }else{
                temp = temp.next;
            }
        }
        return trovato;
    }

    //Ricerca del massimo 
    public Imbarcazione ricercaMassimo(){
        Imbarcazione max = testa.data;
        Nodo temp = testa;
        while(temp.next!=null){
            if(temp.data.getNumPasseggeri()>=max.getNumPasseggeri()){
                max = temp.data;
            }
                temp = temp.next;
            
        }
        return max;
    }

    //Ricerca del minimo
    public Imbarcazione ricercaMinimo(){
        Imbarcazione min = testa.data;
        Nodo temp = testa;
        while(temp.next!=null){
            if(temp.data.getNumPasseggeri()<=min.getNumPasseggeri()){
                min = temp.data;
            }
            temp = temp.next;
        }
        return min;
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
