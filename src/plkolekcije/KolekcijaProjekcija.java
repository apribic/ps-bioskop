/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plkolekcije;

import domen.Projekcija;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Priba
 */
public class KolekcijaProjekcija {
    
    List<Projekcija> listaProjekcija;
    
    public KolekcijaProjekcija() {
        listaProjekcija = new ArrayList<>();
    }
    
    public void sacuvajProjekciju(Projekcija p){
        listaProjekcija.add(p);
    }
    
    public List vratiListuProjekcija(){
        return listaProjekcija;
    }
    
}
