package media;

import javax.swing.*;
import java.awt.*;

public class Pictures {

    public Image getRoadImage() {
        return road;
    }

    public Image getPlayerImage() {
        return player;
    }

    public Image getPlayerLImage() {
        return playerL;
    }

    public Image getPlayerRImage() {
        return playerR;
    }

    public Image getIconImage() {
        return icon;
    }

    public Image getStartImage() {
        return start;
    }

    public Image getStarImage() {
        return star;
    }

    public Image getDeadstarImage() {
        return deadstar;
    }

    public Image getEnemy2Image() { return enemy2;}




    Image star = new ImageIcon(getClass().getClassLoader().getResource("res/star.png")).getImage();
    Image deadstar = new ImageIcon(getClass().getClassLoader().getResource("res/deadstar.png")).getImage();
    Image start = new ImageIcon(getClass().getClassLoader().getResource("res/start.png")).getImage();
    Image road = new ImageIcon(getClass().getClassLoader().getResource("res/road.jpg")).getImage();
    Image player = new ImageIcon(getClass().getClassLoader().getResource("res/player.png")).getImage();
    Image playerL = new ImageIcon(getClass().getClassLoader().getResource("res/playerLeft.png")).getImage();
    Image playerR = new ImageIcon(getClass().getClassLoader().getResource("res/playerRight.png")).getImage();
    Image enemy2 = new ImageIcon(getClass().getClassLoader().getResource("res/enemy2.png")).getImage();

    Image icon = new  ImageIcon(getClass().getClassLoader().getResource("res/redCar.png")).getImage();




}
