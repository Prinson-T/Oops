import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
    public static void main(String[] args) {
        try {
            InputStream inputStream = new FileInputStream("D:\\hello\\java.txt");
            int byteData;
            while ((byteData = inputStream.read())!=-1){
                System.out.println("Byte(as integer):"+byteData);
                System.out.println("Character(as char):"+(char)byteData);
            }
            inputStream.close();
        }catch (IOException s){
            s.printStackTrace();
        }
    }
}
