

/**
 * Created by startyaya on 2/1/17.
 */
public class E06 {
    static int test(int testval,int target){
        int begin = 10;
        int end   = 16;
        if(begin<testval&&testval<end) {
            System.out.println(testval + "在之间");
        }
            if (testval > target)
                return +1;
            else if (testval < target)
                return -1;
            else
                return 0;

    }
    public static void main(String[] args){
        System.out.println(test(5,10));
        System.out.println(test(20,15));
        System.out.println(test(15,15));


    }
}
