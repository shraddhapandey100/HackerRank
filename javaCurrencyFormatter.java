/*

Input Format: A single double-precision number denoting payment.

Constraints : 0<= payment<= 10^9


Output Format : On the first line, print US:u where u is payment formatted for US currency.
On the second line, print India: i where i is payment formatted for India currency.
On the third line, print China: c where c is payment formatted for chinese currency.
On the fourth line, print France: f , where f is payment formatted for French currency.


Sample Input : 12324.134

Sample Output: 
US: $12,324.13
India: Rs.12,324.13
China: ￥12,324.13
France: 12 324,13 €

Explanation : Each line contains the value of payment formatted according to the four countrie's 
respective currencies.
*/


import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        // Write your code here.
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
