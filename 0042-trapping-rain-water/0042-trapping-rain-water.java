class Solution {
    public int trap(int[] height) {
        // int left=height[0];
        // int cap=0;
        // int total=0;
        // for(int i=1;i<height.length;i++){
        //     if(height[i]>left){
        //         total+=cap;
        //         cap=0;
        //         left=height[i];
        //     }
        //     else
        //         cap+=left-height[i];
        // }
        // left=height[height.length-1];
        // cap=0;
        // for(int i=height.length-2;i>=0;i--){
        //     if(height[i]>=left){
        //         total+=cap;
        //         cap=0;
        //         left=height[i];
        //     }
        //     else
        //         cap+=left-height[i];
        // }
        // return total;

        // So, we can set 2 pointers left_max,right_max and check which side 
        // is greater,if one side is greater iterate on other side because at 
        // the min side the water will be filled at its limit. and iterate till 
        // pointer is lower than the other one.

        int i=0;
        int j=height.length-1;
        int left_max=height[i];
        int right_max=height[j];
        int sum=0;
        while (i<j){
            if(left_max <= right_max){
                sum+=(left_max-height[i]);
                i++;
                left_max=Math.max(left_max,height[i]);
            }
            else{
                sum+=(right_max-height[j]);
                j--;
                right_max=Math.max(right_max,height[j]);
            }
        }
        return sum;
    }
}