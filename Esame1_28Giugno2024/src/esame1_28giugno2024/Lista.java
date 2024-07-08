package esame1_28giugno2024;

/**
 *
 * @author giuse
 */
public class Lista {
    public class Nodo{
        private VeicoloAutonomo data;
        private Nodo next;
        
        public Nodo(VeicoloAutonomo elem){
            this.data=elem;
            this.next=null;
        }
    }
    Nodo testa;
    
    public Lista(){this.testa=null;}
    
    public boolean isEmpty(){return this.testa==null;}
   
    public void push(VeicoloAutonomo v){
        Nodo q = new Nodo(v);
        q.next=testa;
        testa = q;
    }
    
    public void insert(VeicoloAutonomo v){
        if(isEmpty() || testa.data.compareTo(v)>0){
            push(v);}else{
            Nodo temp = testa;
            Nodo q = new Nodo(v);
            while(temp.next!=null && temp.next.data.compareTo(v)<0){
                temp = temp.next;
            }
            q.next=temp.next;
            temp.next=q;
        }
    }
    
    public VeicoloAutonomo pop(){
        VeicoloAutonomo v = testa.data;
        testa = testa.next;
        return v;
    }
    
    public void elimina(VeicoloAutonomo v){
        if(isEmpty()){
            System.out.println("Lista vuota");
        }

        if(testa.data.equals(v)){
            
            pop();}else{
            
            Nodo temp = testa;
            while(temp.next!=null && !temp.next.data.equals(v)){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        
        
    }
    /*Il metodo kmMediPerTipoVeicolo restituisce la media dei km percorsi dai veicoli della
stessa tipologia, calcolata come il rapporto tra la somma dei km percorsi da una tipologia di
veicoli e il numero di veicoli di quella tipologia presenti nella flotta. Lo studente gestisca
opportunamente le situazioni in cui nella flotta non siano presenti veicoli di una o di entrambe le
tipologie*/
    
    public void kmMediPerVeicolo(){
        int numAutomobili=0;
        int numDroni=0;
        int kmPercorsiAutomobili=0;
        int kmPercorsiDroni=0;
        int mediaAutomobili=0;
        int mediaDroni=0;
        
        Nodo temp = testa;
        while(temp.next!=null){
            if(temp.data instanceof Automobile){
                numAutomobili++;
                kmPercorsiAutomobili = kmPercorsiAutomobili +temp.data.getKmPercorsi();
            }
            
             if(temp.data instanceof Drone){
                numDroni++;
                kmPercorsiDroni = kmPercorsiDroni+ temp.data.getKmPercorsi();
            }
             
             
             temp = temp.next;   
        }
        mediaAutomobili = kmPercorsiAutomobili / numAutomobili;
        mediaDroni = kmPercorsiDroni / numDroni;
        
        System.out.println("Km medi per automobili: "+mediaAutomobili+"\tDroni: "+mediaDroni);       
    }
    
    public void print(){
        Nodo temp = testa;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    //Utilizzo append come supporto per inserisciConOrdine
    public void append(VeicoloAutonomo v){
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
    
    /*Il metodo inserisciConOrdine riceve in ingressi un veicolo autonomo. Il veicolo viene
inserito in ultima posizione e vengono spostati, dalla lista, e inseriti dopo di esso tutti i veicoli
che sono strettamente minori secondo l’ordine naturale. Nella pagina successiva è riportato un
esempio di funzionamento del metodo*/
    
    public void inserisciConOrdine(VeicoloAutonomo v){
        System.out.println("\nLista iniziale: ");
        print();
        
        Lista lista2 = new Lista(); //Creo la nuova lista da dare in output
        lista2.append(v);           //Inserisco in coda l'elemento che mi viene passato nel metodo
        System.out.println("\nInseriamo il veicolo:\n"+v.toString());
        
        Nodo temp = testa;
        while(temp!=null){
            if(temp.data.compareTo(v)<0){ 
                 lista2.append(temp.data);
                 temp = temp.next;
            }else{
                lista2.push(temp.data);
                temp = temp.next;
            }
                            
            
        }
        System.out.println("\nLista dopo la chiamata del metodo: ");
        lista2.print();
        
    }
        
    
}
