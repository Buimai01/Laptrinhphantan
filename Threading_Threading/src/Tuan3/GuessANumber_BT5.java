package Tuan3;

import java.util.Scanner;

import static java.lang.Character.getName;

public class GuessANumber_BT5 implements Runnable{
    private int guessNumber = 0;
    private int count = 0;

    public GuessANumber_BT5(int guessNumber) {
        this.guessNumber = guessNumber;
    }
    @Override
    public void run() {
        int randomNumber = 0;
        do {
            randomNumber = (int) (Math.random() * 100 +1);
            count++;
            System.out.println(getName(guessNumber) + " đoán số " + randomNumber);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                 e.printStackTrace();
            }
        }
        while (randomNumber !=guessNumber);
        System.out.println(getName(randomNumber) + " đã đoán ra số " + guessNumber + " trong " + count + " lần  ");
    }
}
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập một số nguyên để các thread đoán: ");
        int number = sc.nextInt();

        GuessANumber_BT5 guessANumberBt5 = new GuessANumber_BT5(number);
        Thread guessNumberThread1 = new Thread(guessANumberBt5);

        GuessANumber_BT5 guessANumberBt51 = new GuessANumber_BT5(number);
        Thread guessNumberThread2 = new Thread(guessANumberBt51);

        Thread.currentThread().getName();
        Thread.currentThread().getName();

        guessNumberThread1.start();
        guessNumberThread2.start();

    }
}