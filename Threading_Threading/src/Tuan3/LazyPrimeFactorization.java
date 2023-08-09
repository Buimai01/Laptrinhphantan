package Tuan3;

import java.util.Scanner;

public class LazyPrimeFactorization implements Runnable{
    @Override
    public void run() {
        int number = 2;
        while (true) {
            if (isPrime(number)) {
                System.out.println(number);
            }
            number++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                 e.printStackTrace();
            }
        }
    }
    private boolean isPrime(int number) {
        if (number <2) {
            return false;
        }
        for (int i = 2; i <=Math.sqrt(number) ; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
         Thread lazyPrimeThread = new Thread(lazyPrimeFactorization);
         lazyPrimeThread.start();
    }
}
