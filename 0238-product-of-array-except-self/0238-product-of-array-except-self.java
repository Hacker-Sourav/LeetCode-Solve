class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n= nums.length;
        int[]result = new int[n];
        for(int i=0,leftProduct=1;i<n;i++){
            result[i]= leftProduct;
            leftProduct*=nums[i];
        } 

        for(int i=n-1,rightProduct=1;i>=0;i--){
            result[i]*=rightProduct;
            rightProduct*=nums[i];
        }
        return result;
        
    }
}