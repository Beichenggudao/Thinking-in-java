/**
 * Created by startyaya on 2/2/17.
 */
// 吸血鬼数字
public class E10 {
    public static void main(String[] args){
        for(int i =1000;i<10000;i++){
            if(i%100!=0) {
                int q = i / 1000;
                int b = i / 100 % 10;
                int s = i / 10 % 10;
                int g = i % 10;
                if(  (10 * q + b)*(s * 10 + g)==i||(10 * q + b)*(g * 10 + s)==i
                   ||(10 * b + q)*(s * 10 + g)==i||(10 * b + q)*(g * 10 + s)==i
                   ||(10 * q + s)*(b * 10 + g)==i||(10 * q + s)*(g * 10 + b)==i
                   ||(10 * s + q)*(b * 10 + g)==i||(10 * s + q)*(g * 10 + b)==i
                   ||(10 * q + g)*(b * 10 + s)==i||(10 * q + g)*(s * 10 + b)==i
                   ||(10 * g + q)*(b * 10 + s)==i||(10 * g + q)*(s * 10 + b)==i
                        ){
                    System.out.println(i);
                }
            }
        }

    }
}
