import java.util.*;
/**
 * Created by startyaya on 2/1/17.
 */
public class E03 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String  m = n.next();
        while(true){
            Random r = new Random();
            for (int i = 0; i < 25; i++) {
                int a[] = new int[25];
                a[i] = r.nextInt();
                if (i == 0) {
                    System.out.print(a[i]);
                } else if (a[i - 1] < a[i]) {
                    System.out.print("<" + a[i]);
                } else if (a[i - 1] > a[i]) {
                    System.out.print(">" + a[i]);
                }
            }
        }
    }
}
