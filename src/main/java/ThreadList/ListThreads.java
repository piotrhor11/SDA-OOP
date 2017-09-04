package ThreadList;

import java.util.ArrayList;
import java.util.Random;

public class ListThreads implements Runnable {

    private ArrayList<Integer> _stageOne = new ArrayList<>();
    private ArrayList<Integer> _stageTwo = new ArrayList<>();

    private Random rand = new Random();

    public synchronized void stageOne() throws InterruptedException {
        _stageOne.add(rand.nextInt());
        Thread.sleep(1);
    }

    public synchronized void stageTwo() throws InterruptedException {
        _stageTwo.add(rand.nextInt());
        Thread.sleep(1);
    }

    public void process() throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            stageOne();
            stageTwo();
        }
    }

    @Override
    public void run() {
        try {
            process();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
