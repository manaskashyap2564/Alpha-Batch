package functionsAndMethods;

public class callByValue {
    public static void swap(int a ,int b){
        // swap
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {
        // swap - exchanging the values
        int a = 5;
        int b = 10;
        swap(a, b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
