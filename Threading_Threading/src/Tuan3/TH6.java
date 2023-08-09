package Tuan3;

public class TH6 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread start");
    }

    public static void main(String[] args) {
        TH6 th6 = new TH6();
        th6.start();
        System.out.println(th6.getState());
    }
}
