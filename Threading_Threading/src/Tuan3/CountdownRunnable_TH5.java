package Tuan3;

public class CountdownRunnable_TH5 implements Runnable{
    @Override
    public void run() {
        for (int i = 15; i >=12 ; i--) {
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                 e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        CountdownRunnable_TH5 countdownRunnableTh5 = new CountdownRunnable_TH5();
        Thread countdownThread = new Thread(countdownRunnableTh5);
        countdownThread.start();
    }
}
