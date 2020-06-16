/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonoyunu;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



/**
 *
 * @author Berke
 */
public class Pikachu extends Pokemon {
     private int hasar=40;
     private int kullanim=0;
     private ImageIcon ic= new ImageIcon("C:\\Users\\Berke\\Desktop\\PokemonOyunu\\src\\pokemonoyunu\\pikachu.PNG");
     private ImageIcon ic1= new ImageIcon("C:\\Users\\Berke\\Desktop\\PokemonOyunu\\src\\pokemonoyunu\\pokearka.PNG");

    public ImageIcon getIc1() {
        return ic1;
    }
    public ImageIcon getIc() {
       

        return ic;
    }
   
     public Pikachu()
   {
      
       
   }
    
    public Pikachu(String pokemonAdi, String pokemonTip, int pokemonID) {
        super(pokemonAdi, pokemonTip, pokemonID);
    }

    public int getHasar() {
        return hasar;
    }

    public void setHasar(int hasar) {
        this.hasar = hasar;
    }
     @Override
    public void hasarPuaniGoster()
    {
        System.out.println(""+this.hasar);
    }

    public int getKullanim() {
        return kullanim;
    }

     @Override
    public void setKullanim(int kullanim) {
        this.kullanim = kullanim;
    }

}
