package daysbeforeexam_2;

/**
 *
 * @author giuse
 */
public class Lista {
    public class Nodo{
        private Multimedia data;
        private Nodo next;
        
        public Nodo(Multimedia elem){
            this.data = elem;
            this.next = null;
    }
       
    }
    
    Nodo testa;
    
    public Lista(){this.testa = null;}
    
    public boolean isEmpty(){return this.testa == null;}
    
    public void push(Multimedia m){
        Nodo q = new Nodo(m);
        q.next = testa;
        testa = q;
    }
    
    public Multimedia pop(){
        Multimedia m = testa.data;
        testa = testa.next;
        return m;
    }
    
    public void rimuovi(Multimedia m){
        if(isEmpty()){System.out.println("Lista vuota");}
        if(testa.data.equals(m)){
            pop();}else{
            Nodo temp = testa;
            while(temp.next != null && !temp.next.data.equals(m)){
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
        
    public void saveSpace(){
        Nodo temp = testa;
        while(temp!=null){
            if(temp.data instanceof Video && temp.data.checkQuality()){
            temp.data.resize(50);}
            temp = temp.next;
        }
    }
    
    
    public void removeLow(){
        int immaginiEliminate = 0;
        int videoDaEliminare = 0;
        
        Nodo temp = testa;
        
        while(temp.next!=null){
            if(temp.data instanceof Image && !temp.data.checkQuality() && immaginiEliminate<2){
                immaginiEliminate++;
                rimuovi(temp.data);
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
                if(videoDaEliminare < 2){
                    rimuovi(temp.data);
            }
        }
                            temp = temp.next;
    }     
    }
       
}
