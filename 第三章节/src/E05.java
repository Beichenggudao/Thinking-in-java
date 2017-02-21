/**
 * Created by startyaya on 2/2/17.
 */
//比较 == 和equals
public class E05 {
    public static void main(String[] args) {
        Dog spot = new Dog();
        Dog scru = new Dog();
        Dog ssss = new Dog();
        spot.name=ssss.name="spot";
        System.out.print("Dog1: name: "+ spot.name );
        spot.says("Ruff");
        scru.name = "scru";
        System.out.print("Dog2: name: "+ scru.name );
        scru.says("Wurf");
        System.out.println(spot.name==ssss.name);
        System.out.println(spot.name.equals(ssss.name));
    }
}
