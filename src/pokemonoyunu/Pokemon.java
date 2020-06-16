/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonoyunu;

import com.sun.javafx.font.FontConstants;

/**
 *
 * @author Berke
 */
class Pokemon {
    private int kullanim;
    private int kullanim2;
    private String pokemonAdi;
    private String pokemonTip;
    private int pokemonID;
    private int hasar;
    public Pokemon() 
    {
       
    }
     public Pokemon(String pokemonAdi, String pokemonTip, int pokemonID) {
        this.kullanim=0;
        this.kullanim2=0;
        this.pokemonAdi = pokemonAdi;
        this.pokemonTip = pokemonTip;
        this.pokemonID = pokemonID;
    }
    public String getPokemonAdi() {
        return pokemonAdi;
    }

    public void setPokemonAdi(String pokemonAdi) {
        this.pokemonAdi = pokemonAdi;
    }

    public String getPokemonTip() {
        return pokemonTip;
    }

    public void setPokemonTip(String pokemonTip) {
        this.pokemonTip = pokemonTip;
    }

    public int getPokemonID() {
        return pokemonID;
    }

    public void setPokemonID(int pokemonID) {
        this.pokemonID = pokemonID;
    }
   public void hasarPuaniGoster()
   {
       
   }

    public int getKullanim() {
        return kullanim;
    }

    public void setKullanim(int kullanim) {
        this.kullanim = kullanim;
    }
  
}
