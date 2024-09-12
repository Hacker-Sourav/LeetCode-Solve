class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] allow = new boolean [26];
        for(char a : allowed.toCharArray()){
            allow[a-'a']=true;
        }
        int ans=0;
        for(String s: words){
            ans++;
            for(char b:s.toCharArray()){
                if(allow[b-'a']==false){
                    ans--;
                    break;
                } 
            }
        }
        return ans;
    }
}