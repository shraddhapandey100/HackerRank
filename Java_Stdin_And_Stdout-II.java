/*


Input Format:
There are three lines of input:
1.) The first line contains an integer.
2.) The second line contains a double.
3.) The third line contains a string.

Output Format:

There are three lines of output:
1.) On the first line, print String: follwed by the unaltered String read from stdin.
2.) On the second line, print Double: follwed by the unaltered double read from stdin.
3.) On the third line , print Int: follwed by unaltered integer read from stdin.

Note: If you use the nextLine() method immediately following the nextInt() method, recall that 
nextInt() reads integer tokens; because of this, the last newline character for that line of integer
input is still queued in the input buffer and the next nextLine() will be reading the remainder of 
the integer line (which is empty).


*/


import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
