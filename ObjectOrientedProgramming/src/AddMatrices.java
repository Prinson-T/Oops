public class AddMatrices {
    public static void main(String[] args) {

        int a[][]={{2,2,2},{5,5,5},{6,6,6}};
        int c[][]=new int[3][3];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){

            }
        }
        int b[][]={{2,2,2},{5,5,5},{8,8,8}};
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){

            }
        }
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]);
            }
            System.out.println();
        }
    }
}
