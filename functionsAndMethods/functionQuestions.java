package functionsAndMethods;

import java.nio.channels.Pipe.SourceChannel;

public class functionQuestions {
    // Question 1 : Write a Java method to compute the average of three numbers..
    public static void avgOfThree(int n1,int n2, int n3){
        // int avg = functionsAndMethods.funtionOverloading.sum(n1, n2, n3)/3;
        int avg = (n1 + n2+ n3)/3;
        System.out.println("The Average of " + n1 + " , " + n2 +  " & " + n3 + " is " + avg);
    }
    public static void main(String[] args) {
        avgOfThree(10, 40, 340);
    }    


//     // Question 2 : Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method.
//     public static boolean isEven(int n){
//         if(n%2 != 0) return false ;
//         return true;
//     }
//     public static void main(String[] args) {
//         System.out.println(isEven(5));
//         // System.out.println(isEven(50));
//     }


        // // Question 3 : Write a Java program to check if a number is a palindrome in Java? ( 121 is a palindrome, 321 is not) A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321.
        // public static boolean isPalindrome(int n){
        //     String s = Integer.toString(n);
        //     int i = 0,j = s.length()-1;
        //     while(i<=s.length()/2){
        //         if(s.charAt(i)!= s.charAt(j)){
        //             return false;
        //         }
        //         i++;j--;
        //     }
        //     return true;
        // }
        // public static void main(String[] args) {
        //     System.out.println(isPalindrome(121));
        // }

        // // Question 4 : READ & CODE EXERCISE Search about(Google) & use the following methods of the Math class in Java: a. Math.min( ) b. Math.max( ) c. Math.sqrt( ) d. Math.pow( ) e. Math.avg( ) f. Math.abs( )

        // public static void mathMethods(int a,int b){
        //     System.out.println("min "+ Math.min(a, b));
        //     System.out.println("max "+ Math.max(a, b));
        //     System.out.println("sqrt " + (int)Math.sqrt(a));
        //     System.out.println("pow " + (int)Math.pow(a, b));
        //     System.out.println("abs " + Math.abs(a));
        // }
        // public static void main(String[] args) {
        //     mathMethods(4,6);
        // }

//         // Question 5 : Write a Java method to compute the sum of the digits in an integer.
//         public static int sumOfDigits(int n){
//             int sum = 0;
//             int num = n;
//             while(num>0){
//                 sum = sum + num % 10;
//                 num /= 10;
//             }
//             return sum;
//         }
//         public static void main(String[] args) {
//             System.out.println(sumOfDigits(8202));
//         }
}
//           ASSIGNMEBT COMPLETED SUCESSFULLY..............🙌🙌