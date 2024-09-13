class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        // x ^ y ^ x = y...
        for(int i=1;i<arr.length;i++){
            arr[i]^=arr[i-1];
        }
        int l=queries.length;
        int[] ans=new int[l];
        for(int i=0;i<l;i++){
            int left=queries[i][0];
            int right=queries[i][1];
            if(left==0)
                ans[i]=arr[right];
            else
                ans[i]=arr[right]^arr[left-1];
        }
        return ans;
    }
}