/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magazzino;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gianni
 */
public class Magazzino {

    private String nome;
    private int quantita;
    
    public Magazzino(String nome, int quantita)
    {
        this.nome = nome;
        this.quantita = quantita;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }
    
    public synchronized void  portaMateriale(int quantitaPo,int  i)
    {
        this.setQuantita(this.getQuantita()+quantitaPo);
        System.out.println(Thread.currentThread().getName()+" Sono il thread "+i+" ho consegnato: "+quantitaPo);
        notifyAll();
    }
    
    public synchronized void prendiMateriale(int quantitaPr,int  i)
    {
        while (this.quantita<quantitaPr)
        {
            try {
                System.out.println(Thread.currentThread().getName()+ " "+i+"sto aspettando!");
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Magazzino.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        
        this.setQuantita(this.getQuantita()-quantitaPr);
        System.out.println(Thread.currentThread().getName()+" Sono il thread "+i+" ho comperato: "+quantitaPr);
            
    }
}
