public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int arr[]={1,2,5,8};
            System.out.println(arr[2]);
        }catch (ArrayIndexOutOfBoundsException d){
            System.out.println(d);
        }
        System.out.println("rest of code ");
    }
}
