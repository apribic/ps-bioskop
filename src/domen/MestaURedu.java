/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

/**
 *
 * @author Priba
 */
public class MestaURedu {
    private int rbRed;
    private int brojMesta;
    private Sala sala;

    public MestaURedu(int rbRed, int brojMesta, Sala sala) {
        this.rbRed = rbRed;
        this.brojMesta = brojMesta;
        this.sala = sala;
    }

    public int getRbRed() {
        return rbRed;
    }

    public void setRbRed(int rbRed) {
        this.rbRed = rbRed;
    }

    public int getBrojMesta() {
        return brojMesta;
    }

    public void setBrojMesta(int brojMesta) {
        this.brojMesta = brojMesta;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    
}
