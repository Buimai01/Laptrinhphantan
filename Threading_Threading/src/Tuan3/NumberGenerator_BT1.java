package Tuan3;

public class NumberGenerator_BT1 extends Thread{
    @Override
    public void run() {
        for (int i = 10; i >=1 ; i--) {
            System.out.println("Number " + i ) ;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
