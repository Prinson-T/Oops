public class MultiRunnable implements Runnable {
    public void  run(){
        System.out.println("thread is running...");
    }
    public static void main(String[] args) {
        MultiRunnable m=new MultiRunnable();
        Thread t=new Thread(m);
        t.start();

    }
}
