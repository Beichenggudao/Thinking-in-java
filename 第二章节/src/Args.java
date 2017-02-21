import java.util.Scanner;

/**
 * Created by startyaya on 2/1/17.
 */
public class Args {


    public static void main(String[] args) {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        String i = sc.next();
        String j[] ={"1","2","3"};
        if(i.length()<3){
            System.out.println("Need 3 arguments");

        }else {
            System.out.println(j[0]);
            System.out.println(j[1]);
            System.out.println(j[2]);
        }
    }
}
