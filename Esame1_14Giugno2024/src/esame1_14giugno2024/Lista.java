
package esame1_14giugno2024;

/**
 *
 * @author giuse
 */
public class Lista {
        public class Nodo{
            private Vulnerability data;
            private Nodo next;
            
            public Nodo(Vulnerability elem){
                this.data=elem;
                this.next=null;
            }
        }
        
   Nodo testa;
   
   public Lista(){this.testa=null;}
   
   public boolean isEmpty(){return this.testa==null;}
   
   public void print(){
       Nodo temp = testa;
       while(temp!=null){
           System.out.println(temp.data);
           temp = temp.next;
       }
   }
   
   public void push(Vulnerability v){
       Nodo q = new Nodo(v);
       q.next=testa;
       testa=q;
   }
   
   public void append(Vulnerability v){
       if(isEmpty()){
           push(v);
       }else{
           Nodo temp = testa;
           Nodo q = new Nodo(v);
           while(temp.next!=null){
               temp = temp.next;
           }
           temp.next=q;
       }
   }
  
   public Vulnerability pop(){
       Vulnerability v =testa.data;
       testa = testa.next;
       return v;
   }
   
   public void delete(Vulnerability v){
       if(testa.data.equals(v)){pop();
       }else{
           Nodo temp = testa;
           
           while(temp.next!=null && !temp.next.data.equals(v)){
               temp = temp.next;
           }
           temp.next=temp.next.next;
       }
   }
   
   /*Il metodo numberExploitable restituisce il numero di vulnerabilità SW e il numero di
vulnerabilità HW che sono exploitable.*/
   
   public void numberExploitable(){
       int SW=0;
       int HW=0;
       Nodo temp = testa;
       while(temp!=null){
           if(temp.data instanceof SWVulnerability && temp.data.checkExploitable()){
           SW++;}
           if(temp.data instanceof HWVulnerability && temp.data.checkExploitable()){
           HW++;}
           temp = temp.next;
       }
       System.out.println("Numero di vulnerabilità Software exploitable: "+SW+"\tNumero di vulnerabilità Hardware exploitable: "+HW);
   }
   
   /*Il metodo removeNotExploitable rimuove dalla lista tutte le vulnerabilità che non sono
exploitable. Di fatto dopo l’esecuzione del metodo, nella lista devono essere presenti solo
vulnerabilità exploitable*/
   
   public void removeNotExploitable(){
       Nodo temp = testa;
       while(temp!=null){
           if(!temp.data.checkExploitable()){
              delete(temp.data);
           }
           temp = temp.next;
       }
       
       System.out.println("\n\nLista aggiornata: ");
       print();
   }
 
}
