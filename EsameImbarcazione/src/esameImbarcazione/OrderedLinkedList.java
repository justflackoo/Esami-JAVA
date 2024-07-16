package esameImbarcazione;

import java.util.ArrayList;

/**
 *
 * @author giuse
 */
public class OrderedLinkedList {
    public class Nodo{
        private Imbarcazione data;
        private Nodo next;
        
        public Nodo(Imbarcazione elem){
            this.data = elem;
            this.next=null;
        }
    }
    Nodo testa;
    
    public OrderedLinkedList(){this.testa=null;}
    
    public boolean isEmpty(){return this.testa==null;}
    
    public void push(Imbarcazione i){
        Nodo q = new Nodo(i);
        q.next = testa;
        testa = q;
    }
    
    public void insert(Imbarcazione i){
        if(isEmpty() || testa.data.compareTo(i)>0){
            push(i);}else{
            Nodo temp = testa;
            Nodo q = new Nodo(i);
            
            while(temp.next!=null && temp.next.data.compareTo(i)<0){
                temp = temp.next;
            }
            q.next=temp.next;
            temp.next=q;
        }
    }
    
    public Imbarcazione pop(){
        Imbarcazione i = testa.data;
        testa = testa.next;
        return i;
    }
    
    public void delete(Imbarcazione i){
        if(isEmpty() || testa.data.equals(i)){
            pop();
        }else{
            Nodo temp = testa;
            while(temp.next!=null && !temp.next.data.equals(i)){
                temp = temp.next;
            }
            if(temp.next==null){
            System.out.println("Elemento da eliminare non trovato");
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
    
    public Imbarcazione ricercaMax(){
        Nodo temp = testa;
        Imbarcazione max = testa.data;
        while(temp.next!=null){
            if(temp.data.getNumPasseggeri()>max.getNumPasseggeri()){
                max = temp.data;
            }
            temp = temp.next;
        }
        return max;
    }
    
    public void imbarcazioniAffollate(){
        Imbarcazione max = ricercaMax();
        ArrayList<Imbarcazione> elenco = new ArrayList<>();
        
        Nodo temp = testa;
        while(temp!=null){
            if(temp.data.getNumPasseggeri()==max.getNumPasseggeri()){
                elenco.add(temp.data);
            }
            temp = temp.next;
        }
        System.out.println("\nImbarcazioni affollate: ");
        for(Imbarcazione e: elenco){
            System.out.println(e);
        }
    }
    
    public void numeroContainerInNavigazione(){
        int totContainer=0;
        Nodo temp = testa;
        while(temp!=null){
            if(temp.data instanceof PortaContainer){
                PortaContainer pc = (PortaContainer)temp.data;
                totContainer = totContainer + pc.getNumContainer();        
            }
            temp = temp.next;
        }
        
        System.out.println("Totale container in navigazione: "+totContainer);
    }
    
}
