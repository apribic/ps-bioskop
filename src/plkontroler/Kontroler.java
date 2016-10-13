/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plkontroler;

import plkolekcije.KolekcijaClan;
import domen.Clan;
import domen.Projekcija;
import domen.Rezervacija;
import java.util.List;
import plkolekcije.KolekcijaProjekcija;
import plkolekcije.KolekcijaRezervacija;

/**
 *
 * @author Priba
 */
public class Kontroler {
    
    private KolekcijaClan kc;
    private KolekcijaProjekcija kp;
    private KolekcijaRezervacija kr;
    
    //singleton
    private static Kontroler instanca;
    
    public static Kontroler vratiInstancu() {
        if (instanca == null) {
            instanca = new Kontroler();
        }
        return instanca;
    }
    
    private Kontroler(){
        kc = new KolekcijaClan();
        kp = new KolekcijaProjekcija();
        kr = new KolekcijaRezervacija();
    }
    
    public void sacuvajClana(Clan cl) {
        kc.sacuvajClana(cl);
    }
    
    public List<Clan> vratiListuClanova() {
        return kc.vratiListuClanova();
    }
    
    public void sacuvajProjekciju(Projekcija p) {
        kp.sacuvajProjekciju(p);
    }
    
    public List<Projekcija> vratiListuProjekcija() {
        return kp.vratiListuProjekcija();
    }
    
    public void sacuvajRezervaciju(Rezervacija r) {
        kr.sacuvajRezervaciju(r);
    }
    
    public List<Rezervacija> vratiListuRezervacija() {
        return kr.vratiListuRezervacija();
    } 
}
