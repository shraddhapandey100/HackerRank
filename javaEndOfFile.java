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
    static Scanner scanner = new Scanner(System.in);
    static int B= scanner.nextInt();
    static int H =scanner.nextInt();
    static boolean flag = true;
    static{
        try{
            if(B <= 0 || H<=0 ){
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

