class inter extends Exception{
    public inter (String message){
        super(message);
    }
}
public class JavaThrows {
    void positive(int num)throws inter{
        if (num<0){
            throw new inter("Number is Positive");
        }
    }
    public static void main(String[] args) {
        JavaThrows obj=new JavaThrows();
        try {
            obj.positive(10);
        }catch (inter px){
            System.out.println("Caught the exception");
            System.out.println(px.getMessage());
        }

    }
}
