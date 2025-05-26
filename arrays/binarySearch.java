package arrays;

public class binarySearch {
    public static int binSearch(int numbers[], int key){
        int low = 0,high = numbers.length -1;
        while(low<=high){
            int mid = low + (high - low) /2;
            if(key == numbers[mid]) return mid;
            if (key>numbers[mid]) low = mid+1 ;
            else high = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1,12,31,44,54,67,77,86,90};
        int key = 44;
        System.out.println(binSearch(numbers, key));

    }
}
