package arrays;

public class largestNumber {
    public static int findLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];                
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {34,5,7,24,64,54};
        System.out.println("Largest value is : " + findLargest(numbers));
    }    
}
