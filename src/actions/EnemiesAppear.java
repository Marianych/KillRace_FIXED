package actions;

import objects.Enemy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EnemiesAppear   implements Runnable{

 public static   List<Enemy> enemies = new ArrayList<>();

    @Override
    public void run() {

        while(true) {
            Random rand = new Random();
            try {
                Thread.sleep(rand.nextInt(2000));
                enemies.add(new Enemy());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }



//            for (Enemy e:enemies){
//                if (e.x>2400|| e.x<=-400 || e.y<=MainPanel.p1.MAX_TOP || e.y>=MainPanel.p1.bottom)
//                    enemies.remove(e);
//            }

        }

    }
}
