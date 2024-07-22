package daysbeforeexam_1;

/**
 *
 * @author giuse
 */
public class Lista {
    
    public class Nodo{
        private Vulnerability data;
        private Nodo next;
        
        public Nodo(Vulnerability elem){
            this.data = elem;
            this.next = null;
        }
    }
       Nodo testa;
       
public Lista(){this.testa = null;}
       
public boolean isEmpty(){return this.testa == null;}
    
public void push(Vulnerability v){
    Nodo q = new Nodo(v);
    q.next = testa;
    testa = q;
}

public void append(Vulnerability v){
    if(isEmpty()){
        push(v);}else{
        
        Nodo q = new Nodo(v);
        Nodo temp = testa;
        
        while(temp.next!=null){
            temp = temp.next;
        }
        
        temp.next = q;
    }
}

public Vulnerability pop(){
    Vulnerability v = testa.data;
    testa = testa.next;
    return v;
}

public void rimuovi(Vulnerability v){
    if(isEmpty()){System.out.println("Lista vuota");}
    
    if(testa.data.equals(v)){pop();}
        
        Nodo temp = testa;
      
        while(temp.next != null && !temp.next.data.equals(v)){
            temp = temp.next;
        }
        
        temp.next = temp.next.next;
}

public void print(){
    Nodo temp = testa;
    while(temp!=null){
        System.out.println(temp.data);
        temp = temp.next;
}
}


public void numberExploitable(){
    int SWV = 0;
    int HWV = 0;

    Nodo temp = testa;
    while(temp != null){
        if(temp.data instanceof HWVulnerability && temp.data.checkExploitable()){
            HWV++;
        }
        
        if(temp.data instanceof SWVulnerability && temp.data.checkExploitable()){
            SWV++;
        }
        
        temp = temp.next;
    }
    System.out.println("\n\nNumero di vulnerabilità exploitable\nSW: "+SWV+", HW: "+HWV);
}
       
 public void removeNotExploitable(){
     System.out.println("Lista iniziale: ");
     print();
     Nodo temp = testa;
     
     while(temp.next!=null){
         if(!temp.data.checkExploitable()){
             rimuovi(temp.data);
         }
         temp = temp.next;
     }
     System.out.println("\nLista aggiornata: ");
     print();
     
 }
    
}
