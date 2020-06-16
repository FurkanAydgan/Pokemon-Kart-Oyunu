/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonoyunu;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.MouseInfo;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.sql.Time;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.MouseInputAdapter;
import jdk.nashorn.internal.parser.TokenType;
import sun.awt.image.ToolkitImage;

/**
 *
 * @author Berke
 */
public class oyunpanel {

    JButton button1 = new JButton();
    static Pikachu pikac = new Pikachu("Pikachu","Elektrik",0);
    static Bulbasaur bulb = new Bulbasaur("Bulbasaur","Çim",1);
    static Butterfree butter = new Butterfree("Butterfree","Su",2);
    static Charmander charman = new Charmander("Charmander","Ateş",3);
    static Jigglypuff jiggly = new Jigglypuff("Jigglypuff","Ses",4);
    static Psyduck psyduck = new Psyduck("Psyduck","Su",5);
    static Meowth meowth = new Meowth("Meowth","Normal",6);
    static Snorlax snorlax = new Snorlax("Snorlax","Normal",7);
    static Squirtle squirtle = new Squirtle("Squirtle","Su",8);
    static Zubat zubat = new Zubat("Zubat","Normal",9);
    static int degisken = -1;
    static int kart[] = new int[10];
    static int sayi;
    static int b;
    static int hasar;
    static int c = 0, m;
    static int hasar1;
    static int bilg_kart[] = new int[3];
    static int bilg_kart1[] = new int[3];
    static int oync_kart[] = new int[3];
    static int kart_destesi[] = new int[4];
    static int secilenkart = 0;
    static int x, y;
    static int[] eksen5 = new int[10];
    static int t;
    static int[] eksen6 = new int[3];
    static int eksen = 150;
    static int eksen3 = 150;
    static int eksen1 = 30;
    static JButton buton = new JButton();
    static JButton buton1 = new JButton();
    static JButton buton2 = new JButton();
    static JButton buton3 = new JButton();
    static JButton buton4 = new JButton();
    static JButton buton6 = new JButton();
    static JButton buton7 = new JButton();
    static JButton buton8 = new JButton();
    static JButton buton9 = new JButton();
    static JButton buton10 = new JButton();

    static JFrame GUI = new JFrame("Pokemon Oyunu");
    static JPanel ekran = new JPanel();
    static int degisken1 = 0;
    static int degisken4 = 0;
    static Oyuncu oyuncu1 = new InsanOyuncusu("03", "oyuncu", 0);
    static Oyuncu oyuncu2 = new BilgisayarOyuncusu("04", "Bilgisayar_Oyuncusu", 0);
    static JButton[] buton5 = new JButton[40];
    static int degisken3 = 0;

    public oyunpanel() throws InterruptedException {
        for (int i = 0; i < 30; i++) {
            buton5[i] = null;
        }

        ekran.setSize(1366, 768);
        GUI.setSize(1366, 768);
        Random r = new Random();
        kart[0] = r.nextInt(10);
        for (int i = 0; i < 10; i++) {
            sayi = r.nextInt(10);
            for (int j = 0; j < i; j++) {

                if (kart[j] == sayi) {
                    sayi = r.nextInt(10);

                    i--;
                    break;
                } else {
                    kart[i] = sayi;
                }
            }

        }

        for (int i = 0; i < 3; i++) {
            bilg_kart[i] = kart[i];
            oync_kart[i] = kart[i + 3];
        }

        int j = 0;
        for (int i = 6; i < 10; i++) {
            kart_destesi[j] = kart[i];
            j++;
        }
        ekran.setLayout(null);

        int sayac5 = 1;
        int f = 0;

        for (int i = 0; i < 3; i++) {
            if (bilg_kart[i] == 0) {
                pikac.setKullanim(1);
                buton5[10] = new JButton(pikac.getIc());
                buton5[10].setSize(124, 181);
                buton5[10].setLocation(eksen, eksen1);
                ekran.add(buton5[10]);
                GUI.add(ekran);
                int eksen3 = eksen;
                buton5[10].addMouseListener(new MouseInputAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        ImageIcon ic2 = new ImageIcon("C:\\Users\\Berke\\Desktop\\PokemonOyunu\\src\\pokemonoyunu\\pikachu.PNG");
                        Image ic2Image = ic2.getImage().getScaledInstance(125, 181, Image.SCALE_SMOOTH);
                        ic2 = new ImageIcon(ic2Image);
                        buton5[10].setIcon(ic2);
                       
                        buton5[10].setLocation(eksen3, 105);

                        degisken1 = 0;

                    }
                });

                eksen = eksen + 181;

            }
            if (bilg_kart[i] == 1) {
                bulb.setKullanim(1);
                buton5[11] = new JButton(bulb.getIc());
                buton5[11].setSize(124, 181);
                buton5[11].setLocation(eksen, 30);
                ekran.add(buton5[11]);
                GUI.add(ekran);
                int eksen4 = eksen;
                buton5[11].addMouseListener(new MouseAdapter() {
                    @Override

                    public void mouseClicked(MouseEvent e) {

                        ImageIcon ic2 = new ImageIcon("C:\\Users\\Berke\\Desktop\\PokemonOyunu\\src\\pokemonoyunu\\1134505.jpg");
                        Image ic2Image = ic2.getImage().getScaledInstance(125, 181, Image.SCALE_SMOOTH);
                        ic2 = new ImageIcon(ic2Image);
                        buton5[11].setIcon(ic2);
                        buton5[11].setLocation(eksen4, 105);
                        
                        degisken1 = 1;

                    }

                });
                eksen = eksen + 181;
            }

            if (bilg_kart[i] == 2) {
                butter.setKullanim(1);
                buton5[12] = new JButton(butter.getIc());
                buton5[12].setSize(124, 181);
                buton5[12].setLocation(eksen, 30);
                ekran.add(buton5[12]);
                GUI.add(ekran);
                int eksen5 = eksen;
                buton5[12].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        ImageIcon ic2 = new ImageIcon("C:\\Users\\Berke\\Desktop\\PokemonOyunu\\src\\pokemonoyunu\\Butterfree.png");
                        Image ic2Image = ic2.getImage().getScaledInstance(125, 181, Image.SCALE_SMOOTH);
                        ic2 = new ImageIcon(ic2Image);
                        buton5[12].setIcon(ic2);
                        buton5[12].setLocation(eksen5, 105);
                       
                        degisken1 = 2;

                    }

                });
                eksen = eksen + 181;

            }
            if (bilg_kart[i] == 3) {
                charman.setKullanim(1);
                buton5[13] = new JButton(charman.getIc());
                buton5[13].setSize(124, 181);
                buton5[13].setLocation(eksen, 30);
                ekran.add(buton5[13]);
                GUI.add(ekran);
                int eksen6 = eksen;
                buton5[13].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {

                        ImageIcon ic2 = new ImageIcon("C:\\Users\\Berke\\Desktop\\PokemonOyunu\\src\\pokemonoyunu\\charmander.PNG");
                        Image ic2Image = ic2.getImage().getScaledInstance(125, 181, Image.SCALE_SMOOTH);
                        ic2 = new ImageIcon(ic2Image);
                        buton5[13].setIcon(ic2);
                        buton5[13].setLocation(eksen6, 105);
                       
                        degisken1 = 3;

                    }

                });
                eksen = eksen + 181;
            }
            if (bilg_kart[i] == 4) {
                jiggly.setKullanim(1);
                buton5[14] = new JButton(jiggly.getIc());
                buton5[14].setSize(124, 181);
                buton5[14].setLocation(eksen, 30);
                ekran.add(buton5[14]);
                GUI.add(ekran);
                int eksen7 = eksen;
                buton5[14].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                      
                        ImageIcon ic2 = new ImageIcon("C:\\Users\\Berke\\Desktop\\PokemonOyunu\\src\\pokemonoyunu\\Jigglypuff.jpg");
                        Image ic2Image = ic2.getImage().getScaledInstance(125, 181, Image.SCALE_SMOOTH);
                        ic2 = new ImageIcon(ic2Image);
                        buton5[14].setIcon(ic2);
                        buton5[14].setLocation(eksen7, 105);
                       
                        degisken1 = 4;

                    }

                });
                eksen = eksen + 181;
            }
            if (bilg_kart[i] == 5) {
                meowth.setKullanim(1);
                buton5[15] = new JButton(meowth.getIc());
                buton5[15].setLocation(eksen, 30);
                buton5[15].setSize(124, 181);
                ekran.add(buton5[15]);
                GUI.add(ekran);
                int eksen8 = eksen;
                buton5[15].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                       
                        ImageIcon ic2 = new ImageIcon("C:\\Users\\Berke\\Desktop\\PokemonOyunu\\src\\pokemonoyunu\\Meowth.jpg");
                        Image ic2Image = ic2.getImage().getScaledInstance(125, 181, Image.SCALE_SMOOTH);
                        ic2 = new ImageIcon(ic2Image);
                        buton5[15].setIcon(ic2);
                        buton5[15].setLocation(eksen8, 105);
                      
                        degisken1 = 5;

                    }

                });
                eksen = eksen + 181;
            }
            if (bilg_kart[i] == 6) {
                psyduck.setKullanim(1);
                buton5[16] = new JButton(psyduck.getIc());
                buton5[16].setSize(124, 181);
                buton5[16].setLocation(eksen, 30);
                ekran.add(buton5[16]);
                GUI.add(ekran);
                int eksen9 = eksen;
                buton5[16].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                      
                        ImageIcon ic2 = new ImageIcon("C:\\Users\\Berke\\Desktop\\PokemonOyunu\\src\\pokemonoyunu\\Psyduck.jpg");
                        Image ic2Image = ic2.getImage().getScaledInstance(125, 181, Image.SCALE_SMOOTH);
                        ic2 = new ImageIcon(ic2Image);
                        buton5[16].setIcon(ic2);
                        buton5[16].setLocation(eksen9, 105);
                      
                        degisken1 = 6;

                    }

                });
                eksen = eksen + 181;
            }
            if (bilg_kart[i] == 7) {
                snorlax.setKullanim(1);
                buton5[17] = new JButton(snorlax.getIc());
                buton5[17].setSize(124, 181);
                buton5[17].setLocation(eksen, 30);
                ekran.add(buton5[17]);
                GUI.add(ekran);
                int eksen10 = eksen;
                buton5[17].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                      
                        ImageIcon ic2 = new ImageIcon("C:\\Users\\Berke\\Desktop\\PokemonOyunu\\src\\pokemonoyunu\\Snorlax.jpg");
                        Image ic2Image = ic2.getImage().getScaledInstance(125, 181, Image.SCALE_SMOOTH);
                        ic2 = new ImageIcon(ic2Image);
                        buton5[17].setIcon(ic2);
                        buton5[17].setLocation(eksen10, 105);
                     
                        degisken1 = 7;
                    }

                });
                eksen = eksen + 181;
            }
            if (bilg_kart[i] == 8) {
                squirtle.setKullanim(1);
                buton5[18] = new JButton(squirtle.getIc());
                buton5[18].setSize(124, 181);
                buton5[18].setLocation(eksen, 30);
                ekran.add(buton5[18]);
                GUI.add(ekran);
                int eksen11 = eksen;
                buton5[18].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                      
                        ImageIcon ic2 = new ImageIcon("C:\\Users\\Berke\\Desktop\\PokemonOyunu\\src\\pokemonoyunu\\Squirtle.jpg");
                        Image ic2Image = ic2.getImage().getScaledInstance(125, 181, Image.SCALE_SMOOTH);
                        ic2 = new ImageIcon(ic2Image);
                        buton5[18].setIcon(ic2);
                        buton5[18].setLocation(eksen11, 105);
                       
                        degisken1 = 8;

                    }

                });
                eksen = eksen + 181;
            }
            if (bilg_kart[i] == 9) {
                zubat.setKullanim(1);
                buton5[19] = new JButton(zubat.getIc());
                buton5[19].setSize(124, 181);
                buton5[19].setLocation(eksen, 30);
                ekran.add(buton5[19]);
                GUI.add(ekran);
                int eksen12 = eksen;
                buton5[19].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                      
                        ImageIcon ic2 = new ImageIcon("C:\\Users\\Berke\\Desktop\\PokemonOyunu\\src\\pokemonoyunu\\Zubat.jpg");
                        Image ic2Image = ic2.getImage().getScaledInstance(125, 181, Image.SCALE_SMOOTH);
                        ic2 = new ImageIcon(ic2Image);
                        buton5[19].setIcon(ic2);
                        buton5[19].setLocation(eksen12, 105);
                        degisken1 = 9;

                    }
                });
                eksen = eksen + 181;
            }

        }

        eksen1 = 150;
        for (int i = 0; i < 3; i++) {

            if (oync_kart[i] == 0) {
                pikac.setKullanim(1);
                buton5[0] = new JButton(pikac.getIc());
                buton5[0].setLocation(eksen1, 450);
                buton5[0].setSize(124, 181);
                ekran.add(buton5[0]);
                GUI.add(ekran);
                eksen5[0] = eksen1;
                buton5[0].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (eksen5[0] >= 150 && eksen5[0] <= 331) {
                            m = 0;
                        }
                        if (eksen5[0] >= 331 && eksen5[0] <= 512) {
                            m = 1;
                        }
                        if (eksen5[0] >= 512 && eksen5[0] <= 750) {
                            m = 2;
                        }
                        buton5[0].setLocation(eksen5[0], 375);
                        degisken = 0;
                        hasar1 = pikac.getHasar();
                      

                    }
                });
                eksen6[c] = eksen1;
                c++;

                eksen1 = eksen1 + 181;
            }
            if (oync_kart[i] == 1) {
                bulb.setKullanim(1);
                buton5[1] = new JButton(bulb.getIc());
                buton5[1].setLocation(eksen1, 450);
                buton5[1].setSize(124, 181);
                ekran.add(buton5[1]);
                GUI.add(ekran);
                eksen5[1] = eksen1;
                buton5[1].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (eksen5[1] >= 150 && eksen5[1] <= 331) {
                            m = 0;
                        }
                        if (eksen5[1] >= 331 && eksen5[1] <= 512) {
                            m = 1;
                        }
                        if (eksen5[1] >= 512 && eksen5[1] <= 750) {
                            m = 2;
                        }
                        buton5[1].setLocation(eksen5[1], 375);
                        hasar1 = bulb.getHasar();
                        degisken = 1;

                    }

                });

                eksen6[c] = eksen1;
                c++;

                eksen1 = eksen1 + 181;
            }
            if (oync_kart[i] == 2) {
                butter.setKullanim(1);
                buton5[2] = new JButton(butter.getIc());
                buton5[2].setLocation(eksen1, 450);
                buton5[2].setSize(124, 181);
                ekran.add(buton5[2]);
                GUI.add(ekran);
                eksen5[2] = eksen1;
                buton5[2].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (eksen5[2] >= 150 && eksen5[2] <= 331) {
                            m = 0;
                        }
                        if (eksen5[2] >= 331 && eksen5[2] <= 512) {
                            m = 1;
                        }
                        if (eksen5[2] >= 512 && eksen5[2] <= 750) {
                            m = 2;
                        }
                        buton5[2].setLocation(eksen5[2], 375);
                        degisken = 2;
                        hasar1 = butter.getHasar();

                    }
                });
                eksen6[c] = eksen1;
                c++;

                eksen1 = eksen1 + 181;
            }
            if (oync_kart[i] == 3) {
                charman.setKullanim(1);
                buton5[3] = new JButton(charman.getIc());
                buton5[3].setLocation(eksen1, 450);
                buton5[3].setSize(124, 181);
                ekran.add(buton5[3]);
                GUI.add(ekran);
                eksen5[3] = eksen1;
                buton5[3].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (eksen5[3] >= 150 && eksen5[3] <= 331) {
                            m = 0;
                        }
                        if (eksen5[3] >= 331 && eksen5[3] <= 512) {
                            m = 1;
                        }
                        if (eksen5[3] >= 512 && eksen5[3] <= 750) {
                            m = 2;
                        }
                        buton5[3].setLocation(eksen5[3], 375);
                        degisken = 3;
                        hasar1 = charman.getHasar();

                    }
                });
                eksen6[c] = eksen1;
                c++;

                eksen1 = eksen1 + 181;
            }
            if (oync_kart[i] == 4) {
                jiggly.setKullanim(1);
                buton5[4] = new JButton(jiggly.getIc());
                buton5[4].setLocation(eksen1, 450);
                buton5[4].setSize(124, 181);
                ekran.add(buton5[4]);
                GUI.add(ekran);
                eksen5[4] = eksen1;
                buton5[4].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (eksen5[4] >= 150 && eksen5[4] <= 331) {
                            m = 0;
                        }
                        if (eksen5[4] >= 331 && eksen5[4] <= 512) {
                            m = 1;
                        }
                        if (eksen5[4] >= 512 && eksen5[4] <= 750) {
                            m = 2;
                        }
                        buton5[4].setLocation(eksen5[4], 375);
                        degisken = 4;
                        hasar1 = jiggly.getHasar();

                    }
                });
                eksen6[c] = eksen1;
                c++;

                eksen1 = eksen1 + 181;
            }
            if (oync_kart[i] == 5) {
                meowth.setKullanim(1);
                buton5[5] = new JButton(meowth.getIc());
                buton5[5].setLocation(eksen1, 450);
                buton5[5].setSize(124, 181);
                ekran.add(buton5[5]);
                GUI.add(ekran);
                eksen5[5] = eksen1;
                buton5[5].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (eksen5[5] >= 150 && eksen5[5] <= 331) {
                            m = 0;
                        }
                        if (eksen5[5] >= 331 && eksen5[5] <= 512) {
                            m = 1;
                        }
                        if (eksen5[5] >= 512 && eksen5[5] <= 750) {
                            m = 2;
                        }
                        buton5[5].setLocation(eksen5[5], 375);
                        degisken = 5;
                        hasar1 = meowth.getHasar();

                    }
                });
                eksen6[c] = eksen1;
                c++;

                eksen1 = eksen1 + 181;
            }
            if (oync_kart[i] == 6) {
                psyduck.setKullanim(1);
                buton5[6] = new JButton(psyduck.getIc());
                buton5[6].setLocation(eksen1, 450);
                buton5[6].setSize(124, 181);
                ekran.add(buton5[6]);
                GUI.add(ekran);
                eksen5[6] = eksen1;
                buton5[6].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (eksen5[6] >= 150 && eksen5[6] <= 331) {
                            m = 0;
                        }
                        if (eksen5[6] >= 331 && eksen5[6] <= 512) {
                            m = 1;
                        }
                        if (eksen5[6] >= 512 && eksen5[6] <= 750) {
                            m = 2;
                        }
                        buton5[6].setLocation(eksen5[6], 375);
                        degisken = 6;//HASARRRRRRRR
                        hasar1 = psyduck.getHasar();

                    }
                });
                eksen6[c] = eksen1;
                c++;

                eksen1 = eksen1 + 181;
            }
            if (oync_kart[i] == 7) {
                snorlax.setKullanim(1);
                buton5[7] = new JButton(snorlax.getIc());
                buton5[7].setLocation(eksen1, 450);
                buton5[7].setSize(124, 181);
                ekran.add(buton5[7]);
                GUI.add(ekran);
                eksen5[7] = eksen1;
                buton5[7].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (eksen5[7] >= 150 && eksen5[7] <= 331) {
                            m = 0;
                        }
                        if (eksen5[7] >= 331 && eksen5[7] <= 512) {
                            m = 1;
                        }
                        if (eksen5[7] >= 512 && eksen5[7] <= 750) {
                            m = 2;
                        }
                        buton5[7].setLocation(eksen5[7], 375);
                        degisken = 7;
                        hasar1 = snorlax.getHasar();

                    }
                });
                eksen6[c] = eksen1;
                c++;

                eksen1 = eksen1 + 181;
            }
            if (oync_kart[i] == 8) {
                squirtle.setKullanim(1);
                buton5[8] = new JButton(squirtle.getIc());
                buton5[8].setLocation(eksen1, 450);
                buton5[8].setSize(124, 181);
                ekran.add(buton5[8]);
                GUI.add(ekran);
                eksen5[8] = eksen1;
                buton5[8].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (eksen5[8] >= 150 && eksen5[8] <= 331) {
                            m = 0;
                        }
                        if (eksen5[8] >= 331 && eksen5[8] <= 512) {
                            m = 1;
                        }
                        if (eksen5[8] >= 512 && eksen5[8] <= 750) {
                            m = 2;
                        }
                        buton5[8].setLocation(eksen5[8], 375);
                        degisken = 8;
                        hasar1 = squirtle.getHasar();

                    }
                });
                eksen6[c] = eksen1;
                c++;

                eksen1 = eksen1 + 181;
            }
            if (oync_kart[i] == 9) {
                zubat.setKullanim(1);
                buton5[9] = new JButton(zubat.getIc());
                buton5[9].setLocation(eksen1, 450);
                buton5[9].setSize(124, 181);
                ekran.add(buton5[9]);
                GUI.add(ekran);
                eksen5[9] = eksen1;
                buton5[9].addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        if (eksen5[9] >= 150 && eksen5[9] <= 331) {
                            m = 0;
                        }
                        if (eksen5[9] >= 331 && eksen5[9] <= 512) {
                            m = 1;
                        }
                        if (eksen5[9] >= 512 && eksen5[9] <= 750) {
                            m = 2;
                        }
                        buton5[9].setLocation(eksen5[9], 375);
                        degisken = 9;
                        hasar1 = zubat.getHasar();

                    }
                });
                eksen6[c] = eksen1;
                c++;

                eksen1 = eksen1 + 181;

            }
        }

        for (int i = 0; i < 4; i++) {
            if (kart_destesi[i] == 0) {

                buton = new JButton(pikac.getIc());
                buton.setLocation(eksen1, 250);
                buton.setSize(124, 181);
                ekran.add(buton);
                GUI.add(ekran);
                eksen1 = eksen1 + 170;

            }
            if (kart_destesi[i] == 1) {

                buton1 = new JButton(bulb.getIc());
                buton1.setLocation(eksen1, 250);
                buton1.setSize(124, 181);
                ekran.add(buton1);
                GUI.add(ekran);
                eksen1 = eksen1 + 170;
            }
            if (kart_destesi[i] == 2) {

                buton2 = new JButton(butter.getIc());
                buton2.setLocation(eksen1, 250);
                buton2.setSize(124, 181);
                ekran.add(buton2);
                GUI.add(ekran);
                eksen1 = eksen1 + 170;
            }
            if (kart_destesi[i] == 3) {

                buton3 = new JButton(charman.getIc());
                buton3.setLocation(eksen1, 250);
                buton3.setSize(124, 181);
                ekran.add(buton3);
                GUI.add(ekran);
                eksen1 = eksen1 + 170;
            }
            if (kart_destesi[i] == 4) {

                buton4 = new JButton(jiggly.getIc());
                buton4.setLocation(eksen1, 250);
                buton4.setSize(124, 181);
                ekran.add(buton4);
                GUI.add(ekran);
                eksen1 = eksen1 + 170;
            }
            if (kart_destesi[i] == 5) {

                buton6 = new JButton(meowth.getIc());
                buton6.setLocation(eksen1, 250);
                buton6.setSize(124, 181);
                ekran.add(buton6);
                GUI.add(ekran);
                eksen1 = eksen1 + 170;
            }
            if (kart_destesi[i] == 6) {

                buton7 = new JButton(psyduck.getIc());
                buton7.setLocation(eksen1, 250);
                buton7.setSize(124, 181);
                ekran.add(buton7);
                GUI.add(ekran);
                eksen1 = eksen1 + 170;
            }
            if (kart_destesi[i] == 7) {

                buton8 = new JButton(snorlax.getIc());
                buton8.setLocation(eksen1, 250);
                buton8.setSize(124, 181);
                ekran.add(buton8);
                GUI.add(ekran);
                eksen1 = eksen1 + 170;
            }
            if (kart_destesi[i] == 8) {

                buton9 = new JButton(squirtle.getIc());
                buton9.setLocation(eksen1, 250);
                buton9.setSize(124, 181);
                ekran.add(buton9);
                GUI.add(ekran);
                eksen1 = eksen1 + 170;
            }
            if (kart_destesi[i] == 9) {

                buton10 = new JButton(zubat.getIc());
                buton10.setLocation(eksen1, 250);
                buton10.setSize(124, 181);
                ekran.add(buton10);
                GUI.add(ekran);
                eksen1 = eksen1 + 170;

            }
        }

        GUI.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JFrame frame = new JFrame();
        JPanel panel = new JPanel(new BorderLayout());
        JButton but = new JButton("Computer VS Player");
        but.setSize(300, 50);
        but.setLocation(530, 250);
        JButton but1 = new JButton("Computer VS Computer");
        but1.setSize(300, 50);
        but1.setLocation(530, 460);
        panel.setLayout(null);
        frame.setSize(1366, 768);
        panel.add(but);
        panel.add(but1);
        ImageIcon ic3 = new ImageIcon("C:\\Users\\Berke\\Desktop\\PokemonOyunu\\src\\pokemonoyunu\\oyunekranı1.jpg");
        Image Imageic3 = ic3.getImage().getScaledInstance(1366, 768, Image.SCALE_SMOOTH);
        ic3 = new ImageIcon(Imageic3);
        JLabel resimjlabel = new JLabel(ic3);
        ImageIcon ic4 = new ImageIcon("C:\\Users\\Berke\\Desktop\\PokemonOyunu\\src\\pokemonoyunu\\oyunekranı.jpg");
        Image Imageic4 = ic4.getImage().getScaledInstance(1366, 768, Image.SCALE_SMOOTH);
        ic4 = new ImageIcon(Imageic4);
        JLabel resim = new JLabel(ic4);
        resimjlabel.setSize(1366, 768);
        resim.setSize(1366, 768);
        ekran.add(resim);
        panel.add(resimjlabel);
        frame.add(panel);

        frame.setVisible(true);
        but.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                frame.setVisible(false);
                GUI.setVisible(true);
            }
        });

    }

    public static void kart_albil() throws AWTException {
        Random r = new Random();
     
        t = r.nextInt(3);
        if (t == 0) {
            Robot ro = new Robot();
            ro.mouseMove(175, 100);
            ro.mousePress(InputEvent.BUTTON1_MASK);
            ro.mouseRelease(InputEvent.BUTTON1_MASK);
            if (bilg_kart[t] == 0) {
                hasar = pikac.getHasar();
            }
            if (bilg_kart[t] == 1) {
                hasar = bulb.getHasar();
            }
            if (bilg_kart[t] == 2) {
                hasar = butter.getHasar();
            }
            if (bilg_kart[t] == 3) {
                hasar = charman.getHasar();
            }
            if (bilg_kart[t] == 4) {
                hasar = jiggly.getHasar();
            }
            if (bilg_kart[t] == 5) {
                hasar = meowth.getHasar();
            }
            if (bilg_kart[t] == 6) {
                hasar = psyduck.getHasar();
            }
            if (bilg_kart[t] == 7) {
                hasar = snorlax.getHasar();
            }
            if (bilg_kart[t] == 8) {
                hasar = squirtle.getHasar();
            }
            if (bilg_kart[t] == 9) {
                hasar = zubat.getHasar();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }

        }
        if (t == 1) {
            Robot ro = new Robot();
            ro.mouseMove(375, 100);
            ro.mousePress(InputEvent.BUTTON1_MASK);
            ro.mouseRelease(InputEvent.BUTTON1_MASK);
            if (bilg_kart[t] == 0) {
                hasar = pikac.getHasar();
            }
            if (bilg_kart[t] == 1) {
                hasar = bulb.getHasar();
            }
            if (bilg_kart[t] == 2) {
                hasar = butter.getHasar();
            }
            if (bilg_kart[t] == 3) {
                hasar = charman.getHasar();
            }
            if (bilg_kart[t] == 4) {
                hasar = jiggly.getHasar();
            }
            if (bilg_kart[t] == 5) {
                hasar = meowth.getHasar();
            }
            if (bilg_kart[t] == 6) {
                hasar = psyduck.getHasar();
            }
            if (bilg_kart[t] == 7) {
                hasar = snorlax.getHasar();
            }
            if (bilg_kart[t] == 8) {
                hasar = squirtle.getHasar();
            }
            if (bilg_kart[t] == 9) {
                hasar = zubat.getHasar();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
        if (t == 2) {
            Robot ro = new Robot();
            ro.mouseMove(600, 100);
            ro.mousePress(InputEvent.BUTTON1_MASK);
            ro.mouseRelease(InputEvent.BUTTON1_MASK);
            if (bilg_kart[t] == 0) {
                hasar = pikac.getHasar();
            }
            if (bilg_kart[t] == 1) {
                hasar = bulb.getHasar();
            }
            if (bilg_kart[t] == 2) {
                hasar = butter.getHasar();
            }
            if (bilg_kart[t] == 3) {
                hasar = charman.getHasar();
            }
            if (bilg_kart[t] == 4) {
                hasar = jiggly.getHasar();
            }
            if (bilg_kart[t] == 5) {
                hasar = meowth.getHasar();
            }
            if (bilg_kart[t] == 6) {
                hasar = psyduck.getHasar();
            }
            if (bilg_kart[t] == 7) {
                hasar = snorlax.getHasar();
            }
            if (bilg_kart[t] == 8) {
                hasar = squirtle.getHasar();
            }
            if (bilg_kart[t] == 9) {
                hasar = zubat.getHasar();
            }

        }

    }

    public void karsilastir() {

        if (oyunpanel.hasar1 > oyunpanel.hasar) {
            oyuncu1.setSkor(oyuncu1.getSkor() + 5);
        }
        else if (oyunpanel.hasar1<oyunpanel.hasar)
        {
            oyuncu2.setSkor(oyuncu2.getSkor() + 5);
        }
    }

    public void kart_atins() {
        if (degisken == 0) {
            buton5[0].setVisible(false);
            degisken4 = eksen5[0];

        }
        if (degisken == 1) {
            buton5[1].setVisible(false);
            degisken4 = eksen5[1];
        }
        if (degisken == 2) {
            buton5[2].setVisible(false);
            degisken4 = eksen5[2];
        }
        if (degisken == 3) {
            buton5[3].setVisible(false);
            degisken4 = eksen5[3];
        }
        if (degisken == 4) {
            buton5[4].setVisible(false);
            degisken4 = eksen5[4];
        }
        if (degisken == 5) {
            buton5[5].setVisible(false);
            degisken4 = eksen5[5];
        }
        if (degisken == 6) {
            buton5[6].setVisible(false);
            degisken4 = eksen5[6];
        }
        if (degisken == 7) {
            buton5[7].setVisible(false);
            degisken4 = eksen5[7];
        }
        if (degisken == 8) {
            buton5[8].setVisible(false);
            degisken4 = eksen5[8];
        }
        if (degisken == 9) {
            buton5[9].setVisible(false);
            degisken4 = eksen5[9];
        }
       
    }

    public void kart_atbilg() {
        if (degisken1 == 0) {
            buton5[10].setVisible(false);
        }
        if (degisken1 == 1) {
            buton5[11].setVisible(false);
        }
        if (degisken1 == 2) {
            buton5[12].setVisible(false);
        }
        if (degisken1 == 3) {
            buton5[13].setVisible(false);
        }
        if (degisken1 == 4) {
            buton5[14].setVisible(false);
        }
        if (degisken1 == 5) {
            buton5[15].setVisible(false);
        }
        if (degisken1 == 6) {
            buton5[16].setVisible(false);
        }
        if (degisken1 == 7) {
            buton5[17].setVisible(false);
        }
        if (degisken1 == 8) {
            buton5[18].setVisible(false);
        }
        if (degisken1 == 9) {
            buton5[19].setVisible(false);
        }
    }

    public void goster() {
        oyuncu1.skorGoster();
        oyuncu2.skorGoster();
    }

    public void ortadankartalbilg() {
        Random rb = new Random();
        do {
            b=rb.nextInt(4);
           
                if (kart_destesi[b] == 0) {
                    if (pikac.getKullanim() == 0) {
                    pikac.setKullanim(1);
                    if (t == 0) {
                        buton.setLocation(160, 30);
                    }
                    if (t == 1) {
                        buton.setLocation(330, 30);
                    }
                    if (t == 2) {
                        buton.setLocation(500, 30);
                    }
                    bilg_kart[t]=kart_destesi[b];
                    break;
                }               
            }
                if (kart_destesi[b] == 1) {
                    if (bulb.getKullanim() == 0) {
                   
                    bulb.setKullanim(1);
                    if (t == 0) {
                        buton1.setLocation(160, 30);
                    }
                    if (t == 1) {
                        buton1.setLocation(330, 30);
                    }
                    if (t == 2) {
                        buton1.setLocation(500, 30);
                    } 
                    bilg_kart[t]=kart_destesi[b];
                    break;
                }
               
            }

            
                if (kart_destesi[b] == 2) {
                    if (butter.getKullanim() == 0) {
                   
                    butter.setKullanim(1);
                    if (t == 0) {
                        buton2.setLocation(160, 30);
                    }
                    if (t == 1) {
                        buton2.setLocation(330, 30);
                    }
                    if (t == 2) {
                        buton2.setLocation(500, 30);
                    }
                    bilg_kart[t]=kart_destesi[b];
                    break;
                }
               
            }

           
                if (kart_destesi[b] == 3) {
                     if (charman.getKullanim() == 0) {
                    
                    charman.setKullanim(1);
                    if (t == 0) {
                        buton3.setLocation(160, 30);
                    }
                    if (t == 1) {
                        buton3.setLocation(330, 30);
                    }
                    if (t == 2) {
                        buton3.setLocation(500, 30);
                    }
                    bilg_kart[t]=kart_destesi[b];
                    break;
                }
               
            }

            
                if (kart_destesi[b] == 4) {
                    if (jiggly.getKullanim() == 0) {
                   
                    jiggly.setKullanim(1);
                    if (t == 0) {
                        buton4.setLocation(160, 30);
                    }
                    if (t == 1) {
                        buton4.setLocation(330, 30);
                    }
                    if (t == 2) {
                        buton4.setLocation(500, 30);
                    }
                    bilg_kart[t]=kart_destesi[b];
                    break;
                }
                
            }

            
                if (kart_destesi[b] == 5) {
                    if (meowth.getKullanim() == 0) {
                 
                    meowth.setKullanim(1);
                    if (t == 0) {
                        buton6.setLocation(160, 30);
                    }
                    if (t == 1) {
                        buton6.setLocation(330, 30);
                    }
                    if (t == 2) {
                        buton6.setLocation(500, 30);
                    }
                    bilg_kart[t]=kart_destesi[b];
                    break;
                }
                
            }

           
                if (kart_destesi[b] == 6) {
                     if (psyduck.getKullanim() == 0) {
                   
                    psyduck.setKullanim(1);
                    if (t == 0) {
                        buton7.setLocation(160, 30);
                    }
                    if (t == 1) {
                        buton7.setLocation(330, 30);
                    }
                    if (t == 2) {
                        buton7.setLocation(500, 30);
                    }
                    bilg_kart[t]=kart_destesi[b];
                    break;
                }
               
            }

            
                if (kart_destesi[b] == 7) {
                    if (snorlax.getKullanim() == 0) {
                   
                    snorlax.setKullanim(1);
                    if (t == 0) {
                        buton8.setLocation(160, 30);
                    }
                    if (t == 1) {
                        buton8.setLocation(330, 30);
                    }
                    if (t == 2) {
                        buton8.setLocation(500, 30);
                    }
                    bilg_kart[t]=kart_destesi[b];
                    break;
                }
                
            }

           
                if (kart_destesi[b] == 8) {
                     if (squirtle.getKullanim() == 0) {
                   
                    squirtle.setKullanim(1);
                    if (t == 0) {
                        buton9.setLocation(160, 30);
                    }
                    if (t == 1) {
                        buton9.setLocation(330, 30);
                    }
                    if (t == 2) {
                        buton9.setLocation(500, 30);
                    }
                    bilg_kart[t]=kart_destesi[b];
                    break;
                }
                
            }

            
                if (kart_destesi[b] == 9) {
                  if (zubat.getKullanim() == 0) {
                    zubat.setKullanim(1);
                    if (t == 0) {
                        buton10.setLocation(160, 30);
                    }
                    if (t == 1) {
                        buton10.setLocation(330, 30);
                    }
                    if (t == 2) {
                        buton10.setLocation(500, 30);
                    }
                    bilg_kart[t]=kart_destesi[b];
                    break;
                }
                  
            }
        } while (true);

    }

    public void ortadankartal1() {
        int k = MouseInfo.getPointerInfo().getLocation().x;
        if(pikac.getKullanim()==0)
        {
            buton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (k >= 150 && k < 331) {
                    
                    buton.setLocation(eksen6[0], 450);
                    buton.setIcon(pikac.getIc());
                }
                if (k >= 331 && k < 512) {
                    buton.setLocation(eksen6[1], 450);
                    buton.setIcon(pikac.getIc());
                }
                if (k >= 512 && k <= 750) {
                    buton.setLocation(eksen6[2], 450);
                    buton.setIcon(pikac.getIc());
                }
              pikac.setKullanim(1);
            }
        });
        }
        else{
            buton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
             if (k >= 150 && k < 331) {
                    
                    buton.setLocation(eksen6[0],105);
                    buton.setIcon(pikac.getIc());
                }
                if (k >= 331 && k < 512) {
                    buton.setLocation(eksen6[1], 105);
                    buton.setIcon(pikac.getIc());
                }
                if (k >= 512 && k <= 750) {
                    buton.setLocation(eksen6[2], 105);
                    buton.setIcon(pikac.getIc());
                }
        }
        });
        }
        if(bulb.getKullanim()==0)
        {
             buton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (k >= 150 && k < 331) {
                    
                    buton1.setLocation(eksen6[0], 450);
                    buton1.setIcon(bulb.getIc());
                }
                if (k >= 331 && k < 512) {
                   
                    buton1.setLocation(eksen6[1], 450);
                    buton1.setIcon(bulb.getIc());
                }
                if (k >= 512 && k <= 750) {
                  
                    buton1.setLocation(eksen6[2], 450);
                    buton1.setIcon(bulb.getIc());
                }
                bulb.setKullanim(1);
            }
        });
        }
        else
        {
            buton1.addMouseListener(new MouseAdapter() {
                @Override
            public void mouseClicked(MouseEvent e) {
            if (k >= 150 && k < 331) {
                    
                    buton1.setLocation(eksen6[0], 105);
                    buton1.setIcon(bulb.getIc());
                }
                if (k >= 331 && k < 512) {
                   
                    buton1.setLocation(eksen6[1], 105);
                    buton1.setIcon(bulb.getIc());
                }
                if (k >= 512 && k <= 750) {
                  
                    buton1.setLocation(eksen6[2], 105);
                    buton1.setIcon(bulb.getIc());
                }
            }
            });
        }
        if(butter.getKullanim()==0)
        {
            buton2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (k >= 150 && k < 331) {
                   
                    buton2.setLocation(eksen6[0], 450);
                    buton2.setIcon(butter.getIc());
                }
                if (k >= 331 && k < 512) {
                   
                    buton2.setLocation(eksen6[1], 450);
                    buton2.setIcon(butter.getIc());
                }
                if (k >= 512 && k <= 750) {
                    
                    buton2.setLocation(eksen6[2], 450);
                    buton2.setIcon(butter.getIc());
                }
                butter.setKullanim(1);
            }
        });
        }
        else
        {
            buton2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            if (k >= 150 && k < 331) {
                   
                    buton2.setLocation(eksen6[0], 105);
                    buton2.setIcon(butter.getIc());
                }
                if (k >= 331 && k < 512) {
                   
                    buton2.setLocation(eksen6[1], 105);
                    buton2.setIcon(butter.getIc());
                }
                if (k >= 512 && k <= 750) {
                    
                    buton2.setLocation(eksen6[2], 105);
                    buton2.setIcon(butter.getIc());
                }
            }
            });
        }
        if(charman.getKullanim()==0)
        {
            buton3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (k >= 150 && k < 331) {
                   
                    buton3.setLocation(eksen6[0], 450);
                    buton3.setIcon(charman.getIc());
                }
                if (k >= 331 && k < 512) {
                
                    buton3.setLocation(eksen6[1], 450);
                    buton3.setIcon(charman.getIc());
                }
                if (k >= 512 && k <= 750) {
                   
                    buton3.setLocation(eksen6[2], 450);
                    buton3.setIcon(charman.getIc());
                }
             charman.setKullanim(1);
            }
        });
        }
        else
        {
            buton3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
             if (k >= 150 && k < 331) {
                   
                    buton3.setLocation(eksen6[0], 105);
                    buton3.setIcon(charman.getIc());
                }
                if (k >= 331 && k < 512) {
                
                    buton3.setLocation(eksen6[1], 105);
                    buton3.setIcon(charman.getIc());
                }
                if (k >= 512 && k <= 750) {
                   
                    buton3.setLocation(eksen6[2], 105);
                    buton3.setIcon(charman.getIc());
                }
            }
            });
        }
        if(jiggly.getKullanim()==0)
        {
            buton4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (k >= 150 && k < 331) {
                   
                    buton4.setLocation(eksen6[0], 450);
                    buton4.setIcon(jiggly.getIc());
                }
                if (k >= 331 && k < 512) {
                    
                    buton4.setLocation(eksen6[1], 450);
                    buton4.setIcon(jiggly.getIc());
                }
                if (k >= 512 && k <= 750) {
                   
                    buton4.setLocation(eksen6[2], 450);
                    buton4.setIcon(jiggly.getIc());
                }
                jiggly.setKullanim(1);
            }
        });
        }
        else
        {
             buton4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (k >= 150 && k < 331) {
                   
                    buton4.setLocation(eksen6[0], 105);
                    buton4.setIcon(jiggly.getIc());
                }
                if (k >= 331 && k < 512) {
                    
                    buton4.setLocation(eksen6[1], 105);
                    buton4.setIcon(jiggly.getIc());
                }
                if (k >= 512 && k <= 750) {
                   
                    buton4.setLocation(eksen6[2], 105);
                    buton4.setIcon(jiggly.getIc());
                }
            }
             });
        }
        if(meowth.getKullanim()==0)
        {
            buton6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (k >= 150 && k < 331) {
                    
                    buton6.setLocation(eksen6[0], 450);
                    buton6.setIcon(meowth.getIc());
                }
                if (k >= 331 && k < 512) {
                   
                    buton6.setLocation(eksen6[1], 450);
                    buton6.setIcon(meowth.getIc());
                }
                if (k >= 512 && k <= 750) {
                   
                    buton6.setLocation(eksen6[2], 450);
                    buton6.setIcon(meowth.getIc());
                }
              meowth.setKullanim(1);
            }
        });
        }
        else
        {
            buton6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
              if (k >= 150 && k < 331) {
                    
                    buton6.setLocation(eksen6[0], 105);
                    buton6.setIcon(meowth.getIc());
                }
                if (k >= 331 && k < 512) {
                   
                    buton6.setLocation(eksen6[1], 105);
                    buton6.setIcon(meowth.getIc());
                }
                if (k >= 512 && k <= 750) {
                   
                    buton6.setLocation(eksen6[2], 105);
                    buton6.setIcon(meowth.getIc());
                }
            }
            });
        }
       if(psyduck.getKullanim()==0)
       {
           buton7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (k >= 150 && k < 331) {
                   
                    buton7.setLocation(eksen6[0], 450);
                    buton7.setIcon(psyduck.getIc());
                }
                if (k >= 331 && k < 512) {
                   
                    buton7.setLocation(eksen6[1], 450);
                    buton7.setIcon(psyduck.getIc());
                }
                if (k >= 512 && k < 750) {
                   
                    buton7.setLocation(eksen6[2], 450);
                    buton7.setIcon(psyduck.getIc());
                }
                psyduck.setKullanim(1);
            }
        });
       }
        else
       {
           buton7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
             if (k >= 150 && k < 331) {
                   
                    buton7.setLocation(eksen6[0], 105);
                    buton7.setIcon(psyduck.getIc());
                }
                if (k >= 331 && k < 512) {
                   
                    buton7.setLocation(eksen6[1], 105);
                    buton7.setIcon(psyduck.getIc());
                }
                if (k >= 512 && k < 750) {
                   
                    buton7.setLocation(eksen6[2], 105);
                    buton7.setIcon(psyduck.getIc());
                }
            }
           });
       }
       if(snorlax.getKullanim()==0)
       {
            buton8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (k >= 150 && k < 331) {
                  
                    buton8.setLocation(eksen6[0], 450);
                    buton8.setIcon(snorlax.getIc());
                }
                if (k >= 331 && k < 512) {
                    
                    buton8.setLocation(eksen6[1], 450);
                    buton8.setIcon(snorlax.getIc());
                }
                if (k >= 512 && k <= 750) {
                    
                    buton8.setLocation(eksen6[2], 450);
                    buton8.setIcon(snorlax.getIc());
                }
              snorlax.setKullanim(1);
            }
        });
       }
       else
       {
           buton8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            if (k >= 150 && k < 331) {
                  
                    buton8.setLocation(eksen6[0], 105);
                    buton8.setIcon(snorlax.getIc());
                }
                if (k >= 331 && k < 512) {
                    
                    buton8.setLocation(eksen6[1], 105);
                    buton8.setIcon(snorlax.getIc());
                }
                if (k >= 512 && k <= 750) {
                    
                    buton8.setLocation(eksen6[2], 105);
                    buton8.setIcon(snorlax.getIc());
                }
            }
           });
       }
       if(squirtle.getKullanim()==0)
       {
            buton9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (k >= 150 && k < 331) {
                    
                    buton9.setLocation(eksen6[0], 450);
                    buton9.setIcon(squirtle.getIc());
                }
                if (k >= 331 && k < 512) {
                    
                    buton9.setLocation(eksen6[1], 450);
                    buton9.setIcon(squirtle.getIc());
                }
                if (k >= 512 && k < 750) {
                   
                    buton9.setLocation(eksen6[2], 450);
                    buton9.setIcon(squirtle.getIc());
                }
               squirtle.setKullanim(1);
            }
        });
       }
       else
       {
           buton9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
             if (k >= 150 && k < 331) {
                    
                    buton9.setLocation(eksen6[0], 105);
                    buton9.setIcon(squirtle.getIc());
                }
                if (k >= 331 && k < 512) {
                    
                    buton9.setLocation(eksen6[1], 105);
                    buton9.setIcon(squirtle.getIc());
                }
                if (k >= 512 && k < 750) {
                   
                    buton9.setLocation(eksen6[2], 105);
                    buton9.setIcon(squirtle.getIc());
                }
            }
           });
       }
       if(zubat.getKullanim()==0)
       {
           buton10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (k >= 150 && k < 331) {
                    
                    buton10.setLocation(eksen6[0], 450);
                    buton10.setIcon(zubat.getIc());
                }
                if (k >= 331 && k < 512) {
                    
                    buton10.setLocation(eksen6[1], 450);
                    buton10.setIcon(zubat.getIc());
                }
                if (k >= 512 && k <= 750) {
                   
                    buton10.setLocation(eksen6[2], 450);
                    buton10.setIcon(zubat.getIc());
                }
                zubat.setKullanim(1);
            }
        });
       }
        else
       {
           
           buton10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            if (k >= 150 && k < 331) {
                    
                    buton10.setLocation(eksen6[0], 105);
                    buton10.setIcon(zubat.getIc());
                }
                if (k >= 331 && k < 512) {
                    
                    buton10.setLocation(eksen6[1], 105);
                    buton10.setIcon(zubat.getIc());
                }
                if (k >= 512 && k <= 750) {
                   
                    buton10.setLocation(eksen6[2], 105);
                    buton10.setIcon(zubat.getIc());
                }
            }
           });
       }

    }
}
