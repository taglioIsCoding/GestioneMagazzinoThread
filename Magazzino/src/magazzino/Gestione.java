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
public class Gestione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Magazzino F = new Magazzino("Fresh Farm", 0);
        
        Fornitore burton = new Fornitore("assdfghjkl", "burton");
        Fornitura R = new Fornitura(20, 5, burton, F);
        
        Cliente io = new Cliente("michele");
        Vende S = new Vende (10, 10, io, F);
        
        Thread tr = new Thread(R);
        Thread ts = new Thread(S);
        
        tr.start();
        ts.start();
    }
    
}
