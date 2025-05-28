package arrays;

public class noOfSubArrays {
    public static void printSubArrays(int arr[]){
        int ts = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <=j; k++) {
                    System.out.print(arr[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println("-----------------");
        }       
        System.out.println("Total No. of subarrys is : " + ts);
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,6,7,8};
        printSubArrays(arr);
    }
}
