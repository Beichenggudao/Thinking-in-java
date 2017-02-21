/**
 * Created by startyaya on 2/4/17.
 */
//和 Main一起的
public class E12 {
    boolean isFull = false;
    String name ;
    E12(String name){
        this.name = name ;
    }
    void setEmpty(){
        isFull = false ;
    }
    void setFull(){
        isFull = true;
    }
    protected  void finalize(){
        if(!isFull){
            System.out.println(name + "清理");
        }
    }
}
