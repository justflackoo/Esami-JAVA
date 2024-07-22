package daysbeforeexam_3;

import java.util.ArrayList;

/**
 *
 * @author giuse
 */
public class Lista {
    public class Nodo{
        private VeicoloAutonomo data;
        private Nodo next;
        
        public Nodo(VeicoloAutonomo elem){
            this.data = elem;
            this.next = null;
        }
    }
    
    Nodo testa;
    
    public Lista(){this.testa = null;}
    public boolean isEmpty(){return this.testa == null;}
    
    public void push(VeicoloAutonomo v){
        Nodo q = new Nodo(v);
        q.next = testa;
        testa = q;
    }
    public void append(VeicoloAutonomo v){
        if(isEmpty()){
        push(v);}else{
            Nodo temp = testa;
            Nodo q = new Nodo(v);
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = q;
        }
    }
    
    public void insert(VeicoloAutonomo v){
        if(isEmpty() || testa.data.compareTo(v)>0){
        push(v);}else{
            Nodo temp = testa;
            Nodo q = new Nodo(v);
            while(temp.next!=null && temp.next.data.compareTo(v)<0){
                temp = temp.next;
            }
            q.next = temp.next;
            temp.next = q;
        }
    }
    
    public VeicoloAutonomo pop(){
        VeicoloAutonomo v = testa.data;
        testa = testa.next;
        return v;
    }
    
    public void rimuovi(VeicoloAutonomo v){
        if(isEmpty()){System.out.println("Lista vuota");}
        if(testa.data.equals(v)){
        pop();}else{
            Nodo temp = testa;
            while(temp.next!=null && temp.next.data.equals(v)){
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
    
    public void kmMediPerTipoVeicolo(){
        int numAuto=0;
        int numDroni=0;
        int kmAuto=0;
        int kmDroni=0;
        int kmMediAuto = 0;
        int kmMediDroni = 0;
        
        Nodo temp = testa;
        
        while(temp!=null){
            if(temp.data instanceof Automobile){
                numAuto++;
                kmAuto = kmAuto + temp.data.getKMPercorsi();
            }
            if(temp.data instanceof Drone){
                numDroni++;
                kmDroni = kmDroni + temp.data.getKMPercorsi();
            }
            temp = temp.next;
        }
        kmMediAuto = kmAuto/numAuto;
        kmMediDroni = kmDroni/numDroni;
        
        System.out.println("\nKM MEDI auto: "+kmMediAuto+"\t droni: "+kmMediDroni);
    }
    
    /*Il metodo inserisciConOrdine riceve in ingressi un veicolo autonomo. Il veicolo viene
inserito in ultima posizione e vengono spostati, dalla lista, e inseriti dopo di esso tutti i veicoli
che sono strettamente minori secondo l’ordine naturale. Nella pagina successiva è riportato un
esempio di funzionamento del metodo.*/
    
    public void inserisciConOrdine(VeicoloAutonomo v){
        System.out.println("Lista iniziale");
        print();
        ArrayList<VeicoloAutonomo>elenco = new ArrayList<>();
        
        System.out.println("\n\nInseriamo il veicolo:\n"+v);
        
        Nodo temp = testa;
        while(temp!=null){
            elenco.add(temp.data);
            rimuovi(temp.data);
            temp = temp.next;
        }
        append(v);
       for(int i=0; i<elenco.size();i++){
           if(elenco.get(i).compareTo(v)<0){
               append(elenco.get(i));
           }else{
               push(elenco.get(i));              
           }
       }
        System.out.println("\nLista dopo la chiamata del metodo inserisciConOrdine()");
        print();
    }
}
