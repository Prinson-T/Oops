import java.io.File;

public class JavaInfo {
    public static void main(String[] args) {
        File obj = new File("D:\\hello\\java.txt");
        if (obj.exists()){
            System.out.println("The name of the file "+obj.getName());
            System.out.println("the absolute path of the file"+obj.getAbsolutePath());
            System.out.println("is file writable ?"+obj.canWrite());
            System.out.println("is file readable"+obj.canRead());
            System.out.println("the size of the file in bytes is :"+obj.length());
        }else {
            System.out.println("this is not working");
        }
    }
}
