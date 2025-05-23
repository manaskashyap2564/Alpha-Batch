package functionsAndMethods;

public class checkPrime {
    // Optimizeed approach 

    public static boolean isPrimeOpt(int n){
        for (int i = 0; i <= Math.sqrt(n); i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
    // only for n>=2
    public static boolean isPrime(int n){
        // corner cases 
        // 2
        if(n==2){
            return true;
        }
        for (int i = 2; i <= n-1; i++) {
            if (n%i == 0) {
                return false;                
            }            
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrimeOpt(9));
        System.out.println(isPrimeOpt(19));
        // System.out.println(isPrime(9));
        // System.out.println(isPrime(19));
    }
}
