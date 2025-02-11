final class pr{
    public void honda(){
        System.out.println("hondaaaaa....");
    }
}
class en extends pr{
    public void honda1(){
        System.out.println("hahahah");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        pr n=new pr();
        en b=new en();
        n.honda();
        b.honda1();

    }
}
