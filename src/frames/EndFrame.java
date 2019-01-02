package frames;

import actions.ButtonPress;
import actions.EndButtonPress;
import media.Pictures;
import panels.MakeButton;

import javax.swing.*;
import java.awt.*;

public class EndFrame extends JFrame {

    private Pictures IMG = new Pictures();
    JPanel panel = new JPanel();
    JButton endButton = new JButton();
    JButton restartButton = new JButton();


    public EndFrame(String name){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(name);
//        setSize(600,300 );
        add(new MakeButton(this,panel ,endButton ,IMG.getDeadstarImage() ,"END GAME" , 110, 60));
        endButton.addActionListener(new EndButtonPress());
        add(new MakeButton(this, panel, restartButton,IMG.getStarImage() ,"RESTART" ,110 , 60));
        restartButton.addActionListener(new ButtonPress(this));
        add(panel, BorderLayout.CENTER);
        setLocationRelativeTo(null);
        pack();
        setIconImage(IMG.getEnemy2Image());
        setVisible(true);


    }


}
