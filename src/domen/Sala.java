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
public class Sala {
    private int salaID;
    private String nazivSale;
    private String adresa;

    public Sala(int salaID, String nazivSale, String adresa) {
        this.salaID = salaID;
        this.nazivSale = nazivSale;
        this.adresa = adresa;
    }

    public int getSalaID() {
        return salaID;
    }

    public void setSalaID(int salaID) {
        this.salaID = salaID;
    }

    public String getNazivSale() {
        return nazivSale;
    }

    public void setNazivSale(String nazivSale) {
        this.nazivSale = nazivSale;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    @Override
    public String toString() {
        return (nazivSale); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
