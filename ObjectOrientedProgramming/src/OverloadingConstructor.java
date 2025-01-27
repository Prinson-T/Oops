public class OverloadingConstructor {
    int id;
    String name;
    int age;
    OverloadingConstructor(int i,String n){
        id = i;
        name = n;
    }
    OverloadingConstructor(int i,String n,int a){
        id =i;
        name = n;
        age =a;
    }
     void display(){
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args) {
        OverloadingConstructor a1=new OverloadingConstructor(252,"prinson");
        OverloadingConstructor a2=new OverloadingConstructor(225,"adarsh",2520);
      a1.display();
    }
}
