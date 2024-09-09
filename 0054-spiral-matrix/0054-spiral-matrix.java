class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l= new ArrayList<>();

        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;
        while(true){
            // left to right...
            if(top>bottom)break;
            for(int k=left;k<=right;k++){
                l.add(matrix[top][k]);
            }
            top++;
            // top to bottom...
            if(left>right)break;
            for(int k=top;k<=bottom;k++){
                l.add(matrix[k][right]);
            }
            right--;
            // right to left...
            if(top>bottom)break;
            for(int k=right;k>=left;k--){
                l.add(matrix[bottom][k]);
            }
            bottom--;
            // bottom to top...

            if(left>right)break;
            for(int k=bottom;k>=top;k--){
                l.add(matrix[k][left]);
            }
            left++;
            // end of one spiral
        }
        return l;
    }
}