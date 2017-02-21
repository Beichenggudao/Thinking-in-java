/**
 * Created by startyaya on 2/1/17.
 */
public class E02 {
    public static void main(String[] args) {
        java.util.Random r = new java.util.Random(20);
        for (int i = 0; i < 25; i++) {
            int a[] = new int[25];
            a[i] = r.nextInt();
            if(i==0){
                System.out.print(a[i]);
            }else if(a[i-1]<a[i]){
                System.out.print("<"+a[i]);
            }else if(a[i-1]>a[i]){
                System.out.print(">"+a[i]);
            }
        }
    }
}
