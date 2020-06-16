/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonoyunu;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;

/**
 *
 * @author Berke
 */
public class BilgisayarOyuncusu extends Oyuncu {
    private int [] kartListesi1=new int[3];
    public BilgisayarOyuncusu()
    {
     
       
    }

    public BilgisayarOyuncusu(String oyuncuID, String oyuncuAdi, int skor) {
        super(oyuncuID, oyuncuAdi, skor);
    }
    
    public int[] getKartListesi1() {
        return kartListesi1;
    }

    public void setKartListesi1(int[] kartListesi) {
        this.kartListesi1 = kartListesi;
         
    }
    @Override
    public void kartSec()
    {
        
    }

}
