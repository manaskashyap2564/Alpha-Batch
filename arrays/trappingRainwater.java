package arrays;

public class trappingRainwater {
    public static void main(String[] args) {
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1}; //0,1,0,2,1,0,1,3,2,1,2,1 //5,2,1,4,2,6,2,4
        System.out.println(trappedRainwater(height));
    }

    public static int trappedRainwater(int height[]){
        int wt = 0, n = height.length;
        int lmb[] = new int[n];
        int rmb[] = new int[n];

        lmb[0] = height[0];
        for (int i = 1; i < n; i++) {
            lmb[i] = Math.max(lmb[i-1],height[i]);
        }

        rmb[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rmb[i] = Math.max(height[i], rmb[i+1]);
        }

        for (int i = 0; i < n; i++) {
            int wtb = 0;
            wtb = Math.min(lmb[i], rmb[i]) - height[i];
            wt += wtb ;
        }
        return wt;
    }




    
    //Failed Approach to optimize above solution(rmb variable is not optimized for correct values)
    // public int trap(int[] height) {
    //     int wt = 0, n = height.length;

    //     int lmb = height[0], rmb = height[n-1];
    //     for (int i = 0; i < n; i++) {
    //         int wtb = 0;
    //         if(i == 0){
    //             lmb = height[0];
    //             rmb = height[n-1];
    //             wtb = Math.min(lmb, rmb) - height[0];
    //             wt += wtb ;
    //         }
    //         else{
    //             lmb = Math.max(lmb,height[i]);
    //             rmb = Math.max(height[n - 1 - i], rmb);
    //             wtb = Math.min(lmb, rmb) - height[i];
    //             wt += wtb ;
    //         }
    //     }
    //     return wt;
    // }


    // Pointer Approach (Brute Force)

    // public static int calculate(int height[], int st, int end){
    //     int value = 0, w = (height[end]>=height[st]) ? height[end] - (height[end] - height[st]) : height[st] - (height[st] - height[end]) , wd = 1;
    //     for (int i = st+1; i < end; i++) {
    //         value += (w - height[i]) * wd;
    //     }
    //     return value;
    // }
    // public static int trappedRainwater(int height[]){
    //     int total = 0, st = 0, mid = st + 1, end = mid + 1;
    //     for (int i = 0; i < height.length; i++) {
    //         if(height[mid]>=height[st]){
    //             st ++;mid++;end++;
    //         }
    //         if(height[mid]<height[st]){
    //             if (height[end]<height[mid] || height[end]<height[st]) {
    //                 end += 1;                    
    //             }
    //             if (height[end]>=height[st]) {
    //                 total = calculate(height,st,end);                    
    //             }
    //         }
    //     }
    //     return total;
    // }
}
