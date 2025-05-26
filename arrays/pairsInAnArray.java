package arrays;

public class pairsInAnArray {
    public static void printPairs(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("("  + arr[i] + "," + arr[j] + ") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[] = {1,12,31,3,45,65,54,46,5};
        printPairs(numbers);
    }
}
