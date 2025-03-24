import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter fWriter = new FileWriter("D:\\hello\\s.txt");
            fWriter.write("i am prinson i am batman HAHAHAH");
            fWriter.close();
            System.out.println("content is successfully wrote to the file ");
        }catch (IOException e){
            System.out.println("can not working");
            e.printStackTrace();
        }
    }
}
