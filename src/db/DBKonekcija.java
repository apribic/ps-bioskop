/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import domen.Film;
import domen.Sala;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Util;

/**
 *
 * @author Priba
 */
public class DBKonekcija {

        
    public List vratiListuSala(){
        
        List<Sala> listaSala = new ArrayList<>();
        
        try {
            //probaj da ucitas ovaj driver. Korisno za rad sa razlicitim bazama
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("DB driver je ucitan!");
            String url = Util.url;
            String password = Util.password;
            String username = Util.username;
            //uspostavi konekciju
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Konekcija je uspostavljena!");
            
            String upit = "SELECT * FROM sala";
            //pripremi upit i izvrsi
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(upit);
            //rs je 
            while (rs.next()) {
                int salaID = rs.getInt("SalaID");
                String nazivSale = rs.getString("NazivSale");
                String adresa = rs.getString("Adresa");
                Sala sl = new Sala(salaID, nazivSale, adresa);
                listaSala.add(sl);
            }
            //obavezno zatvaraj konekciju
            s.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
//        if (listaSala == null) {
//            listaSala = new ArrayList<>();
//        listaSala.add(new Sala(0, "Jugoslovenska Kinoteka", "Kosovska 11"));
//        listaSala.add(new Sala(1, "Muzej kinoteke", "Uzun Mirkova 1"));
//        }
        
        return listaSala;       
    }

    public List<Film> vratiListuFilmova() {
        
        List<Film> listaFilmova = new ArrayList<>();
        
        try {
            ucitajDriver();
            Connection connection = uspostaviKonekciju();            
            String upit = ("SELECT * FROM FILM");
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(upit);
            
            while (rs.next()){
                int filmID = rs.getInt("filmID");
                String naziv = rs.getString("naziv");
                String zemlja = rs.getString("zemljaPorekla");
                int godina = rs.getInt("godina");
                String opis = rs.getString("opis");
                listaFilmova.add(new Film(filmID, naziv, godina, zemlja, opis));
            }
            
            s.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listaFilmova;   
    }

    public void dodajFilm(String nazivFilma, int godina, String zemlja, String opis) throws Exception {
        Connection connection = null;
        try {
            
            ucitajDriver();
            connection = uspostaviKonekciju();
            connection.setAutoCommit(false);
            String upit = "INSERT INTO film VALUES (?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(upit);
            ps.setInt(1, 0);
            ps.setString(2, nazivFilma);
            ps.setInt(3, godina);
            ps.setString(4, zemlja);
            ps.setString(5, opis);            
            ps.executeUpdate();
            connection.commit();
            ps.close();
            connection.close();
            System.out.println("Upit je izvrsen");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver ne postoji: " + ex.getMessage());
            throw new Exception("Driver ne postoji"); 
        } catch (SQLException sqlEx) {
            if (connection != null) {
                connection.rollback();
                connection.close();
            }
            System.out.println("Konekcija nije uspostavljena " + sqlEx.getMessage());
            throw new Exception("Greska u konekciji!");
        }            
        
    }

    private void ucitajDriver() throws Exception {
        
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver je ucitan");
        
        
    }
    
    private Connection uspostaviKonekciju() throws Exception {
        
        String url = Util.url;
        String password = Util.password;
        String user = Util.username;        
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("Uspesno konektovan na bazu!");
        return connection;
    }
    
}
