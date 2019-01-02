package panels;

import actions.ButtonPress;

import javax.swing.*;
import java.awt.*;

public class MakeButton extends JPanel {


    public MakeButton(JFrame frame,JPanel panel, JButton button,Image icon,String label,int width, int height){

        panel.setSize(width,height);
        button.setIcon(new ImageIcon(icon));
        button.setLabel(label);
        button.setVerticalTextPosition(AbstractButton.BOTTOM);
        button.setHorizontalTextPosition(AbstractButton.CENTER);

        panel.add(button,BorderLayout.SOUTH);



    }



}
