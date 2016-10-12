/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plkontroler;

import plkolekcije.KolekcijaClan;
import domen.Clan;
import java.util.List;

/**
 *
 * @author Priba
 */
public class Kontroler {
    
    private KolekcijaClan kc;
    
    //singleton pattern
    private static Kontroler instanca;
    
    public static Kontroler vratiInstancu() {
        if (instanca == null) {
            instanca = new Kontroler();
        }
        return instanca;
    }
    
    private Kontroler(){
        kc = new KolekcijaClan();
    }
    
    public void sacuvajClana(Clan cl) {
        kc.sacuvajClana(cl);
    }
    
    public List<Clan> vratiListuClanova() {
        return kc.vratiListuClanova();
    } 
}
