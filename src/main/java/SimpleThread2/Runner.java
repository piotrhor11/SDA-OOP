package SimpleThread2;

public class Runner {

    public static void main(String[] args) {    //ToDo Do poprawy!

        Task tasks[] = new Task[10];
        Thread threads[] = new Thread[10];

        for (int i = 0; i < 10; i++) {
            tasks[i] = new Task(i);
        }

        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(tasks[i]);
        }

        for (int i = 0; i < 10; i++) {
            threads[i].run();
        }

    }
}
