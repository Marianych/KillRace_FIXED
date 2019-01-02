package actions;

import frames.EndFrame;

import static actions.ButtonPress.newGame;

public class endThread implements Runnable {
    @Override
    public void run() {
        newGame.stop();
        new EndFrame("FINISH HIM");
    }
}
