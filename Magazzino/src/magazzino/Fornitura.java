/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magazzino;

/**
 *
 * @author Gianni
 */
public class Fornitura implements Runnable{
    private int quantita;
    private double tempo;
    private Fornitore fornitore;
    private Magazzino magazzino;
    
    public Fornitura(int quantita, double tempo, Fornitore fornitore, Magazzino magazzino)
    {
        this.fornitore=fornitore;
        this.magazzino=magazzino;
        this.quantita=quantita;
        this.tempo=tempo;
    }

    public int getQuantita() {
        return quantita;
    }

    public double getTempo() {
        return tempo;
    }

    public Fornitore getFornitore() {
        return fornitore;
    }

    public Magazzino getMagazzino() {
        return magazzino;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public void setFornitore(Fornitore fornitore) {
        this.fornitore = fornitore;
    }

    public void setMagazzino(Magazzino magazzino) {
        this.magazzino = magazzino;
    }
    
    @Override
    public void run()
    {
        for (int i=0; i<10; i++)
        {
          magazzino.portaMateriale(quantita, i);  
        }
        
    }
}
