import java.io.File;
import java.io.IOException;

public class JavaFile {
    public static void main(String[] args) {
        try {
            File obj =new File("D:\\hello\\java.txt");
            if (obj.createNewFile()){
                System.out.println("file"+obj.getName()+"is created successfully");
            }else {
                System.out.println(" File is already exist in the directory.");            }
        }catch (IOException j){
            System.out.println(" An unexpected error is occurred");
            j.printStackTrace();
        }
    }
}
