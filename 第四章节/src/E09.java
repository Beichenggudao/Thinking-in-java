import java.util.Scanner;

/**
 * Created by startyaya on 2/2/17.
 */
//斐波那契
public class E09 {
    public static void main(String[] args) {
        System.out.print("斐波那契位数：");
        Scanner sc = new Scanner(System.in);
        String i = sc.next();
        try {
            int j = Integer.parseInt(i);
            int fb[] = new int[j];
            if(j<=0){
                System.out.print("无效");
            }
            for(int k=0;k<fb.length;k++){
                fb[0] = fb[1] = 1;
                if(k<2) {
                    System.out.print(fb[k] + ",");
                }
                else {
                    fb[k] = fb[k-1] +fb[k-2];
                    System.out.print(fb[k] + ",");
                }
            }


        } catch (NumberFormatException e) {
            System.out.println("输入数字");
        }

    }
}
