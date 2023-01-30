public class Main{
    public static void main(String[] args) {
        MyThread myt = new MyThread();
        MyThRunnable mytr = new MyThRunnable();
        myt.start();
        new Thread(mytr).start();
    }
}