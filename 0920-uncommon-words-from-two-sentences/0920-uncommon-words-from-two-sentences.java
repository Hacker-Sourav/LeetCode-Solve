class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        // Create a map to store the word counts
        Map<String, Integer> wordCount = new HashMap<>();
        
        // Split the string into words
        // Count the occurrences of each word
        for (String word : s1.split(" ")) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        for (String word : s2.split(" ")) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        
        // Create a list to store the uncommon words (those with a count of 1)
        List<String> result = new ArrayList<>();
        
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }
        }
        
        return result.toArray(new String[0]);
    }
}