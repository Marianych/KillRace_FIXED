package objects;

import media.Pictures;
import panels.MainPanel;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import java.util.Random;

import static panels.MainPanel.IMG;


public class Enemy {

   public int x;
   public int y;

   private int w;
   private int h;

   private int v;

   private Image image;
   public int type=0;

    public Enemy() {

        Random rand = new Random();
        type = rand.nextInt(10);
        if (type == 1) {
            this.image = new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("res/enemy2.png"))).getImage();
        }
        else {
            this.image = new ImageIcon(Objects.requireNonNull(getClass().getClassLoader().getResource("res/enemy.png"))).getImage();
        }

        this.x = IMG.getRoadImage().getWidth(null);
        this.y = rand.nextInt(IMG.getRoadImage().getHeight(null));
        this.v = rand.nextInt(30);
        this.w = this.getImage().getWidth(null);
        this.h = this.getImage().getHeight(null);
    }

    public void move() {
        x = (x - MainPanel.p1.v) + 90 + v ;
    }

    public Image getImage() {
        return image;
    }

    public Rectangle rectangle() {
        return new Rectangle(this.x, this.y, image.getWidth(null), image.getHeight(null));
    }


}
