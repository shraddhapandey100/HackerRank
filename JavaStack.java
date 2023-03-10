/*

Java Stack Hackerrank Solution 

Input Format

There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.

The part of the code that handles input operation is already provided in the editor.

Output Format

For each case, print 'true' if the string is balanced, 'false' otherwise.

Sample Input

{}()
({()})
{}(
[]

Sample Output

true
true
false
true

*/

import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            System.out.println(valid(input));
            //Complete the code
		}
		
	}
    static boolean valid(String s){
        Stack <Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
           char ch = s.charAt(i);
           if(ch == '(' || ch == '[' || ch == '{'){
               st.push(ch);
           } else if(st.isEmpty()){
               return false;
           }else{
               char top = st.pop();
               if((top == '(' && ch!= ')') || (top == '[' && ch!=']') || (top == '{' && ch!='}')){
                   return false;
               }
           }
        }
        return st.isEmpty();
    }
}
