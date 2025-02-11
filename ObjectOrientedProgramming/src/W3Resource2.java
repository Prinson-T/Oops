class point{
    int x,y;
    double a,b;
    public point(int x,int y){
        this.x=x;
        this.y=y;
        System.out.println("X:"+x+ " y: "+y);
    }
    public point(double a,double b){
        this.a=a;
        this.b=b;
        System.out.println("A:"+a+ " B:"+b);
    }

}
public class W3Resource2 {
    public static void main(String[] args) {
        point p=new point(5,6);
        point c=new point(5.5,8.6);

    }
}
