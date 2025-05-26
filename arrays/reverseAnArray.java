package arrays;

public class reverseAnArray {
    public static void reverseArray(int numbers[]){
        int start = 0, end = numbers.length -1;
        for (int i = 0; i < (numbers.length+1)/2; i++) {
            int temp = numbers[start];
            // System.out.print(start + " " + temp + " ");
            numbers[start]=numbers[end];
            numbers[end] = temp;
            start += 1;
            end -= 1;    
            // System.out.println(start + " " + temp);
        }
    }
    public static void main(String[] args) {
        int numbers[] = {12,4,32,35,356,5,65,50};
        reverseArray(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
