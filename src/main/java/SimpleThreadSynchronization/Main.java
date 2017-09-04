package SimpleThreadSynchronization;

public class Main {

    public int counter;

    public synchronized void increment() {          //bez synchronized nie mamy zabezpieczenia i oba wątki mogą jednoczesnie modyfikować zmienną
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Main mm = new Main();
        mm.doWork();
    }

    public void doWork() throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    increment();
                }
            }
        });

        t1.run();
        t2.run();

        t1.join();
        t2.join();

        System.out.println(counter);
    }
}
