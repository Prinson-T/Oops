public class SubtractMatrices {
    public static void main(String[] args) {
        int a[][]={{2,2,5},{8,8,8},{9,9,9}};
        int c[][]=new int[3][3];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){

            }
        }
        int b[][]={{5,5,2},{4,8,4},{6,6,9}};
        for (int i=0;i<b.length;i++){
            for (int j=0;j<a[i].length;j++){

            }
        }
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                c[i][j]=a[i][j]-b[i][j];
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
    }
}
