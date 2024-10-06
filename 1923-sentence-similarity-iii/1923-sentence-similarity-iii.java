public class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");
        
        // Ensure s1 is the smaller or equal length sentence
        if (s1.length > s2.length) {
            return areSentencesSimilar(sentence2, sentence1);
        }
        
        int i = 0; // Start index
        int j = 0; // End index
        
        // Match from the start
        while (i < s1.length && s1[i].equals(s2[i])) {
            i++;
        }
        
        // Match from the end
        while (i + j < s1.length && s1[s1.length - 1 - j].equals(s2[s2.length - 1 - j])) {
            j++;
        }
        
        // If all words of the shorter sentence were matched, return true
        return i + j >= s1.length;
    }
}
