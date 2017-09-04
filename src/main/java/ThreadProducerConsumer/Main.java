package ThreadProducerConsumer;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        final Processor proc = new Processor();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    proc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    proc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        //ToDo
        t1.start();         //.start() uruchamia run() w osobnym wątku, .run() odpaliłby to w głównym.
        t2.start();
        t1.join();
        t2.join();

    }

}
