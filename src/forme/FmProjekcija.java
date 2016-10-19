/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme;

import domen.Film;
import domen.Projekcija;
import domen.Sala;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import model.Util;
import plkolekcije.KolekcijaProjekcija;
import plkontroler.Kontroler;

/**
 *
 * @author Priba
 */
public class FmProjekcija extends javax.swing.JDialog {

    /**
     * Creates new form FmProjekcija
     */
    public FmProjekcija(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        popuniComboFilm();
        popuniComboSale();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jcbFilm = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtxt_NazivFilma = new javax.swing.JTextField();
        jtxt_Godine = new javax.swing.JTextField();
        jtxt_Zemlja = new javax.swing.JTextField();
        jtxt_Opis = new javax.swing.JTextField();
        jbt_dodaj = new javax.swing.JToggleButton();
        jbt_Izmeni = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jcbSala = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlblNazivSale = new javax.swing.JLabel();
        jlblAdresa = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jtxt_cena = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtxt_datum = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtxt_vreme = new javax.swing.JTextField();
        jbt_dostupnostSale = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jLabel12.setText("Cena karte:");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        jcbFilm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbFilmActionPerformed(evt);
            }
        });

        jLabel1.setText("Izaberite film (ili unesite novi)");

        jLabel2.setText("Naziv:");

        jLabel3.setText("Godina:");

        jLabel4.setText("Zemlja porekla:");

        jLabel5.setText("Opis:");

        jbt_dodaj.setText("Dodaj film");
        jbt_dodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_dodajActionPerformed(evt);
            }
        });

        jbt_Izmeni.setText("Izmeni");
        jbt_Izmeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_IzmeniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxt_Opis)
                    .addComponent(jcbFilm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxt_NazivFilma))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxt_Godine))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtxt_Zemlja))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jbt_dodaj)
                        .addGap(18, 18, 18)
                        .addComponent(jbt_Izmeni)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jbt_dodaj)
                    .addComponent(jbt_Izmeni))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbFilm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxt_NazivFilma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxt_Godine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxt_Zemlja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtxt_Opis)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        jLabel6.setText("Izaberite salu i cenu karte");

        jcbSala.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSalaActionPerformed(evt);
            }
        });

        jLabel7.setText("Naziv:");

        jLabel8.setText("Adresa:");

        jLabel13.setText("Cena:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbSala, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlblAdresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlblNazivSale, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jtxt_cena)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jlblNazivSale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jlblAdresa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jtxt_cena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.lightGray, null, null));

        jLabel9.setText("Unesite datum i vreme projekcije");

        jLabel10.setText("Datum (dd.mm.yyyy.):");

        jLabel11.setText("Vreme (hh:mm):");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxt_datum)
                            .addComponent(jtxt_vreme))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtxt_datum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtxt_vreme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbt_dostupnostSale.setText("Dostupnost sale");
        jbt_dostupnostSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbt_dostupnostSaleActionPerformed(evt);
            }
        });

        jButton2.setText("Unesi projekciju");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbt_dostupnostSale)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbt_dostupnostSale, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Popuni detalje o filmu na osnovu izabranog filma u comboboxu
    private void jcbFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbFilmActionPerformed
        //izbacuje gresku ako je combobox prazan. Izbacice gresku kad se isprazni zbog removeAllItems() u popuniComboFilm()
        if (jcbFilm.getItemCount()!=0) {
            //mora da se castuje u Film jer se u combobox--u nalazi prost Object
            Film izabraniFilm = (Film)jcbFilm.getSelectedItem();
            jtxt_NazivFilma.setText(izabraniFilm.getNaziv()); 
            jtxt_Zemlja.setText(izabraniFilm.getZemljaPorekla()); 
            jtxt_Godine.setText(Integer.toString(izabraniFilm.getGodina())); 
            jtxt_Opis.setText(izabraniFilm.getOpis()); 
        }
    }//GEN-LAST:event_jcbFilmActionPerformed
    
    //Popuni detalje o sali na osnovu izabrane sale u comboboxu
    private void jcbSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSalaActionPerformed
        if (jcbSala.getItemCount()!=0) {
            Sala izabranaSala = (Sala)jcbSala.getSelectedItem();
            jlblNazivSale.setText(izabranaSala.getNazivSale()); 
            jlblAdresa.setText(izabranaSala.getAdresa()); 
            
        }
    }//GEN-LAST:event_jcbSalaActionPerformed

    private void jbt_dostupnostSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_dostupnostSaleActionPerformed
        
        if(daLiJeSalaDostupna()){
           JOptionPane.showMessageDialog(this, "Sala je dostupna u trazenom terminu!");
        }
    }//GEN-LAST:event_jbt_dostupnostSaleActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(daLiJeSalaDostupna()) {
            unesiProjekciju();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbt_dodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_dodajActionPerformed
        dodajFilm();
    }//GEN-LAST:event_jbt_dodajActionPerformed

    private void jbt_IzmeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbt_IzmeniActionPerformed
        izmeniFilm();
    }//GEN-LAST:event_jbt_IzmeniActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FmProjekcija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmProjekcija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmProjekcija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmProjekcija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FmProjekcija dialog = new FmProjekcija(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbt_Izmeni;
    private javax.swing.JToggleButton jbt_dodaj;
    private javax.swing.JButton jbt_dostupnostSale;
    private javax.swing.JComboBox jcbFilm;
    private javax.swing.JComboBox jcbSala;
    private javax.swing.JLabel jlblAdresa;
    private javax.swing.JLabel jlblNazivSale;
    private javax.swing.JTextField jtxt_Godine;
    private javax.swing.JTextField jtxt_NazivFilma;
    private javax.swing.JTextField jtxt_Opis;
    private javax.swing.JTextField jtxt_Zemlja;
    private javax.swing.JTextField jtxt_cena;
    private javax.swing.JTextField jtxt_datum;
    private javax.swing.JTextField jtxt_vreme;
    // End of variables declaration//GEN-END:variables

    private void popuniComboFilm() {
        jcbFilm.removeAllItems();
        List<Film> listaFilmova = Kontroler.vratiInstancu().vratiListuFilmova();
        
        for(Film f : listaFilmova) {
            jcbFilm.addItem(f);
        }                
    }

    private void popuniComboSale() {
        jcbSala.removeAllItems();
        List<Sala> listaSala = Kontroler.vratiInstancu().vratiListuSala();
        
        for(Sala s : listaSala) {
            jcbSala.addItem(s);
        }     
    }

    private boolean daLiJeSalaDostupna() {
        Date datum;
        Sala sala = (Sala)jcbSala.getSelectedItem();
        List<Projekcija> listaProjekcija = Kontroler.vratiInstancu().vratiListuProjekcija();
        if(jtxt_datum.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Niste uneli datum!");
            return false;
        }
        if(jtxt_vreme.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Niste uneli vreme!");
            return false;
        }
        try {
            
            datum = vratiDatumIVreme();
            //System.out.println("Datum je: " + datumIVreme);
        } catch (ParseException pe) {
            JOptionPane.showMessageDialog(this, "Niste uneli datum ili vreme u odgovarajucem formatu!");
            return false;
        }
        
        try {
            for(Projekcija pr : listaProjekcija){
                if(pr.getDatumiVreme().equals(datum)&&pr.getSala().equals(sala)){
                    JOptionPane.showMessageDialog(this, "Sala je zauzeta u trazenom terminu!");
                    return false;
                }
            }
        } catch (Exception e) {
            System.out.println("Lista je bila prazna: e");
        }
        
        
        return true;
    }

    private void unesiProjekciju() {
        
        int prID = Kontroler.vratiInstancu().vratiListuProjekcija().size();
        
        int cena;
        try {
            cena = Integer.parseInt(jtxt_cena.getText().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Cena nije unesena u ispravnom obliku!");
            return;
        }
        
        Date datumIVreme;
        try {
            datumIVreme = vratiDatumIVreme();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Niste uneli datum ili vreme u odgovarajucem formatu!");
            return;
        }
        
        Film film = (Film)jcbFilm.getSelectedItem();
        Sala sala = (Sala)jcbSala.getSelectedItem();
        
        Projekcija p = new Projekcija(prID, cena, datumIVreme, film, sala);
        Kontroler.vratiInstancu().sacuvajProjekciju(p);
    }
    
    private Date vratiDatumIVreme() throws ParseException{
            String datVremeTekst = jtxt_datum.getText().trim() +" at "+jtxt_vreme.getText().trim();
            DateFormat df = new SimpleDateFormat("dd.MM.yyyy. 'at' HH:mm");
            Date datumIVreme = df.parse(datVremeTekst);
            return datumIVreme;
    }

    private void dodajFilm() {
        
        String nazivFilma = jtxt_NazivFilma.getText().trim();
        int godina;
        try {
            godina = Integer.parseInt(jtxt_Godine.getText().trim());
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Godina nije unesena u pravilnom formatu");
            return;
        }
        
        String zemlja = jtxt_Zemlja.getText().trim();
        String opis = jtxt_Opis.getText().trim();
        
        List<Film> listaFilmova = Kontroler.vratiInstancu().vratiListuFilmova();
        for (Film f : listaFilmova){
            if(f.getNaziv().equalsIgnoreCase(nazivFilma) && f.getGodina()==godina && f.getZemljaPorekla().equalsIgnoreCase(zemlja)){
                jcbFilm.setSelectedItem(f);
                JOptionPane.showMessageDialog(this, "Taj film vec postoji!");
                return;
            }
        }
        
        if (Kontroler.vratiInstancu().dodajFilmUBazu(nazivFilma, godina, zemlja, opis)){
            JOptionPane.showMessageDialog(this, "Novi film je uspesno unesen!");
        } else { 
            JOptionPane.showMessageDialog(this, "Film nije unesen. Probajte ponovo"); 
        }
        
                
        popuniComboFilm();
        jcbFilm.setSelectedIndex(Kontroler.vratiInstancu().vratiListuFilmova().size()-1);
        
    }

    private void izmeniFilm() {
        
        int index = jcbFilm.getSelectedIndex();
        Film f = new Film();
        f.setNaziv(jtxt_NazivFilma.getText().trim());
        try {
            f.setGodina(Integer.parseInt(jtxt_Godine.getText().trim()));
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Godina nije unesena u pravilnom formatu");
            return;
        }
        
        f.setZemljaPorekla(jtxt_Zemlja.getText().trim());
        f.setOpis(jtxt_Opis.getText().trim()); 
        f.setFilmID(jcbFilm.getSelectedIndex());
        Kontroler.vratiInstancu().vratiListuFilmova().remove(index);
        Kontroler.vratiInstancu().vratiListuFilmova().add(index,f);
        popuniComboFilm();
        JOptionPane.showMessageDialog(this, "Film je uspesno izmenjen!");
    }
}
