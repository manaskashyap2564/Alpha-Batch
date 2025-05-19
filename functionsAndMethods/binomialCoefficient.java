package functionsAndMethods;

import java.util.*;

public class binomialCoefficient {
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
    public static int binomial(int n, int r){
        int coeff = factorial(n) / (factorial(r) * factorial(n-r));
        return coeff;
    }
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt();
        int r = Scanner.nextInt();
        System.out.println(binomial(n, r));
        
    }
}
