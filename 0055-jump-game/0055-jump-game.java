class Solution {
    public boolean canJump(int[] nums) {
        int step=1;
        for(int i=nums.length-2;i>=0;i--,step++){
            if(step<=nums[i])
                step=0;
        }
        return step==1;
    }
}