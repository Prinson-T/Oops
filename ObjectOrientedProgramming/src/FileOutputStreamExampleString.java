import java.io.FileOutputStream;

public class FileOutputStreamExampleString {
    public static void main(String[] args) {
        try {
            FileOutputStream out =new FileOutputStream("D:\\hello\\java.txt");
            String s="welcome to java T point ";
            byte b[]=s.getBytes();
            out.write(b);
            out.close();
            System.out.println("Success.......");
        }catch (Exception s){
            System.out.println(s);
        }
    }
}
