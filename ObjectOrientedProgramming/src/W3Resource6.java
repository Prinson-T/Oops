interface flyable{
    public void fly_obj();
}
class spacecraft implements flyable{
    @Override
    public void fly_obj() {
        System.out.println("run way");
    }
}
class airplane implements flyable{
    @Override
    public void fly_obj(){
        System.out.println("AIRPLANE fly in the sky");
    }
}
class helicopter implements flyable{
    @Override
    public void fly_obj(){
        System.out.println("helicopter ride to take off ");
    }
}
public class W3Resource6 {
    public static void main(String[] args) {
        spacecraft s=new spacecraft();
        airplane a=new airplane();
        helicopter h=new helicopter();
        s.fly_obj();
        a.fly_obj();
        h.fly_obj();
    }
}
