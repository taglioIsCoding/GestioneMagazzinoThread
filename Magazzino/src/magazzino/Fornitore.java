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
public class Fornitore {
    
    private String pIva;
    private String nome;
    
    public Fornitore(String pIva, String nome)
    {
        this.nome=nome;
        this.pIva=pIva;
    }

    public String getpIva() {
        return pIva;
    }

    public String getNome() {
        return nome;
    }

    public void setpIva(String pIva) {
        this.pIva = pIva;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
