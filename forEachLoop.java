

package arrayeg;

import java.util.ArrayList;

public class forEachLoop {
    
    public static void main(String[] args) {
        ArrayList<String> bikes = new ArrayList<>();
        bikes.add("R1"); 
        bikes.add("S1000rr"); 
        bikes.add("Ducati"); 
        bikes.add("Honda"); 
        
           // Loop Thorugh an arrayList
        for (int i = 0; i < bikes.size(); i++) {
            System.out.println(bikes.get(i));
        }
        
        //  for-each Loop
        for(String i : bikes) {
            System.out.println(i);
        }
        
        ArrayList<Integer> myNumber = new ArrayList<Integer>();
        myNumber.add(10);
        myNumber.add(15);
        myNumber.add(20);
        myNumber.add(25);
        for (int i :myNumber) {
            System.out.println(i);
        }
    }
    
}
