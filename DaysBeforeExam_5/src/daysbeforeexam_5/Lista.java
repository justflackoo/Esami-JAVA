/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daysbeforeexam_5;

import java.util.ArrayList;

/**
 *
 * @author giuse
 */
public class Lista {
    public class Nodo{
        private Imbarcazione data;
        private Nodo next;
        
        public Nodo(Imbarcazione elem){
            this.data = elem;
            this.next = null;
        }
    }
    
    Nodo testa;
    
    public Lista(){this.testa = null;}
    
    public boolean isEmpty(){return this.testa == null;}
    
    public void push(Imbarcazione i){
        Nodo q = new Nodo(i);
        q.next = testa;
        testa = q;
    }
    
    public void insert(Imbarcazione elem){
        if(isEmpty() || testa.data.compareTo(elem)>0){
        push(elem);}else{
            Nodo temp = testa;
            Nodo q = new Nodo(elem);
            while(temp.next!=null && temp.next.data.compareTo(elem)<0){
                temp = temp.next;
            }
            q.next = temp.next;
            temp.next = q;
        }
    }
    
    
    public void print(){
        Nodo temp = testa;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
    public int ricercaMax(){
        int maxNumPasseggeri = testa.data.getNumPasseggeri();
        
        Nodo temp = testa;
        while(temp!=null){
            if(temp.data.getNumPasseggeri()>=maxNumPasseggeri){
                maxNumPasseggeri = temp.data.getNumPasseggeri();
            }
            temp = temp.next;
        }
        
        return maxNumPasseggeri;
    }
    
    public void imbarcazioniAffollate(){
        int max = ricercaMax();
        
        ArrayList <Imbarcazione> elenco = new ArrayList<>();
        Nodo temp = testa;
        
        while(temp!=null){
            if(temp.data.getNumPasseggeri() == max){
                elenco.add(temp.data);
            }
            temp = temp.next;
        }
        
        System.out.println("\nEcco le imbarcazioni affollate: ");      
        for(Imbarcazione e: elenco){
            System.out.println(e);
        }
    }
    
    public void numeroContainerInNavigazione(){
        int numContainer = 0;
        Nodo temp = testa;
        
        while(temp!=null){
            if(temp.data instanceof PortaContainer){
                PortaContainer elem = (PortaContainer) temp.data;
                numContainer = numContainer + elem.getNumContainer();
            }
            temp = temp.next;
    }
        
        System.out.println("Numero totale di container in navigazione: "+numContainer);
    }
    
    public Imbarcazione pop(){
        Imbarcazione elem = testa.data;
        testa = testa.next;
        return elem;
    }
    
    
   /* public Imbarcazione popBack(){
        if(testa.next==null){
            return pop();
        }else{
            Nodo temp = testa;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            Imbarcazione elem = temp.next.data;
            temp.next = null;
            return elem;
        }
    }*/
    
    public Imbarcazione popBack(){
        if(testa.next == null){
        return pop();}else{
            Nodo temp = testa;
            while(temp.next.next != null){
                temp = temp.next;
            }
            Imbarcazione i = temp.next.data;
            temp.next = null;
            return i;
        }
    }
    
}
