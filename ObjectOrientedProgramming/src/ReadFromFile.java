import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) {
        try {
            File fo = new File("D:\\hello\\s.txt");
            Scanner dataReader =new Scanner(fo);
            while (dataReader.hasNextLine()){
                String fileData = dataReader.nextLine();
                System.out.println(fileData);
            }
            dataReader.close();
        }catch (FileNotFoundException e){
            System.out.println("UnExcpected Error occurred ");
            e.printStackTrace();
        }
    }
}
