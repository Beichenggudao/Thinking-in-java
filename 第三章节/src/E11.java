/**
 * Created by startyaya on 2/2/17.
 */
public class E11 {
    public static void main(String[] args){
        int a = 0x9;
        System.out.println(Integer.toBinaryString(a));
        for(int i =0;i<4;i++){
            a >>=1 ;
            System.out.println(Integer.toBinaryString(a));
        }
    }
}
