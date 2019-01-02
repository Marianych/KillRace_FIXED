package actions;

import objects.Gamer;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyboardPress extends KeyAdapter {
            Gamer p1;

            public KeyboardPress(Gamer p1){
                this.p1=p1;
            }
    public void keyPressed (KeyEvent e) { p1.keyPressed(e);}
    public void keyReleased (KeyEvent e) { p1.keyReleased(e);}

}
