package SimpleThread2;

public class Task implements Runnable {

    private String[] name = new String[]{"Kuba", "Marcin", "Maciek", "Maria", "Lukasz", "Janek", "Darek", "Paweł", "Wojtek", "Damian"};
    private int index;

    public Task(int index) {
        this.index = index;
    }

    @Override
    public void run() {
        for (int j = 0; j < 5; j++) {
            System.out.printf("To ja %s_%d\n", name[index], j);
            try {
                Thread.sleep(1250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
