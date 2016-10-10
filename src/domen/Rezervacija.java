/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author Priba
 */
public class Rezervacija {
    private int rezervacijaID;
    private Date datumOtvaranja;
    private String stanje;
    private Clan clan;
    private Projekcija projekcija;

    public Rezervacija(int rezervacijaID, Date datumOtvaranja, String stanje, Clan clan, Projekcija projekcija) {
        this.rezervacijaID = rezervacijaID;
        this.datumOtvaranja = datumOtvaranja;
        this.stanje = stanje;
        this.clan = clan;
        this.projekcija = projekcija;
    }

    public int getRezervacijaID() {
        return rezervacijaID;
    }

    public void setRezervacijaID(int rezervacijaID) {
        this.rezervacijaID = rezervacijaID;
    }

    public Date getDatumOtvaranja() {
        return datumOtvaranja;
    }

    public void setDatumOtvaranja(Date datumOtvaranja) {
        this.datumOtvaranja = datumOtvaranja;
    }

    public String getStanje() {
        return stanje;
    }

    public void setStanje(String stanje) {
        this.stanje = stanje;
    }

    public Clan getClan() {
        return clan;
    }

    public void setClan(Clan clan) {
        this.clan = clan;
    }

    public Projekcija getProjekcija() {
        return projekcija;
    }

    public void setProjekcija(Projekcija projekcija) {
        this.projekcija = projekcija;
    }
    
    
    
}
