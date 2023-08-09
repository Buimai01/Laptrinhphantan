package Tuan3;

public class CountdownThread_TH4 extends Thread{
    @Override
    public void  run() {
        for (int i = 10; i >=1 ; i--) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        CountdownThread_TH4 countdownThreadTh4 = new CountdownThread_TH4();
        countdownThreadTh4.start();
    }
}
