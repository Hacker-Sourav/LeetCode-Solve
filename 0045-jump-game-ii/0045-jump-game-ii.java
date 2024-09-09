class Solution {
    public int jump(int[] nums) {
        int step=0;
        int lower=0;
        int upper=0;
        /*int goal=nums.length-1;
        while(true){
            if(upper>=goal) return step;
            step++;
            int max=0;
            for( ;lower<=upper;lower++){
                if(lower+nums[lower]>max) max=lower+nums[lower];
            }
            if(max<upper) break;
            upper=max;
        }
        return 0; */

        for(int i=0;i<nums.length-1;i++){
            if(upper<i+nums[i]) upper=i+nums[i];
            if(i==lower){
                lower=upper;
                step++;
            }
        }
        return step;
    }
}