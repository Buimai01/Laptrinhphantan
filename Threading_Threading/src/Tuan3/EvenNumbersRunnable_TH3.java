package Tuan3;

public class EvenNumbersRunnable_TH3 implements  Runnable{
    @Override
    public void run() {
        for (int i = 2; i <=10 ; i+=2) {
            System.out.println(i);
        }
    }
}
class Main3{
    public static void main(String[] args) {
        EvenNumbersRunnable_TH3 evenNumbersRunnableTh3 = new EvenNumbersRunnable_TH3();
        Thread evenThread = new Thread(evenNumbersRunnableTh3);
        evenThread.start();
    }
}