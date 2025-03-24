import java.beans.Expression;
import java.io.FileOutputStream;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("D:\\hello\\java.txt");
            fout.write(85);
            fout.close();
            System.out.println("Success........");
        }catch (Exception s){
            System.out.println(s);
        }
    }
}
