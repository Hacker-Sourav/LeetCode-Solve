class Solution {
    public String reverseWords(String s) {
        String[] str=s.trim().split("\\s+");
        String ans="";
        for(String s1 : str) ans=s1+" "+ans;
        return ans.trim();
    }
}