package Tuan3;

import java.util.Random;

public class Car_TH1 implements Runnable{
    private static final int DISTANCE =100 ;
    private static final int STEP = 2;
    private String name;

    public Car_TH1(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        //khởi tạo điểm start( hay km ban đầu)
        int runDistance = 0;
        //khởi tạo time bắt đầu cuộc đua
        long startTime = System.currentTimeMillis();
        //Kiểm tra chừng nào còn xe chưa kết thúc quãng đường đua thì xe vẫn tiếp tục chạy
        while (runDistance < DISTANCE) {
            try {
                //random tốc độ km/h
                int speed = (new Random()).nextInt(20);
                //tĩnh khoảng cách đã đi được
                runDistance += speed;
                String log = " |";
                int percentTravel = (runDistance * 100) / DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEP) {
                    if (percentTravel >= i + STEP) {
                        log +="=";
                    } else if (percentTravel >= i && percentTravel < i+ STEP) {
                        log +=  "o";
                    }else {
                        log+= "-";
                    }
                }
                log += "|";
                System.out.println("Car" + this.name + ":" + log + " " + Math.min(DISTANCE, runDistance)+ "KM");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.printf("Car" +this.name + "broken...");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + "Finish in" + (endTime - startTime) / 1000 + "s");
    }

    public static void main(String[] args) {
       Car_TH1 car1 = new Car_TH1("1");
       Car_TH1 car2 = new Car_TH1("2");
       Car_TH1 car3 = new Car_TH1("3");

       Thread thread1 = new Thread(car1);
       Thread thread2 = new Thread(car2);
       Thread thread3 = new Thread(car3);

        System.out.println("Distance: 100km");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
