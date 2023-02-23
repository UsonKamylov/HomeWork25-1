import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {


       Carr carr=new Carr(2018,"Honda Accord",1600000,"Blue");
       Carr carr2=new Carr(2019,"Toyota camry",2000000,"white");
       Carr carr3=new Carr(2020,"Mercedes e class",3000000,"Black");
       Car car=new Car(1,"AO47IB");
       Car car2=new Car(2,"AO723B");
       Car car3=new Car(3,"AO755B");

        Map<Car,Carr> map=new HashMap<>();
        map.put(car,carr);
        map.put(car2,carr2);
        map.put(car3,carr3);

        for (Map.Entry<Car,Carr> m:map.entrySet()){
            System.out.println(m.getKey()+":"+m.getValue());
        }




    }
}