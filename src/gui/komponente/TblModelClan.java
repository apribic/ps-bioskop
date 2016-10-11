/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.komponente;

import domen.Clan;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Priba
 */
public class TblModelClan extends AbstractTableModel{
    
    List<Clan> lcl;
    
    public TblModelClan(List<Clan> lcl) {
        this.lcl = lcl;
    }
    
    @Override
    public int getRowCount() {
        if(lcl == null) return 0;
        return lcl.size(); 
    }

    @Override
    public int getColumnCount() {
        return 6;   
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Clan cl = lcl.get(rowIndex);
        
        switch(columnIndex){
            case 0: return cl.getClanID();
            case 1: return cl.getIme();
            case 2: return cl.getPrezime();
            case 3: return cl.getEmail();
            case 4: return cl.getJmbg();
            case 5: return new SimpleDateFormat("dd.MM.yyyy.").format(cl.getDatumUclanjenja());
            default: return "n/a";
        }
    }

    @Override
    public String getColumnName(int column) {
        
        switch(column) {
            case 0: return "ClanID";
            case 1: return "Ime";
            case 2: return "Prezime";
            case 3: return "Email";
            case 4: return "jmbg";
            case 5: return "Datum";
            default: return "n/a";
        }
        
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if(columnIndex == 0 || columnIndex == 5) return false;
        return true;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        //Ako je selektovana 2. kolona
        if (columnIndex == 1) {
            //Nadji objekat sa indeksom rowIndex u listi lcl, i unesi mu novo ime iz aValue
            lcl.get(rowIndex).setIme(aValue.toString()); //radi i kastovanje (String)aValue
        }        
        if (columnIndex == 2) {
            lcl.get(rowIndex).setPrezime(aValue.toString());
        }
        if (columnIndex == 3) {
            lcl.get(rowIndex).setEmail(aValue.toString());
        }
        if (columnIndex == 4) {
            lcl.get(rowIndex).setJmbg(aValue.toString());
        }
        
    }
    
    
    
    
    
    
}
