public class TestFinallyBlock {
    public static void main(String[] args) {
        try {
            int a = 25/5;
            System.out.println(a);
        }catch (NullPointerException s){
            System.out.println(s);
        }
        finally {
            System.out.println("Finally block is always executed");
        }
        System.out.println("Rest of the code ");
    }
}
