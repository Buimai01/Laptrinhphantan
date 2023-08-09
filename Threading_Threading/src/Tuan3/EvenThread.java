package Tuan3;

public class EvenThread extends Thread{
    @Override
    public void run() {
        for (int i = 2; i <=10 ; i+=2) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                 e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        evenThread.start();
    }
}
