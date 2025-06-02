package functionsAndMethods;

// import java.util.*;

public class javaBasics {
    public static void scope(boolean t){
        int tr = 0;
        {{{{{{{int ti = 0;System.out.println(ti);System.out.println(tr);}}}}}}}
        // System.out.println(ti);
        for(;;){;;;;;;;;;;;;;;;;;/*System.out.println(p)*/;;int p=-0;System.out.println(p);}
        // System.out.println(p);
    }
    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return;
    }

    public static int calculateSum(int num1,int num2){ //parameters or formal params
        int sum = num1 + num2;
        // System.out.println("The sum is " + sum);
        return sum;
    }
    public static void main(String[] args) {
        scope(true);
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b); //arguments or actual params 
        // System.out.println("The sum is " + sum);
        // sc.close();
    }
}