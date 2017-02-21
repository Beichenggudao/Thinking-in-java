/**
 * Created by startyaya on 2/4/17.
 */
// gc：强制进行终结动作
public class Main {
    public static void main(String[] args){
        E12 e1 = new E12("E1");
        E12 e2 = new E12("E2");
        E12 e3 = new E12("E3");
        e1.setFull();
        e2.setEmpty();
        e1 = null;
        e2 = null;
        e3 = null;
        System.gc();

    }
}
