/**
 * Created by startyaya on 2/2/17.
 */
//模拟扔硬币的结果
public class E07 {
    public static void main(String[] args){
        java.util.Random random = new java.util.Random();
        boolean b = random.nextBoolean();
        boolean c = true;
        if(b==c){
            System.out.println("正面");
        }else {
            System.out.println("反面");
        }
    }
}
