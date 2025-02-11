public class Polymorphism {
    public void add (int a,int b){
        System.out.println("addition ="+a*b);
    }
    public void add(int a,int b,int c){
        System.out.println("multiply number2 ="+a*b*c);
    }

    public static void main(String[] args) {
        Polymorphism num=new Polymorphism();
        num.add(5,2);
        num.add(8,6,10);
    }
}
