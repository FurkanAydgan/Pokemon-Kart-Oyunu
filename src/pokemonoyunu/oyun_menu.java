/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonoyunu;

import java.awt.AWTException;
import java.sql.Time;

/**
 *
 * @author Berke
 */
public class oyun_menu {
 
    public static void main(String [] args) throws AWTException, InterruptedException
    {
        
     
        oyunpanel oyun= new oyunpanel();
        try {
          Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            
        }
        oyunpanel.kart_albil();
       
         try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            
        }
        System.out.println("hasar1  "+oyunpanel.hasar1);
        System.out.println("hasar  "+oyunpanel.hasar);
        
        oyun.kart_atins();
        
        oyun.kart_atbilg();
        
        oyun.karsilastir();
        try {
           Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            
        }
        oyun.goster();
        
         try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            
        }
        oyun.ortadankartalbilg();
        
        oyun.ortadankartal1();
        
        try {
          Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();  
        }
        
        oyun.kart_albil();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            
        }
        
        oyun.karsilastir();
        
        try {
           Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            
        }
        oyun.goster();
       
        try {
           Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            
        }
        oyun.kart_atbilg();
        oyun.kart_atins();
        oyun.ortadankartalbilg();
        oyun.ortadankartal1();
          try {
          Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            
        }
        oyunpanel.kart_albil();
       
         try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            
        }
        System.out.println("hasar1  "+oyunpanel.hasar1);
        System.out.println("hasar  "+oyunpanel.hasar);
        
        oyun.kart_atins();
        
        oyun.kart_atbilg();
        
        oyun.karsilastir();
        try {
           Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            
        }
        oyun.goster();
       try {
           Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            
        }
        oyun.kart_atbilg();
        oyun.kart_atins();
          try {
          Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            
        }
        oyunpanel.kart_albil();
       
         try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            
        }
        System.out.println("hasar1  "+oyunpanel.hasar1);
        System.out.println("hasar  "+oyunpanel.hasar);
        
        oyun.kart_atins();
        
        oyun.kart_atbilg();
        
        oyun.karsilastir();
        try {
           Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            
        }
        oyun.goster();

}

    
}   
