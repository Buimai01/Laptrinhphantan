package Tuan3;

public class TestBT1 {
    public static void main(String[] args) throws InterruptedException {
        NumberGenerator_BT1 numberGeneratorBt12 = new NumberGenerator_BT1();
        BT1 bt11 = new BT1();

        bt11.join(1000);

        //bt11.setPriority(Thread.MAX_PRIORITY);
        //numberGeneratorBt12.setPriority(Thread.MAX_PRIORITY);

        bt11.start();
        numberGeneratorBt12.start();

    }
}
