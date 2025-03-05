public class MatricesMultiplication {
    public static void main(String[] args) {
        int a[][]={{2,5,8,},{6,5,8},{5,2,3}};
        int c[][]=new int[3][3];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){

            }
        }
        int b[][]={{2,5,1},{2,3,2},{3,8,6}};
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){

            }
        }
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                c[i][j]=a[i][j]*b[i][j];
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
    }
}
