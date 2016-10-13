/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Priba
 */
public class Projekcija {
    private int projekcijaID;
    private int cenaKarte;
    private Date datumiVreme;
    private Film film;
    private Sala sala;

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Projekcija(int projekcijaID, int cenaKarte, Date datumiVreme, Film film, Sala sala) {
        this.projekcijaID = projekcijaID;
        this.cenaKarte = cenaKarte;
        this.datumiVreme = datumiVreme;
        this.film = film;
        this.sala = sala;
    }



    public int getProjekcijaID() {
        return projekcijaID;
    }

    public void setProjekcijaID(int projekcijaID) {
        this.projekcijaID = projekcijaID;
    }

    public int getCenaKarte() {
        return cenaKarte;
    }

    public void setCenaKarte(int cenaKarte) {
        this.cenaKarte = cenaKarte;
    }

    public Date getDatumiVreme() {
        return datumiVreme;
    }

    public void setDatumiVreme(Date datumiVreme) {
        this.datumiVreme = datumiVreme;
    }

    @Override
    public String toString() {
        return ("Film: "+film.toString()+", Datum i vreme: "+ new SimpleDateFormat("dd.MM.yyyy. 'u' HH:mm").format(datumiVreme)+", Cena karte: "+cenaKarte); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
