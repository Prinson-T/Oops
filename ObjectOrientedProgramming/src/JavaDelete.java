import java.io.File;

public class JavaDelete {
    public static void main(String[] args) {
        File obj = new File("D:\\hello\\java.txt");
        if (obj.delete()){
            System.out.println("File deleted");
        }else {
            System.out.println("not Deleted");
        }
    }
}
