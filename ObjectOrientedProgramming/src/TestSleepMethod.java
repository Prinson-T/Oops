public class TestSleepMethod extends Thread{
    public void run(){
        for (int i=0;i<=5;i++){
            try {
                Thread.sleep(1200);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestSleepMethod d=new TestSleepMethod();

        d.start();

    }

}
