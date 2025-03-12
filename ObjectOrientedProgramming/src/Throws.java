class InvalidProductException extends java.lang.Exception{
    public InvalidProductException(String s){
        super(s);
    }
}
class Example{
    void productCheck(int weight)throws InvalidProductException{
        if (weight<100){
            throw new InvalidProductException("product invalid");
        }
    }
}
public class Throws {
    public static void main(String[] args) {
        Example g=new Example();
        try {
            g.productCheck(60);
        }catch (InvalidProductException es){
            System.out.println("Caught the exception");
            System.out.println(es.getMessage());
        }

    }
}
