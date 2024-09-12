class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] index={0,numbers.length-1};
        while(index[0]<index[1]){
            if(numbers[index[0]]+numbers[index[1]]>target) index[1]--;
            else if(numbers[index[0]]+numbers[index[1]]<target) index[0]++;
            else{
                index[0]++;
                index[1]++;
                return index;
            } 
        }
        return index;
    }
}