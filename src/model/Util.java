/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import domen.Film;
import domen.MestaURedu;
import domen.Sala;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Priba
 */
public class Util {
    //kolekcija sala
    public static List<Sala> listaSala;                
    public static List vratiListuSala(){
        
        if (listaSala.isEmpty()) {
            listaSala = new ArrayList<>();
        listaSala.add(new Sala(0, "Jugoslovenska Kinoteka", "Kosovska 11"));
        listaSala.add(new Sala(1, "Muzej kinoteke", "Uzun Mirkova 1"));
        }
        
        return listaSala;       
    }
    
    //kolekcija mestaURedovima
    public static List<MestaURedu> listaMestaURedu;
    public static List vratiListuMestaURedu(){
                
        if(listaMestaURedu.isEmpty()){
            listaMestaURedu = new ArrayList<>();
            for (int i = 1; i < 11; i++) {
                listaMestaURedu.add(new MestaURedu(i, 10, listaSala.get(0)));
                listaMestaURedu.add(new MestaURedu(i, 10, listaSala.get(1)));
            }
        }
        return listaMestaURedu;
    }
        
    //kolekcija Filmova

    public static List<Film> listaFilmova;
    public static List vratiListuFilmova(){
                
        if(listaFilmova.isEmpty()){
            listaFilmova = new ArrayList<>();
            listaFilmova.add(new Film(0, "Matrix", 1999, "USA", "Opis filma Matrix"));
            listaFilmova.add(new Film(1, "Matrix Reloaded", 2003, "USA", "Opis filma Matrix Reloaded"));
            listaFilmova.add(new Film(2, "Matrix Revolutions", 2003, "USA", "Opis filma Matrix Revolutions"));
            listaFilmova.add(new Film(3, "Star Wars", 1977, "USA", "Opis filma Star Wars"));
            listaFilmova.add(new Film(4, "The Empire Strikes Back", 1980, "USA", "Opis filma The Empire Strikes Back"));
            listaFilmova.add(new Film(5, "Return of the Jedi", 1983, "USA", "Opis filma Return of the Jedi"));
            
        }
        return listaFilmova;
    }
        
        
    
    
}
