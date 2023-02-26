import java.util.*;

public class java1DArray {
    public static void main(String[] args) {
        /**
         * We have taken the input from the user.
         */
        Scanner scan = new Scanner(System.in);
        /**
         * Store the each element into variable n.
         */
        int n = scan.nextInt();
        /**
         * Make an array a of size n
         */
        int a[]= new int[n];
        for(int i=0; i<n; i++){
            /**
             * Store the each element into the array a.
             */
            a[i]= scan.nextInt();
        }
        scan.close();
    
    // Prints each sequential element in array a.
    for(int i=0; i<a.length; i++){
        System.out.println(a[i]);
        }
    }
    

}
