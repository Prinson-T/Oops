public class TestJoinMethod  extends Thread {
  public void run(){
        for (int i=0;i<5;i++){
            try {
                Thread.sleep(500);
            }catch (Exception s){
                System.out.println(s);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        TestSleepMethod obj=new TestSleepMethod();
        TestSleepMethod obj1=new TestSleepMethod();
        TestSleepMethod obj2=new TestSleepMethod();
        obj.start();
        try {
            obj.join();
        }catch (Exception s){
        }
        obj1.start();
        obj2.start();
    }
}
