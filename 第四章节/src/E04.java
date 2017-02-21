/**
 * Created by startyaya on 2/1/17.
 */
public class E04 {
    public static void main(String[]args){
        for(int i=100;i<=200;i++){
            boolean k =true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    k =false;
                }
            }
            if(k){
                System.out.println(i);
            }
        }
    }
}
