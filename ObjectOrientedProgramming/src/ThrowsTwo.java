import java.sql.PreparedStatement;

class res extends Exception{
    public res (String message){
        super(message);
    }
}
public class ThrowsTwo {
    void funFactor(int sum)throws res{
        for (int i=0;i<sum;i++){
            throw new res("This is for loop gays.......");
        }
    }
    public static void main(String[] args) {
        ThrowsTwo obj=new ThrowsTwo();
        try {
            obj.funFactor(10);
        }catch (res ds){
            System.out.println("Caught the exception");
            System.out.println(ds.getMessage());
        }

    }
}
