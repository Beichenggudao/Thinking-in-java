/**
 * Created by startyaya on 2/4/17.
 */
public class E09 {

    E09(String name){
        this(30);

        System.out.println("asdf: " + name);
    }
    E09(int age){

        System.out.println("age: " + age);
    }
    public static void main(String[] args){
        new E09("aries");
        new E09(20);

    }
}
