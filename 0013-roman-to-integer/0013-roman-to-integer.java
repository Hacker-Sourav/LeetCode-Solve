class Solution {
    public int romanToInt(String s) {
        int num=0;
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case 'I': num += (i+1<s.length()&&(s.charAt(i+1)=='V'||s.charAt(i+1)=='X'))? -1:1;
                            break;
                case 'V': num += 5;
                            break;
                case 'X': num += (i+1<s.length()&&(s.charAt(i+1)=='L'||s.charAt(i+1)=='C'))? -10:10;
                            break;
                case 'L': num += 50;
                            break;
                case 'C': num += (i+1<s.length()&&(s.charAt(i+1)=='D'||s.charAt(i+1)=='M'))? -100:100;
                            break;
                case 'D': num += 500;
                            break;
                case 'M': num += 1000;
                            break;
            }
        }
        return num;
    }
}