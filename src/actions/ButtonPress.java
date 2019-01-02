package actions;

import frames.MainFrame;
import media.PlaySound;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static panels.MainPanel.endGame;

public class ButtonPress implements ActionListener {


    JFrame buttonsFrame;
    public static Thread newGame = new Thread(new gameThread());


    public ButtonPress(JFrame currentFrame){
        this.buttonsFrame=currentFrame;
    }

    PlaySound press = new PlaySound();

    @Override
    public void actionPerformed(ActionEvent e) {

        press.playPress();
        press.playPlay();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        buttonsFrame.dispose();


        newGame.start();
        endGame.interrupt();

//        Thread.currentThread().stop();

//        new MainFrame("Killers on the road");

    }
}
