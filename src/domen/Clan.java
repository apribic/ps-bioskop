/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domen;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Priba
 */
public class Clan {
    private int clanID;
    private String ime;
    private String prezime;
    private String jmbg;
    private String email;
    private Date datumUclanjenja;
    
    public Clan () {
    
    }
    
    //public static ArrayList<Clan> clanovi = new ArrayList<>();
    
    public Clan(int clanID, String ime, String prezime, String jmbg, String email, Date datumUclanjenja) {
        
        
        
        this.clanID = clanID;
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.email = email;
        this.datumUclanjenja = datumUclanjenja;
        
        System.out.println("Uspesno dodat clan: "+this.toString());
                
    }
    
    
    
    /**
     * @return the clanID
     */
    public int getClanID() {
        return clanID;
    }

    /**
     * @param clanID the clanID to set
     */
    public void setClanID(int clanID) {
        this.clanID = clanID;
    }

    /**
     * @return the ime
     */
    public String getIme() {
        return ime;
    }

    /**
     * @param ime the ime to set
     */
    public void setIme(String ime) {
        this.ime = ime;
    }

    /**
     * @return the prezime
     */
    public String getPrezime() {
        return prezime;
    }

    /**
     * @param prezime the prezime to set
     */
    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    /**
     * @return the jmbg
     */
    public String getJmbg() {
        return jmbg;
    }

    /**
     * @param jmbg the jmbg to set
     */
    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the datumUclanjenja
     */
    public Date getDatumUclanjenja() {
        return datumUclanjenja;
    }

    /**
     * @param datumUclanjenja the datumUclanjenja to set
     */
    public void setDatumUclanjenja(Date datumUclanjenja) {
        this.datumUclanjenja = datumUclanjenja;
    }

    @Override
    public String toString() {
        return (clanID+ime+prezime+email+jmbg+datumUclanjenja); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
