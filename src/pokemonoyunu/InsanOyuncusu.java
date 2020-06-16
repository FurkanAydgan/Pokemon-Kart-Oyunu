/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonoyunu;

import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

/**
 *
 * @author Berke
 */
public class InsanOyuncusu extends Oyuncu{
    public int [] kartListesi=new int [3];
     public InsanOyuncusu() {
     
    }

    public InsanOyuncusu(String oyuncuID, String oyuncuAdi, int skor) {
       
        super(oyuncuID, oyuncuAdi, skor);
    }
    
   public int[] getKartListesi() {
        return kartListesi;
    }

    public void setKartListesi(int[] kartListesi) {
        this.kartListesi = kartListesi;
    }
  
   @Override
    public void kartSec() {
       
       
    }
    
}
