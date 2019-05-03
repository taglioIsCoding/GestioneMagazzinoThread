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
public class Vende implements Runnable{
    private int quantita;
    private double tempo;
    private Cliente cliente;
    private Magazzino magazzino;
    
    public Vende(int quantita, double tempo, Cliente cliente, Magazzino magazzino)
    {
        this.cliente=cliente;
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

    public Cliente getCliente() {
        return cliente;
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

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setMagazzino(Magazzino magazzino) {
        this.magazzino = magazzino;
    }
    
    @Override
    public void run()
    {
      for (int i =0 ; i<10; i++)
      magazzino.prendiMateriale(quantita, i);
    }
    
}
