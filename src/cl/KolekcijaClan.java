/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl;

import domen.Clan;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Priba
 */
public class KolekcijaClan {
    
    List<Clan> listaClanova;
    
    public KolekcijaClan() {
        listaClanova = new ArrayList<>();
    }
    
    public void sacuvajClana(Clan cl) {
        listaClanova.add(cl);
    }
    
    public List<Clan> vratiListuClanova(){
        return listaClanova;
    }
}
