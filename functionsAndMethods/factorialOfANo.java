package functionsAndMethods;

import java.util.*;
import java.math.*;

// 💡 Best Practice:
// int → use till 12! (safe)
// long → use till 20!
// BigInteger → use for anything above


public class factorialOfANo {
    public static int  factorial(int n){
        int fact = 1;
        if(n == 0){
            return 1;
        }
        for(int i = 1; i<=n;i++){
                fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt();
        int fact  = factorial(n);
        System.out.println("The factorial of " + n + " is " + fact);
        System.out.println("The factorial of " + 6 + " is " + factorial(6));
        // System.out.println(factorial(6));
        
        // Suggestion by ChatGPT for solving the problem of interger overflow for inputs >15 
        BigInteger facto = factorialAdvanced(n);
        System.out.println("The advanced factorial of " + n + " is " + facto); 
    }
    public static BigInteger  factorialAdvanced(int n){
        BigInteger facto = BigInteger.ONE;
        for(int i = 1; i<=n;i++){
            facto = facto.multiply(BigInteger.valueOf(i));
        }
        return facto;
    }
}
