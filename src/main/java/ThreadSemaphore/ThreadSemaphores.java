package ThreadSemaphore;

public class ThreadSemaphores {

    private Object stageOneLocker = new Object();
    private Object stageTwoLocker = new Object();

    public void stageOne() throws InterruptedException {
        synchronized (stageOneLocker) {
            Thread.sleep(1);
//            listOne.add(rand.nextInt());
        }
    }


}
