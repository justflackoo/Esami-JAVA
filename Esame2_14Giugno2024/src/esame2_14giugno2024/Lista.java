package esame2_14giugno2024;

import java.util.ArrayList;

/**
 *
 * @author giuse
 */
public class Lista {
    public class Nodo{
        private Multimedia data;
        private Nodo next;
        
        public Nodo(Multimedia elem){
            this.data=elem;
            this.next=null;
        }
        

    }
    
   Nodo testa;
   public Lista(){this.testa=null;}
   
   public boolean isEmpty(){return this.testa==null;}
   
   //La lista inserisce sempre in prima posizione
   public void push(Multimedia m){
       Nodo q = new Nodo(m);
       q.next=testa;
       testa=q;
   }
   
   public Multimedia pop(){
       Multimedia m = testa.data;
       testa = testa.next;
       return m;
   }
   
   
   public void elimina(Multimedia m){
       if(testa.data.equals(m)){
           pop();
       }else{
           Nodo temp = testa;
           while(temp.next!=null && !temp.next.data.equals(m)){
               temp = temp.next;
           }
           
           temp.next=temp.next.next;
           
       }
   }
   
    public void print(){
       Nodo temp = testa;
       while(temp!=null){
           System.out.println(temp.data);
           temp = temp.next;
       }
   }
   
    /*Il metodo saveSpace riduce del 50% tutti i file multimediali di tipo video che hanno alta qualità.*/
   public void saveSpace(){
       Nodo temp = testa;
       while(temp!=null){
           if(temp.data instanceof Video && temp.data.checkQuality()){
               temp.data.resize(50);
           }
           temp = temp.next;
       }
       System.out.println("\nLista post saveSpace: ");
       print();
   }
   
   /*Il metodo removeLow rimuove dalla lista le prime due immagini e gli ultimi due video di
bassa qualità. Nel caso in cui sia presente un solo video o una sola immagine a bassa
qualità il metodo cancella solo questi file multimediali*/
   
   public void removeLow(){
       int immaginiEliminate=0;
       int videoDaEliminare=0;
       Nodo temp = testa;
       
       
       while(temp!=null){
           if(temp.data instanceof Image && !temp.data.checkQuality() && immaginiEliminate<2){
               elimina(temp.data);
               immaginiEliminate++;
           }
           
           if(temp.data instanceof Video && !temp.data.checkQuality()){
               videoDaEliminare++;
           }
           
           temp = temp.next;
       }
       
       temp = testa;
       while(temp!=null){
           if(temp.data instanceof Video && !temp.data.checkQuality()){
               videoDaEliminare--;
               if(videoDaEliminare < 2 ){
                   elimina(temp.data);
               }
           }
           temp = temp.next;
   }
   }
   
   
   
    
}
