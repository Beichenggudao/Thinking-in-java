/**
 * Created by startyaya on 2/2/17.
 */
//别名问题
public class E02 {
    static void f(Num n){
        n.num =20;
    }

    public static void main(String[] args){
        Num a = new Num();
        a.num = 30;

        System.out.println("a = "+ a.num );
        f(a);
        System.out.println("a = "+ a.num );

    }
}
