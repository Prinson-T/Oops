public class MultidimensionalArrays {
    public static void main(String[] args) {
        int number[][]={{1,4,8},{9,6,3},{7,1,0}};
        for (int i=0;i<number.length;i++){
            for (int j=0;j<number[i].length;j++){
                System.out.print(number[i][j]);
            }
            System.out.println();
        }
    }
}
