/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plkolekcije;

import domen.Rezervacija;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Priba
 */
public class KolekcijaRezervacija {
    
    List<Rezervacija> listaRezervacija;
    
    public KolekcijaRezervacija() {
        listaRezervacija = new ArrayList<>();
    }
    
    public void sacuvajRezervaciju(Rezervacija r){
        listaRezervacija.add(r);
    }
    
    public List vratiListuRezervacija(){
        return listaRezervacija;
    }
}
