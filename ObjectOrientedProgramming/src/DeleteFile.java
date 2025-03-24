import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File fo = new File("D:\\hello\\s.txt");
            if (fo.delete()){
                System.out.println("deleted");
            }else {
                System.out.println("not deleted");
            }
    }
}
