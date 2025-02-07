class cow{
    String name,color;
    public cow(String name,String color){
        this.color=color;
        this.name=name;
    }
}
public class W3Resource {
    public static void main(String[] args) {
        cow c=new cow("ammu pazhu","white");
        System.out.println("name "+c.name );
        System.out.println(" color "+c.color);
    }
}
