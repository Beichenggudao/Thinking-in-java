/**
 * Created by startyaya on 2/1/17.
 */
public class E07 {
    static int a(boolean b){
        return 100;
    }
    public static void main(String[] args){
        for(int i =1;i<101;i++){
            if(i==100) break;
            System.out.println(i);
        }
        System.out.print(a(true));
    }
}
