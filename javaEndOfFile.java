/*

Input Format : There are two lines of input. The first line contains B: the breadth of the parallelogram.
The next line contains H: The height of the parallelogram.

Constraints :
-100 <=B <= 100
-100 <= H <= 100


Output Format: 
If both values are greater than zero, then the main method must output the area of the parallegogram.

*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int i=1;
        while(scanner.hasNext()){
            String string = scanner.nextLine();
            System.out.println(i+" "+string);
            i++;
        }
    }
}
