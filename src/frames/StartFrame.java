package frames;

import actions.ButtonPress;
import media.Pictures;
import panels.MakeButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class StartFrame extends JFrame  {

    private Pictures IMG = new Pictures();
    JPanel panel1 = new JPanel();
    JButton startButton = new JButton();


    public StartFrame(String name){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle(name);
        add(new MakeButton(this,panel1,startButton,IMG.getStartImage(),null ,200,50));
        startButton.addActionListener(new ButtonPress(this));
        add(panel1,BorderLayout.NORTH);
                pack();
                setLocationRelativeTo(null);

        setIconImage(IMG.getIconImage());
        setVisible(true);


    }

}
