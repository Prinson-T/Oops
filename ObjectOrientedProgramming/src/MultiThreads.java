public class MultiThreads extends Thread {
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        MultiThreads obj=new MultiThreads();
        obj.start();

    }
}
