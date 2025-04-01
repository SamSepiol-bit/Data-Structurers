

package operation;

import java.util.Deque;
import java.util.LinkedList;

public class Qoperation {

    public static void main(String[] args) {
        // Initialize deque
        Deque<Integer> deque = new LinkedList<>();
        
        //Perform operations
        deque.addFirst(5);  //InsertFront(5)
        
        System.out.print("Final deque state: ");
        for (int val : deque) {
            System.out.print(val +" ");
        }
        
        deque.addFirst(12);//InsertFront
        System.out.print("\n"+ "Final deque state: ");
        for (int val : deque) {
            System.out.print(val+ " ");
        }
        deque.addLast(30);   //InsertRear(30)
        System.out.print("\n"+ "Final deque state: ");
        for (int val : deque) {
            System.out.print(val +" ");
        }
        
        deque.addLast(3);
        System.out.print("\n"+ "Final deque state: ");
        for (int val : deque) {
            System.out.print(val +" ");
        }
        deque.pollLast();//DeleteRear()
        System.out.print("\n"+ "Final deque state: ");
        for (int val : deque) {
            System.out.print(val +" ");
        }
        deque.pollFirst(); //Delete  First
        System.out.print("\n"+ "Final deque state: ");
        for (int val : deque) {
            System.out.print(val +" ");
        }
        
        deque.addFirst(4); //InsertFront(4)
        System.out.print("\n"+ "Final deque state: ");
        for (int val : deque) {
            System.out.print(val +" ");
        }
        deque.addLast(10); //InsertRear(10)
        System.out.print("\n"+ "Final deque state: ");
        for (int val : deque) {
            System.out.print(val +" ");
        }
        deque.pollLast(); //seleteRear()
        System.out.print("\n"+ "Final deque state: ");
        for (int val : deque) {
            System.out.print(val +" ");
        }
        deque.addLast(10);
        System.out.print("\n"+ "Final deque state: ");
        for (int val : deque) {
            System.out.print(val +" ");
        }
        
        deque.pollFirst();
        System.out.print("\n"+ "Final deque state: ");
        for (int val : deque) {
            System.out.print(val +" ");
        }
        
    }
    
}
