import java.io.FileInputStream;
import java.io.IOException;

public class TwoLettersReadExample {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("D:\\hello\\java.txt");
            int firstByte=inputStream.read();
            int secondByte = inputStream.read();
            System.out.println("First byte (as integer):" +firstByte);
            System.out.println(" first byte (as char):"+(char)firstByte);
            System.out.println(" second byte (as char):"+secondByte);
            System.out.println(" second byte (as char):"+(char)secondByte);
            inputStream.close();
        }catch (IOException s){
            s.printStackTrace();
        }
    }
}
