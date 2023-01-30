public class MyThread extends Thread{
    @Override
    public synchronized void run(){
        System.out.println("Sono il thread");
    }
}