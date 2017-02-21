/**
 * Created by startyaya on 2/2/17.
 */
public class E13 {
    private void Character(String a,String b ){
        if(a.equals(b)){
            System.out.println("a=b");
        }else if(a!=b){
            System.out.println("a!=b");
        }
    }
    public static void main(String[] args){
        E13 i = new E13();
        i.Character("abc","abc");
    }
}
