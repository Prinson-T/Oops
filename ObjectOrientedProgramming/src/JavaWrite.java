import java.io.FileWriter;
import java.io.IOException;

public class JavaWrite {
    public static void main(String[] args) {
        try {
            FileWriter jWriter = new FileWriter("D:\\hello\\java.txt");
            jWriter.write("Java is a high-level, general-purpose, memory-safe, object-oriented programming language.");
            jWriter.close();;
            System.out.println("content is successfully wrote to the file ");
        }catch (IOException j){
            System.out.println("this is not working");
            j.printStackTrace();
        }
    }
}
