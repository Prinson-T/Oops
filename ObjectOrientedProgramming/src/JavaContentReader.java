import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaContentReader {
    public static void main(String[] args) {
        try {
            File obj = new File("D:\\hello\\java.txt");
            Scanner dataReader = new Scanner(obj);
            while (dataReader.hasNextLine()){
                String fileData = dataReader.nextLine();
                System.out.println(fileData);
            }
            dataReader.close();
        }catch (FileNotFoundException j){
            System.out.println("UnExcpected Error occurred ");
            j.printStackTrace();
        }
    }
}
