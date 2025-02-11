class vehicle{
    public void speedUp(){
        System.out.println("Ready TO Race");
    }
}
class Bmw extends vehicle{
    public void speedUp(){
        System.out.println("Car win the race");
    }
}
class RoyalEnfield extends vehicle{
    public void speedUp(){
        System.out.println("No Way the Enfield won The Race");
    }
}
public class W3Resource3 {
    public static void main(String[] args) {
        vehicle v=new vehicle();
        Bmw b=new Bmw();
        RoyalEnfield r=new RoyalEnfield();
        v.speedUp();
        b.speedUp();
        r.speedUp();
    }
}
