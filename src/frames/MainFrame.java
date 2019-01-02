package frames;

import media.Pictures;
import panels.MainPanel;

import javax.swing.*;
//import static panels.MainPanel.counter;

public class MainFrame extends JFrame  {

   public static JFrame frame;

    public MainFrame(String name) {

        frame=this;

        add(new MainPanel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(IMG.getRoadImage().getWidth(null),IMG.getRoadImage().getHeight(null)+40);
        setTitle(name);
        setLocationRelativeTo(null);
//        pack();
        setIconImage(IMG.getIconImage());
        setVisible(true);



    }
    Pictures IMG = new Pictures();
}

