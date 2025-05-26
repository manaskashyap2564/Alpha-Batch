package arrays;

public class arrayArguments {
    public static void update(int marks[],int nonChangeable){
        nonChangeable = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] +=1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {23,32,44};
        int nonChangeable = 4;
        update(marks, nonChangeable);
        System.out.println(nonChangeable);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
