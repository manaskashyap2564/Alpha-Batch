package arrays;

public class maxSubArraySum {

    // M1 -->> Brute Force
    public static int maxSum(int[] nums) {
        int msum = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length;i++){
            for(int j = i; j<nums.length;j++){
                int csum = 0;
                for(int k = i;k<=j;k++){
                    csum = csum + nums[k];
                }
                msum = Math.max(msum, csum);
            }
        }
        return msum;
    }

    // M2 -->> Prefix Sum
    public static int maxPSum(int[] nums) {
        int msum = Integer.MIN_VALUE;
        int parr[] = new int[nums.length];
        parr[0] = nums[0];
        for (int i = 1; i < parr.length; i++) {
            parr[i] = nums[i] + parr[i-1];
        }
        for(int i = 0; i<nums.length;i++){
            for(int j = i; j<nums.length;j++){
                int csum = 0 ;
                csum = i == 0 ? parr[j] :  parr[j] - parr[i-1];
                msum = Math.max(msum, csum);
            }
        }
        return msum;
    }
    
    // M1 -->> Kadane's Algorithm 
    public static int kadane(int nums[]){
        int msum = nums[0];
        int csum = 0;
        for (int i = 0; i < nums.length; i++) {
            csum = csum + nums[i];
            msum = Math.max(msum, csum);
            if (csum < 0)  csum = 0;
        }
        return msum;
    }
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4}; //-1,-2,-6,-3,-6,-4    //-2,1,-3,4,-1,2,1,-5,4
        System.out.println(kadane(nums));
    }
}
