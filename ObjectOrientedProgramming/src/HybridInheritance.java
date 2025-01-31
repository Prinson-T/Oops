class animal{
    void ani(){
        System.out.println("animal run to the cave");
    }
}
class Dogs extends animal{
    void b(){
        System.out.println("i like car's");
    }
}
class car extends animal{
    void cars(){
        System.out.println("man like women but mens likes cars");
    }
}
class hybrid extends Dogs{
    void g(){
        System.out.println("we are venom");
    }

}
public class HybridInheritance {
    public static void main(String[] args) {
        hybrid all=new hybrid();

        all.ani();
        all.b();

        all.g();


    }
}
