class Solution {
    public int minBitFlips(int start, int goal) {
        start = start ^ goal;
        int ans=0;
        while (start != 0) {
            // if (start % 2 == 1)
            //     ans++;
            // start /= 2;

            ans += start & 1;
            start >>= 1;
        }
        return ans;
    }
}