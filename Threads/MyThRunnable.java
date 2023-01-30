public class MyThRunnable implements Runnable{
    @Override
    public synchronized void run(){
        System.out.println("Sono il runnable");
    }
}