package Tuan3;

import java.util.Scanner;

public class GuessANumber_BT4 extends Thread {
    private int guessNumber = 0;
    private int count = 0;

    public GuessANumber_BT4 (int guessNumber) {
        this.guessNumber = guessNumber;
    }
    @Override
    public void run() {
        int randomNumber = 0;
        do {
            randomNumber = (int) (Math.random() * 100 + 1);
            count++;
            System.out.println(getName() + "Đoán số " + randomNumber);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            while (randomNumber != guessNumber) ;
            System.out.println(getName() + "Đã đoán ra số " + guessNumber + " trong " + count + " lần đếm");
        }
}
class TestBt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một số nguyên để các thread đoán: ");
        int number = sc.nextInt();

        GuessANumber_BT4 thread1 = new GuessANumber_BT4(number);
        GuessANumber_BT4 thread2 = new GuessANumber_BT4(number);

        thread1.setName("Thread 1 ");
        thread2.setName("Thraed 2 ");

        thread1.start();
        thread2.start();
    }
}

