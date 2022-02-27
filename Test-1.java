import java.util.*;

public class Test {
    public static void main(String[] args){
        //create list
        ArrayList<CarbonFootprint> cfp = new ArrayList<CarbonFootprint>();
        Building b1 = new Building(2500.00);
        Building b2 = new Building(1500.00);
        Car c1 = new Car(10);
        Car c2 = new Car(20);
        Bicycle bicycle1 = new Bicycle("Road");
        Bicycle bicycle2 = new Bicycle("Mountain");
        //add object into list
        cfp.add(b1);cfp.add(b2);
        cfp.add(c1);cfp.add(c2);
        cfp.add(bicycle1);cfp.add(bicycle2);
        //iterate through list
        Iterator<CarbonFootprint> iterator = cfp.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}
