package Tuan3;

public class TestThread {
    public static void main(String[] args) throws InterruptedException {
        EvenThread evenThread1 = new EvenThread();
        OldThread oldThread1 = new OldThread();

        oldThread1.join(3000);

        oldThread1.start();
        evenThread1.start();
    }
}
