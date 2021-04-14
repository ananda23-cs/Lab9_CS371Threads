package edu.up.cs301threadslab;

import java.util.Random;

public class StarAddRemoveThreadAnimation extends Thread implements Runnable {
    private StarAnimation starAnimation;

    public StarAddRemoveThreadAnimation(StarAnimation sa){
        this.starAnimation = sa;
    }

    @Override
    public void run() {
        while(true) {
            Random r = new Random();
            int action = 1 + r.nextInt(99);
            int changeStars = 1 + r.nextInt(20);
            if (action < 51) {
                for (int i = 0; i < changeStars; i++) {
                    this.starAnimation.addStar();
                }
            } else {
                for (int i = 0; i < changeStars; i++) {
                    this.starAnimation.removeStar();
                }
            }
            try {
                sleep(40);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
