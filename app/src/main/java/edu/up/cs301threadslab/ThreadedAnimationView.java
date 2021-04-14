package edu.up.cs301threadslab;

public class ThreadedAnimationView extends Thread implements Runnable {
    private AnimationView myView;

    public ThreadedAnimationView (AnimationView view){
        this.myView = view;
    }

    @Override
    public void run() {
        while(true){
            this.myView.postInvalidate();
            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
