public class MatricesCopy {
    public static void main(String[] args) {
        int a[][]={{2,5,8,},{8,6,8},{4,5,6}};
        int c[][]=new int[3][3];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){

            }
        }
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                c[i][j]=a[i][j];
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
    }
}
