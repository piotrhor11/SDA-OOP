package SimpleThread;

public class MyRun implements Runnable {

    private int _id;

    public MyRun(int id) {
        _id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.printf("Hello from thread id %d\n", _id);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 4) {
                System.out.printf("Thread number %d finished.\n", _id);
            }
        }
    }
}
