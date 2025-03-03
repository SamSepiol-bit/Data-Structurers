
package arrayeg;

import java.util.ArrayList;


public class arrayListeg {
    
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<> ();
        cars.add("Toyota");
        cars.add("Mazda");
        cars.add("BMW");
        cars.add("Bens");
        
        System.out.println(cars);
        
        System.out.println(cars.get(0));
        System.out.println(cars.get(3));
        System.out.println(cars.get(2));
        
        //  change an item
        cars.set(2, "Honda");
        System.out.println(cars.get(2));
        System.out.println(cars);
        
        //  Remove an item
        cars.remove(0);
        System.out.println(cars);
        
        //  ArrayList Size
        int x = cars.size();
        System.out.println(x);
        
        //  Remove all the element
        cars.clear();
        System.out.println(cars);
    }
    
}
