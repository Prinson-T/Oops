 class personD{
    private String name;

    public String getPerson(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
}
public class MyMain {
    public static void main(String[] args) {
        personD p=new personD();
        p.setName("prinson");
        System.out.println("Name: "+p.getPerson());
        p.setName("ADARSH");
        System.out.println("Name :"+p.getPerson());
    }
}
