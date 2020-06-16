/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonoyunu;

import com.sun.java.accessibility.util.GUIInitializedListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Berke
 */
public abstract class Oyuncu {

    private String oyuncuID;
    private String oyuncuAdi;
    private int skor;

    public Oyuncu() {
    }
     
    public Oyuncu(String oyuncuID, String oyuncuAdi, int skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.skor = skor;
  
    }

    public String getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(String oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
       
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        
        this.oyuncuAdi = oyuncuAdi;
    }

    public void skorGoster() {
        
        System.out.println(oyuncuAdi+ " " + this.skor);
    }

    public int getSkor() {
        return skor;
    }

    public void setSkor(int skor) {
        this.skor = skor;
    }

   

    abstract void kartSec();
   
}
