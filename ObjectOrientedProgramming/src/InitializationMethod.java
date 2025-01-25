class meth{
    int id;
    String name;
    void InsertRecord(int r,String n){
        id=r;
        name=n;
    }
    void displayInformation(){
        System.out.println(id+" "+name);
    }
}
public class InitializationMethod {
    public static void main(String[] args) {
        meth r1=new meth();
        meth r2=new meth();
        r1.InsertRecord(111,"prinson");
        r2.InsertRecord(222,"adarsh");
        r1.displayInformation();
        r2.displayInformation();

    }
}
