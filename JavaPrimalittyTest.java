
/*

A prime number is a natural number greater than 1 whose only positive divisor are 11 and itself.

Input Format

A single line containing an integer,  (the number to be checked).

Constraints

contains at most  digits.

Output Format

If  is a prime number, print prime; otherwise, print not prime.

*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        
        /*
        isProbablePrime :
        public boolean isProbablePrime(int capacity): Return true if this BigInteger is probably prime, false if it's definitely composite. If certainty is <=0 , 
        then it will return the true.
        
        Certainity: The higher the certainty number you pass, the more certain you can be, i.e. 100 means it's prime with probability 1- (1/2)^100, which is extremely close to 1.
        
        */
        
        Scanner scanner = new Scanner(System.in);
        BigInteger n = new BigInteger(scanner.nextLine());
        System.out.println(n.isProbablePrime(100)?"prime":"not prime");
        
        
        
    }
}
  
