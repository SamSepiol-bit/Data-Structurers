

package arrayeg;

public class forLoopArray {
    
    public static void main(String[] args) {
        int arr[] = {10,20,30,30,50,};
        int value = 30;
        boolean Found = true;
        
        // size of array
        System.out.println("size of array is " + arr.length);
        
        // how many  30 have an array
        int count = 0;
        for (int i=0; i < arr.length; i++) {
        
        if (arr[i] == 30){
            count = count+1;
        }
        
            
        
    } System.out.println("30 are found " + count +" Times.");
        
        //  i=0     2<5         1+1 = 2
        for (int i = 0; i < arr.length; i++) {
            //   arr[i] =30 ==30
            if(arr[i] == value) {
                Found = true;
                break;
            } else {
                Found = false;
            }
        } 
        if (Found) {
            System.out.println("Value found");
        } else {
            System.out.println("Value can't be found");
        }
    }
    
}
