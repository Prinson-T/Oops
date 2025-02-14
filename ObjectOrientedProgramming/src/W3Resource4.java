class sports{
    public void play(){
        System.out.println("Most Famous Game's");
    }
}
class Rugby extends sports{
    public void play(){
        System.out.println("World Famous Game Is Rugby");
    }
}
class Basketball extends sports{
    public void play(){
        System.out.println("No Way Basketball Is The Famous Game ");
    }
}
class Football extends sports{
    public void play(){
        System.out.println("Oh May God.....! Yor are losers. All People Love Me I Am The World Famous Game All time");
    }
}
public class W3Resource4 {
    public static void main(String[] args) {
        sports s=new sports();
        Rugby r=new Rugby();
        Basketball b=new Basketball();
        Football f=new Football();
        s.play();
        r.play();
        b.play();
        f.play();
    }
}
