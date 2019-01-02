package media;

import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;

import javax.sound.sampled.*;
import java.io.IOException;

public class PlaySound {


//public void PlaySound(){
//    Clip c=null;
//    try {
//        c=AudioSystem.getClip();
//    } catch (LineUnavailableException e) {
//        e.printStackTrace();
//    }
//
//    c.close();
//}

    public void playFirst(){   playSound("res/kill/1firstblood.wav",0);    }
    public void playSecond(){   playSound("res/kill/2doublekill.wav",0);    }
    public void playThird(){   playSound("res/kill/3triplekill.wav",0);    }
    public void playFourth(){   playSound("res/kill/4ultrakill.wav",0);    }
    public void playFifth(){   playSound("res/kill/5rampage.wav",0);    }
    public void playBG(){   playSound("res/bg.wav",5);    }
    public void playPress(){   playSound("res/press.wav",0);    }
    public void playPlay(){   playSound("res/play.wav",0);    }
    public void playUnstoppable(){   playSound("res/kill/unstoppable.wav",0);    }
    public void playBOOM(){   playSound("res/kill/BOOM.wav",0);    }





    private void playSound(String path,int loop) {

        Clip c = null;
        try {
            c = AudioSystem.getClip();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }
        AudioInputStream ais = null;
        try {
            ais = AudioSystem.getAudioInputStream(getClass().getClassLoader().getResource(path));
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            c.open(ais);
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        c.loop(loop);




    }




}
