class shape{
    public int  getArea(){
        return 0;

    }
}
class rectangle extends shape{
   int  length,width;
   rectangle(int length,int  width){
       this.length=length;
       this.width=width;

    }
    public int getArea(){
       return length*width;
    }
}
public class Class {
    public static void main(String[] args) {
        rectangle rect=new rectangle(5,3);
        System.out.println("Area :"+rect.getArea());
    }

}
