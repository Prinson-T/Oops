class Animal{
    void cat(){
        System.out.println("cat is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barking to Cat");
    }
}
public class Main {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.cat();
        d.bark();
    }
}
