/**
 * Created by startyaya on 2/2/17.
 */
//有符号和无符号的右移为什么一样啊？
public class E12 {
    public static void main(String[] args){
        int a = 0xf;
        System.out.println(Integer.toBinaryString(a));
        a <<= 1;
        System.out.println(Integer.toBinaryString(a));
        for(int i =0;i<4;i++){
            a >>=1 ;
            System.out.println(Integer.toBinaryString(a));
        }
    }
}
