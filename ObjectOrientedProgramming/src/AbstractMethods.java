class hel{
    final void mo(){
        System.out.println("adipoli");
    }
}
class honda extends hel{
    void mo(){
        System.out.println("munji");
    }
}
public class AbstractMethods {
    public static void main(String[] args) {
        honda m=new honda();
        m.mo();

    }
}
