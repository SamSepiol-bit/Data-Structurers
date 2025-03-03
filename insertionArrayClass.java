
package arrayeg;


public class insertionArrayClass {
    
    public static void main(String[] args) {
        int arr[] = new int [3];
            // i = 0    3<3             2+1=3
        for (int i = 0; i<arr.length; i++) {
            
            arr[i] = i+1;   //arr[2]=2+1=3
                //arr[0]=1 arr[1]=2 arr[2]=3
        }
        for (int x = 0; x <arr.length; x++) {
            System.out.println("arr[" + x + "]" + "="+ arr[x]);
        }
    }
    
}
