package functionsAndMethods;

public class binaryToDecimal {
    public static int binToDecConverter(int n){
        int dec = 0,pow = 0,ld;
        while(n!=0){
            ld = n%10;
            dec = dec + (ld * 2^pow);
            n/=10;
            pow++;
        }
        return dec;
    }
    public static void main(String[] args) {
        System.out.println(binToDecConverter(101));
}
}
