abstract class vehicleB{
    abstract public void startEngine();
    abstract public void stopEngine();
    public void sleeps(){
        System.out.println("Zzzz...");
    }
}
class cars extends vehicleB{
    public void startEngine(){
        System.out.println("cars Engine on");
    }
    @Override
    public void stopEngine() {
        System.out.println("cars engine off");
    }
}
class motorcycle extends vehicleB{
    @Override
    public void startEngine() {
        System.out.println("motorcycle engine on");
    }
    public void stopEngine(){
        System.out.println("motorcycle engine off");
    }
}
public class W3Resource5 {
    public static void main(String[] args) {
        cars c=new cars();
        motorcycle m=new motorcycle();
        c.startEngine();
        c.stopEngine();
        m.sleeps();
        m.startEngine();
        m.stopEngine();
        c.sleeps();
    }
}
