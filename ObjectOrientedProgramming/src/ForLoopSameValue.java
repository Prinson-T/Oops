public class ForLoopSameValue {
    public static void main(String[] args) {
        int a[]={1,2,5,5,2,7,8};
        for (int i=0;i<a.length;i++) {
            for (int j = i + 1; j < a.length; j++) {

                if(a[i] == a[j]){
                    System.out.println(a[i]);

                }
            }
        }

    }
}
