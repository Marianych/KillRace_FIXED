package actions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EndButtonPress implements ActionListener {


public EndButtonPress(){

}


    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
