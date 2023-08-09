package Tuan3;

public class OldThread extends Thread{
    @Override
    public  void run() {
        for (int i = 1; i <=10 ; i+=2) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        OldThread oldThread = new OldThread();
        oldThread.start();
    }
}
