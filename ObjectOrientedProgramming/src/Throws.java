class InvalidException extends Exception{
    public InvalidException(String message){
        super(message);
    }
}
public class Throws {
    void product(int weight)throws InvalidException{
        if (weight<100){
            throw new InvalidException("product invalid");
        }
    }
    public static void main(String[] args) {
        Throws th=new Throws();
        try {
            th.product(220);
        }catch (InvalidException ex){
            System.out.println("Caught the exception");
            System.out.println(ex.getMessage());
        }

    }
}
