 class CAR {
    int year;
    String model;
    String make;
    public CAR(){
        this.model="bmw m5";
        this.make="October";
        this.year=1984;
    }
    public CAR(String model,String make,int year){
        this.model=model;
        this.make=model;
        this.year=year;
    }
    public void displayDetails(){
        System.out.println("car :"+model);
        System.out.println("manufactured :"+make);
        System.out.println("in:"+year);
    }
}
public class W3Resource1 {
    public static void main(String[] args) {
        CAR c=new CAR();
        c.displayDetails();

    }
}
