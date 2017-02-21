/**
 * Created by startyaya on 2/1/17.
 */
public class Pthree {
    String name;
    int age;
     void introduce(String name,int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String [] args) {
        Pthree a = new Pthree();
        a.name = "zhangsan";
        a.age  =20;
        System.out.println("my name si:"+a.name+",age is "+a.age);
    }
}
