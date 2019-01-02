package actions;

import frames.MainFrame;

public class gameThread implements Runnable {
    @Override
    public void run() {



        new MainFrame("Killers on the road");

    }
}
