package arrays;

public class linearSearch {
    // T.C. of linearSearch is O(n)....
    public static int linSearch(int numbers[], int target ){
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == target) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {1,3,4,7,8,9,12,33,445,8990};
        int tar = 9;
        int index = linSearch(num, tar);
        if(index == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("The index location of " + tar + " in array num[] is " +  index);
        }
    }
}
