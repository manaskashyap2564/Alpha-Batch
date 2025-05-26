package arrays;

public class smallestNumber {
    public static int findSmallest(int numbers[]){
        int largest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < largest) {
                largest = numbers[i];                
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[] = {34,5,7,24,64,54};
        System.out.println("Smallest value is : " + findSmallest(numbers));
    }    
}
