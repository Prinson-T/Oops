class num{
    void eat(){
        System.out.println("eating");
    }
}
class pri extends num{
    void cat(){
        System.out.println("cat run");
    }
}
class pro extends num{
    void dog(){
        System.out.println("dog barking");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        pri p=new pri();
        pro r=new pro();
        p.cat();
        r.dog();
        p.eat();

    }
}
