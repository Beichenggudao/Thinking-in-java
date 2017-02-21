/**
 * Created by startyaya on 2/4/17.
 */
public class E10 {
    protected void finalize(){
        System.out.println("finalize");
    }
    public static void main(String[] args){
        new E10();
        System.gc();

    }
}
