package functionsAndMethods;

public class decimalToBinary {
    public static void decToBin(int n){
        int bin = 0,pow = 0,rem;
        while(n>0){
            rem = n%2;
            bin= bin + rem *(int)Math.pow(10,pow);
            n/=2;
            pow++;
        }
        System.out.println(bin);
    }
    public static void main(String[] args) {
        decToBin(123);
    }
}
