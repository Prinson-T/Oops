import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        File fo = new File("D:\\hello\\s.txt");
        if (fo.exists()){
            System.out.println("The name of the file "+fo.getName());
            System.out.println("the absolute path of the file"+fo.getAbsolutePath());
            System.out.println("is file writable ?"+fo.canWrite());
            System.out.println("is file readable"+fo.canRead());
            System.out.println("the size of the file in bytes is :"+fo.length());
        }else {
            System.out.println("this is not working");
        }
    }
}
