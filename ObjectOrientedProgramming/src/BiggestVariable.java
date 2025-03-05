public class BiggestVariable {
    public static void main(String[] args) {
        int b[]={52,68,2,84};
        int max=b[0];
        for (int i=0;i<b.length;i++){
            if (b[i] < max){
                max = b[i];
                }
            }
        System.out.println(max);
    }
}
