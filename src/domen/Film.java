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
public class Film {
    private int filmID;
    private String naziv;
    private int godina;
    private String zemljaPorekla;
    private String opis;

    public Film(int filmID, String naziv, int godina, String zemljaPorekla, String opis) {
        this.filmID = filmID;
        this.naziv = naziv;
        this.godina = godina;
        this.zemljaPorekla = zemljaPorekla;
        this.opis = opis;
    }

    public Film() {
        
    }

    public int getFilmID() {
        return filmID;
    }

    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getGodina() {
        return godina;
    }

    public void setGodina(int godina) {
        this.godina = godina;
    }

    public String getZemljaPorekla() {
        return zemljaPorekla;
    }

    public void setZemljaPorekla(String zemljaPorekla) {
        this.zemljaPorekla = zemljaPorekla;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    @Override
    public String toString() {
        return ("Naziv: "+naziv+", Godina: "+godina);
    }

    
}
