/**
 * Created by startyaya on 2/4/17.
 */
public class TerminationCondition {
    public static void main(String[] args){
        Book novel = new Book(true);
        novel.checkIn();
        new Book(true);
        System.gc();
        new Book(true);
        System.gc();
    }
}
