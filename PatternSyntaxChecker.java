/*
Input Format: The first line of input contains an integer N, denoting the number of test cases. 
The next N lines contains a string of  any printable characters representing the pattern of a regex.


Output Format: 
For each test case ,print valid if the syntax of the given pattern is correct. Otherwise, print Invalid.
Do not print the quotes.

Sample Input: 
3
([A-Z](.+)[AZ[a-z](a-z)
batchtpat (nat
*/
import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
          	try{
                  Pattern p = Pattern.compile(pattern);
                  System.out.println("Valid");
              }catch(Exception e){
                  System.out.println("Invalid");
              }
              testCases--;
		}
	}
}




