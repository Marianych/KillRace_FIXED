package objects;

import media.Pictures;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Gamer   {

    public static final int MAX_V = 120;
    public static final int MAX_TOP = 35;
    private static final Pictures IMG = new Pictures();


    int v = 0;
    int s = 0;
    int dv = 0;
    int x = 30;
    int y = 200;
    int dy = 0;
    int layer1=0;
    int layer2;
    int rightBorder;
    Image img=IMG.getPlayerImage();


    private Image UP;
    private Image DOWN;
    private Image STR;

    public int bottom = IMG.getRoadImage().getHeight(null)-140;

    public Gamer() {

        Pictures IMG = new Pictures();
        this.UP = IMG.getPlayerLImage();
        this.DOWN = IMG.getPlayerRImage();
        this.STR = IMG.getPlayerImage();

        rightBorder = IMG.getRoadImage().getWidth(null);
        layer2=rightBorder;


    }



    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLayer1() {
        return layer1;
    }

    public int getLayer2() {
        return layer2;
    }

    public Image getImgPlayer() {
        return img;
    }


public void move () {
    s +=s;
    v+=dv;
    y -= dy;
    if (v <= 0) v=0;
    if(v>=MAX_V) v=MAX_V;
    if (y<=MAX_TOP) y=MAX_TOP;
    if (y>=bottom) y=bottom;

    if (layer2 - v <= 0) {
        layer1 = 0;
        layer2 = rightBorder;
    } else {
        layer1 -= v;
        layer2 -= v;
    }
}


    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
          if (key == KeyEvent.VK_RIGHT) {
               dv = 1;
        }
        if (key == KeyEvent.VK_LEFT) {
        if (v > 0) {
            dv = -4;
            }
        }
        if (key == KeyEvent.VK_UP) {
        dy = 10;
        img=UP;
        }
        if (key == KeyEvent.VK_DOWN) {
        dy = -10;
        img=DOWN;
        }
    }


    public void keyReleased(KeyEvent e){

        int key=e.getKeyCode();
        if (key==KeyEvent.VK_RIGHT) {
            dv = -1;

        }
        if (key==KeyEvent.VK_LEFT){
            dv= 0;
        }
        if (key==KeyEvent.VK_UP){
            dy=0;
            img=STR;
        }
        if (key==KeyEvent.VK_DOWN){
            dy=0;
            img=STR;
        }

    }

    public Rectangle rectangle() {
        return new Rectangle(this.x, this.y, STR.getWidth(null), STR.getHeight(null));
    }

}

