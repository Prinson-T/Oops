package PackC;

import Pack.A;

class B extends A{
    public static void main(String[] args) {
        B aas=new B();
        aas.oop();
//        The protected access modifier
    }
}
public class C {
    public static void main(String[] args) {
        A sp=new A();
        sp.sr();
//        default modifier
        A po=new A();
        po.prn();
    }
}
