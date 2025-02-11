abstract class person{
    public abstract void jail();
    public void sleep(){
        System.out.println("ZZZ.....");
    }
}
class tvm extends person{
    public void jail(){
        System.out.println("The man out of the sell");
    }
}
public class Abstract {
    public static void main(String[] args) {
        tvm d=new tvm();
        d.jail();
        
    }
}
