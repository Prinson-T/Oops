class Grandparent{
    void print(){
        System.out.println("Adarsh Grandmother");
    }
}
class parent extends Grandparent{
    void printparent(){
        System.out.println("Adarsh parents");
    }
}
class Child extends parent{
    void printchild(){
        System.out.println("The child  Adarsh ");
    }
}
public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        Child c=new Child();
        c.print();
        c.printparent();
        c.printchild();

    }
}
