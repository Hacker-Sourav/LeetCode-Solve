class Solution {
    public boolean canJump(int[] nums) {
        int max=nums[0];
        int goal=nums.length-1;
        for(int i=0;i<goal;i++){
            if(i+nums[i]>max) max=i+nums[i];
            if(max>=goal) return true;
            if(max==i) return false;
        }
        return true;
    }
}