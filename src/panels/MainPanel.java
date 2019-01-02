package panels;

import actions.EnemiesAppear;
import actions.KeyboardPress;
import actions.endThread;
import frames.EndFrame;
import frames.MainFrame;
import media.Pictures;
import media.PlaySound;
import objects.Enemy;
import objects.Gamer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static frames.MainFrame.frame;
import static actions.ButtonPress.newGame;

public class MainPanel extends JPanel implements ActionListener {

    private Timer mainTimer = new Timer(25,this);
    private Thread enemiesAdd = new Thread(new EnemiesAppear());
    public static Thread endGame = new Thread(new endThread());
    private PlaySound background = new PlaySound();
    public static int counter=5;
    private int lives=0;
    private PlaySound kills = new PlaySound();




    public static Gamer p1 = new Gamer();


    public MainPanel(){
        enemiesAdd.start();
        mainTimer.start();
        background.playBG();
        addKeyListener(new KeyboardPress(p1));
        setFocusable(true);


    }

    public static Pictures IMG = new Pictures();

    int w=IMG.getStarImage().getWidth(null);
    int h=IMG.getStarImage().getHeight(null);

    public void paint (Graphics g) {
        g.drawImage(IMG.getRoadImage(), p1.getLayer1(), 0, null);
        g.drawImage(IMG.getRoadImage(), p1.getLayer2(), 0, null);
        g.drawImage(p1.getImgPlayer(), p1.getX(), p1.getY(), null);
//        g.setColor(Color.green);
//        Font font = new Font("Comic Sans MS", Font.BOLD,17);
//        g.setFont(font);
//        g.drawString("LIVES left "+counter, p1.getX(), p1.getY()-10);

       for (lives=0;lives<5;lives++){
           if (lives<counter){
            g.drawImage(IMG.getStarImage(),p1.getX()+w*lives , p1.getY()-h, null);}
            else { g.drawImage(IMG.getDeadstarImage(),p1.getX()+w*lives , p1.getY()-h, null);}

       }




        for (Enemy e: EnemiesAppear.enemies) {


            if (e.rectangle().intersects(p1.rectangle())) {
                EnemiesAppear.enemies.remove(e);
                if (e.type==1) {
                    if (counter<5){++counter;}
                    kills.playBOOM(); break;} else {--counter;}




                    if (counter==4){ kills.playFirst();} else
                    if (counter==3){ kills.playSecond();} else
                        if (counter==2) { kills.playThird();} else
                            if (counter==1){ kills.playFourth();} else
                                if (counter==0) { kills.playFifth();
                                } else {counter=5; kills.playUnstoppable();
                                    frame.dispose();
                                    mainTimer.stop();
                                    enemiesAdd.interrupt();

//                                    newGame.interrupt();

//                                    Thread.currentThread().stop();


//                                    new EndFrame("FINISH HIM");
//                                    newGame.interrupt();
                                    endGame.start();





                                }
            }

            if (e.x >= 2400 || e.x <= -400 || e.y <= p1.MAX_TOP || e.y >= p1.bottom) {
                EnemiesAppear.enemies.remove(e);
            }

        }

        for (Enemy enemy: EnemiesAppear.enemies) {
            g.drawImage(enemy.getImage(), enemy.x, enemy.y, null);
        }





//        Iterator<Enemy> i = EnemiesAppear.enemies.iterator();
//        while (i.hasNext()) {
//            Enemy e = i.next();
////            if (e.x >= 2400 || e.x <= -400 || e.y <= p1.MAX_TOP || e.y >= p1.bottom) {
////                i.remove();
////            } else {
//                e.move();
//
//                if (e.type == 1) {
//                    g.drawImage(IMG.getImage(), e.x, e.y, null);
//                } else {
//                    g.drawImage(IMG.getEnemy2Image(), e.x, e.y, null);
//                }
////            }
//        }






    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (Enemy move: EnemiesAppear.enemies){
            move.move();
        }

            p1.move();
        repaint();
    }
}
