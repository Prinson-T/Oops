public class Constructor {
    int id;
    String name;
    int age;
    Constructor(int i,String n){
        id=i;
        name=n;
    }
    Constructor(int i,String n,int a){
        id = i;
        name=n;
        age=a;


    }
    void display(){
        System.out.println(id+" "+name+" "+age);
    }

    public static void main(String[] args) {
            Constructor a=new Constructor(8,"prinson");
            Constructor b=new Constructor(20,"Adarsh",28);
            a.display();
            b.display();
    }
}
